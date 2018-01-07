package app.example.com.mapdemo.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import app.example.com.mapdemo.model.Model;

/**
 * Created by MS on 1/7/2018.
 */

public class PracticeAdapter extends RecyclerView.Adapter<PracticeAdapter.MyViewHolder> {


    ArrayList<Model> list;
    Activity activity;

    public PracticeAdapter(ArrayList<Model> list, Activity activity) {
        this.list = list;
        this.activity = activity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       // View view=activity.getLayoutInflater().inflate()
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
