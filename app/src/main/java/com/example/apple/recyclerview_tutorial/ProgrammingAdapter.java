package com.example.apple.recyclerview_tutorial;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apple on 28/05/18.
 */

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewholder> {

    private String[] data;
    public  ProgrammingAdapter(String[] data)
    {
      this.data = data;
    }

    @NonNull
    @Override
    public ProgrammingViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view  = inflater.inflate(R.layout.list_item_view,parent,false);
        return new ProgrammingViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewholder holder, int position) {

        String title = data[position];
        holder.v.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewholder extends RecyclerView.ViewHolder {
        ImageView i;
        TextView v;
        public ProgrammingViewholder(View itemView) {
            super(itemView);

            i = itemView.findViewById(R.id.image_view);
            v = itemView.findViewById(R.id.textview);
        }
    }


}
