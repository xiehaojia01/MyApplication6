package com.example.lenovo.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.myapplication.R;
import com.example.lenovo.myapplication.bean.Bean;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by Administrator on 2017/12/1.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {
    Context context;
    Bean bean;


    public Myadapter(Context context, Bean bean) {
        this.context = context;
        this.bean = bean;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item, null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv1.setText(bean.getSong_list().get(position).getAuthor());
        holder.tv2.setText(bean.getSong_list().get(position).getAlbum_title());
        DraweeController dc = Fresco.newDraweeControllerBuilder()
                .setUri(bean.getSong_list().get(position).getPic_s500())
                .setAutoPlayAnimations(true)
                .build();
        holder.img.setController(dc);
    }

    @Override
    public int getItemCount() {
        return bean.getSong_list().size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private final SimpleDraweeView img;
        private final TextView tv1,tv2;
        public MyViewHolder(View itemView) {
            super(itemView);
            img =  itemView.findViewById(R.id.img);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);

        }
    }

}
