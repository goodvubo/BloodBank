package com.uiu.ac.bd.bloodbank.adapter;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uiu.ac.bd.bloodbank.R;
import com.uiu.ac.bd.bloodbank.model.Sample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by  Hasan Sonet on 11/24/2018
 */
public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.ViewHolder> {

    private List<Sample> arrayList = new ArrayList<>();
    private List<Integer> backList = new ArrayList<>();

    private Context context;
    private int lastPosition = -1;

    public SampleAdapter(Context context, List<Sample> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public SampleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.demo, parent, false);

        // add here

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            holder.gradack.setBackground(context.getDrawable(backList.get(ThreadLocalRandom.current().nextInt(0, 3))));
        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        View container;
        View gradack;


        public ViewHolder(View itemView) {
            super(itemView);

            // bind here


        }
    }
// For animation
/*    private void setAnimation(View viewToAnimate, int position) {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.slide_up);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }*/
}