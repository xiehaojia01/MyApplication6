package com.example.xiehaojia_20171219.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.xiehaojia_20171219.R;
import com.example.xiehaojia_20171219.bean.CartBean;
import com.example.xiehaojia_20171219.eventbusevent.MessageEvent;
import com.example.xiehaojia_20171219.eventbusevent.PriceAndCountEvent;
import com.facebook.drawee.view.SimpleDraweeView;
import org.greenrobot.eventbus.EventBus;

import java.util.List;

public class Rlv_Adapter extends RecyclerView.Adapter<Rlv_Adapter.MyViewHodler> {
    private Context context;
    private List<CartBean.DataBean.ListBean> list;


    public Rlv_Adapter(Context context, List<CartBean.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rlv, null);
        return new MyViewHodler(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHodler holder, final int position) {
        final CartBean.DataBean.ListBean listBean = list.get(position);
        holder.mBoxCart.setChecked(listBean.isCheck());
        holder.mGoodnameCart.setText(listBean.getTitle());
        holder.mGoodpriceCart.setText(listBean.getPrice() + "");
        holder.mNumCart.setText(listBean.getNum() + "");

        String[] split = listBean.getImages().split("\\|");
        holder.mShopIvCart.setImageURI(split[0]);

        holder.mBoxCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = holder.mBoxCart.isChecked();
                listBean.setCheck(checked);
                boolean checkBox = selsectAllCheckBox();
                changeAllCbState(checkBox);
                PriceAndCountEvent priceAndCountEvent = compute();
                EventBus.getDefault().post(priceAndCountEvent);
                notifyDataSetChanged();
            }
        });
        //加号的点击监听
        holder.mJiaCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //现获取当前的数量
                int num = listBean.getNum();
                //数量加1后显示在界面
                holder.mNumCart.setText(++num + "");
                //把数量存进对象
                listBean.setNum(num);
                //获取当前子条目的复选框的选中状态
                if (holder.mBoxCart.isChecked()) {
                    ////当前的复选框为选中状态使  改变总数和总价
                    PriceAndCountEvent priceAndCountEvent = compute();
                    EventBus.getDefault().post(priceAndCountEvent);
                }
            }
        });
        //减号的点击监听
        holder.mJianCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取当前的数量
                int num = listBean.getNum();
                //当前的数量为1时  直接返回
                if (num == 1) {
                    return;
                }
                //改变当前的数量显示
                holder.mNumCart.setText(--num + "");
                //把当前的数量存进对象
                listBean.setNum(num);
                //获取当前子条目的复选框的选中状态
                if (holder.mBoxCart.isChecked()) {
                    ////当前的复选框为选中状态使  改变总数和总价
                    PriceAndCountEvent priceAndCountEvent = compute();
                    EventBus.getDefault().post(priceAndCountEvent);
                }
            }
        });
        //子条目删除的点击监听
        holder.mDelectCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //删除子条目对用的数据
                list.remove(position);
                //修改总数和总价
                EventBus.getDefault().post(compute());
                //刷新适配器
                notifyDataSetChanged();
            }
        });
    }
    /**
     * 改变全选Box的状态
     */
    private void changeAllCbState(boolean flag) {
        MessageEvent messageEvent = new MessageEvent();
        messageEvent.setChecked(flag);
        EventBus.getDefault().post(messageEvent);
    }

    /**
     * 计算列表中，选中的钱和数量
     */
    private PriceAndCountEvent compute() {
        int count = 0;
        int price = 0;
        //遍历子条目集合
        for (int i = 0; i < list.size(); i++) {
            CartBean.DataBean.ListBean listBean = list.get(i);
            //判断当前子条目是否被选中
            if (listBean.isCheck()) {
                //选中则增加价钱和数量
                price += listBean.getNum() * listBean.getPrice();
                count += listBean.getNum();
            }
        }
        //实例化一个对象  返回
        return new PriceAndCountEvent(price, count);
    }

    /**
     * 遍历集合，查询是否全选
     */
    private boolean selsectAllCheckBox() {
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).isCheck()) {
                return false;
            }
        }
        return true;
    }

    /**
     * 设置全选、反选
     */
    public void changeAllListCbState(boolean flag) {
        //遍历组的集合
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setCheck(flag);
        }
        //返回总数量，总价钱
        EventBus.getDefault().post(compute());
        //刷新
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHodler extends RecyclerView.ViewHolder {
        private CheckBox mBoxCart;
        private SimpleDraweeView mShopIvCart;
        private TextView mDelectCart;
        private TextView mGoodnameCart;
        private TextView mGoodpriceCart;
        private ImageView mJianCart;
        private TextView mNumCart;
        private ImageView mJiaCart;

        public MyViewHodler(View itemView) {
            super(itemView);
            mBoxCart = itemView.findViewById(R.id.cart_box);
            mShopIvCart = itemView.findViewById(R.id.cart_shopIv);
            mDelectCart = itemView.findViewById(R.id.cart_delect);
            mGoodnameCart = itemView.findViewById(R.id.cart_goodname);
            mGoodpriceCart = itemView.findViewById(R.id.cart_goodprice);
            mJianCart = itemView.findViewById(R.id.cart_jian);
            mNumCart = itemView.findViewById(R.id.cart_num);
            mJiaCart = itemView.findViewById(R.id.cart_jia);
        }
    }
}
