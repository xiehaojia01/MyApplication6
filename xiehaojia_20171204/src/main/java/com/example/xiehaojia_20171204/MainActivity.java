package com.example.xiehaojia_20171204;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xiehaojia_20171204.adapter.Myadapter;
import com.example.xiehaojia_20171204.adapter.NewAdapter;
import com.example.xiehaojia_20171204.bean.Bean;
import com.example.xiehaojia_20171204.presenter.Persenter;
import com.example.xiehaojia_20171204.view.Iview;
import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 解浩佳
 * 2017-12-04
 * 主页面显示数据
 */
public class MainActivity extends AppCompatActivity   implements Iview  {

    RecyclerBanner pager;
    private List<RecyclerBanner.BannerEntity> urls = new ArrayList<>();

    @BindView(R.id.rv)
    RecyclerView rv;
    private Persenter pp;
    private Myadapter rvadapter;
    private NewAdapter newAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        pp=new Persenter(this,this);
        pp.getData();

        pager = (RecyclerBanner) findViewById(R.id.r);
        pager.setOnPagerClickListener(new RecyclerBanner.OnPagerClickListener() {
            @Override
            public void onClick(RecyclerBanner.BannerEntity entity) {
                Toast.makeText(MainActivity.this, entity.getUrl(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    int i;

    public void update(View v) {
        i++;
        urls.clear();
        if (i % 2 == 0) {
            urls.add(new Entity("http://pic.58pic.com/58pic/12/46/13/03B58PICXxE.jpg"));
            urls.add(new Entity("http://www.jitu5.com/uploads/allimg/121120/260529-121120232T546.jpg"));
            urls.add(new Entity("http://pic34.nipic.com/20131025/2531170_132447503000_2.jpg"));
            urls.add(new Entity("http://img5.imgtn.bdimg.com/it/u=3462610901,3870573928&fm=206&gp=0.jpg"));
        } else {
            urls.add(new Entity("http://img0.imgtn.bdimg.com/it/u=726278301,2143262223&fm=11&gp=0.jpg"));
            urls.add(new Entity("http://pic51.nipic.com/file/20141023/2531170_115622554000_2.jpg"));
            urls.add(new Entity("http://img3.imgtn.bdimg.com/it/u=2968209827,470106340&fm=21&gp=0.jpg"));
        }
        long t = System.currentTimeMillis();
        pager.setDatas(urls);
        Log.w("---", System.currentTimeMillis() - t + "");
    }


    private class Entity implements RecyclerBanner.BannerEntity {

        String url;

        public Entity(String url) {
            this.url = url;
        }

        @Override
        public String getUrl() {
            return url;
        }
    }

    @Override
    public void ShowView(Bean bean) {
        LinearLayoutManager manager=new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        rvadapter=new Myadapter(this,bean);
        newAdapter=new NewAdapter(this,bean);
        rv.setAdapter(newAdapter);

    }
}
