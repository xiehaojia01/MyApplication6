package com.example.xiehaojia_20171204.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xiehaojia_20171204.R;
import com.example.xiehaojia_20171204.bean.Bean;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by 解浩佳 on 2017/12/4.
 * 多条目适配器
 */

public class NewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
    Context context;
    Bean javaBean;

    public NewAdapter(Context context, Bean javaBean) {
        this.context = context;
        this.javaBean = javaBean;
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return 0;
        }
        return 1;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = View.inflate(context, R.layout.item, null);
            MyHodler myHodler = new MyHodler(view);
            return myHodler;
        } else {
            View view = View.inflate(context, R.layout.item2, null);
            MyHodler01 myHodler01 = new MyHodler01(view);
            return myHodler01;
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyHodler) {
            ((MyHodler) holder).tv1.setText(javaBean.getSong_list().get(position).getAuthor());

            ((MyHodler) holder).tv2.setText(javaBean.getSong_list().get(position).getAlbum_title());
            DraweeController dc = Fresco.newDraweeControllerBuilder()
                    .setUri(javaBean.getSong_list().get(position).getPic_s500())
                    .setAutoPlayAnimations(true)
                    .build();
            ((MyHodler) holder).img.setController(dc);

        } else {
            ((MyHodler01) holder).tv1.setText(javaBean.getSong_list().get(position).getAuthor());
            ((MyHodler01) holder).tv2.setText(javaBean.getSong_list().get(position).getAlbum_title());
            DraweeController dc = Fresco.newDraweeControllerBuilder()
                    .setUri(javaBean.getSong_list().get(position).getPic_s500())
                    .setAutoPlayAnimations(true)
                    .build();
            ((MyHodler01) holder).img.setController(dc);
        }
    }

    @Override
    public int getItemCount() {
        return javaBean.getSong_list().size();
    }
    class MyHodler extends RecyclerView.ViewHolder {

        private final SimpleDraweeView img;
        private final TextView tv1, tv2;

        public MyHodler(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
        }
    }

    class MyHodler01 extends RecyclerView.ViewHolder {

        private final SimpleDraweeView img;
        private final TextView tv1, tv2;

        public MyHodler01(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
        }
    }
}