package com.example.xiehaojia_20171219;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.xiehaojia_20171219.adapter.Rlv_Adapter;
import com.example.xiehaojia_20171219.bean.CartBean;
import com.example.xiehaojia_20171219.eventbusevent.MessageEvent;
import com.example.xiehaojia_20171219.eventbusevent.PriceAndCountEvent;
import com.example.xiehaojia_20171219.presenter.ShopCart_P;
import com.example.xiehaojia_20171219.view.IShopCart_V;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, IShopCart_V {

    private CheckBox mFootBoxCart;
    private TextView mFootTotalPriceCart;
    private TextView mFootTotalCountCart;
    private List<CartBean.DataBean.ListBean> list;
    private RecyclerView mRlvMain;
    private Rlv_Adapter adapter;
    ShopCart_P shopCartP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        initView();
        mFootBoxCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.changeAllListCbState(mFootBoxCart.isChecked());
            }
        });
    }

    private void initView() {
        list = new ArrayList<>();
        mFootBoxCart = (CheckBox) findViewById(R.id.cart_foot_box);
        mFootBoxCart.setOnClickListener(this);
        mFootTotalPriceCart = (TextView) findViewById(R.id.cart_foot_totalPrice);
        mFootTotalCountCart = (TextView) findViewById(R.id.cart_foot_totalCount);
        mRlvMain = (RecyclerView) findViewById(R.id.main_rlv);
        mRlvMain.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        shopCartP= new ShopCart_P(this);
        shopCartP.doGetCartBean();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cart_foot_box:
                // TODO 17/11/20
                break;
            default:
                break;
        }
    }

    @Override
    public void setCartBean(final CartBean cartBean) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //获取数据
                List<CartBean.DataBean> data = cartBean.getData();
                for (int i = 0; i < data.size(); i++) {
                    List<CartBean.DataBean.ListBean> listBeen = data.get(i).getList();
                    for (int j = 0; j < listBeen.size(); j++) {
                        list.add(listBeen.get(j));
                    }
                }
                adapter = new Rlv_Adapter(MainActivity.this, list);
                mRlvMain.setAdapter(adapter);
            }
        });

    }

    @Subscribe
    public void onMessageEvent(MessageEvent event) {
        mFootBoxCart.setChecked(event.isChecked());
    }

    @Subscribe
    public void onMessageEvent(PriceAndCountEvent event) {
        mFootTotalPriceCart.setText("合计￥" + event.getPrice());
        mFootTotalCountCart.setText("结算(" + event.getCount() + ")");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        shopCartP.detach();

    }
}