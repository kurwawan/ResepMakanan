package com.example.user.resepmakanantugas1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by user on 01/10/2017.
 */

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepViewHolder>{
    private Context context;
    private ArrayList<Resep> resep;

    public ResepAdapter(Context context, ArrayList<Resep> resep) {
        this.context = context;
        this.resep = resep;
    }

    @Override
    public ResepAdapter.ResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_resep, parent, false);
        return new ResepViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ResepAdapter.ResepViewHolder holder, final int position) {
        holder.ztvResep.setText(resep.get(position).getNamaResep());
        holder.ztvDeskripsiResep.setText(resep.get(position).getDeskripsiResep());

        holder.ztvResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailResepActivity.class);
                i.putExtra("gambarResep",resep.get(position).getGambarResep());
                i.putExtra("detailResep",resep.get(position).getDetailResep());
                i.putExtra("titleBar",resep.get(position).getTitleBar());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return resep.size();
    }

    public class ResepViewHolder extends RecyclerView.ViewHolder {
        TextView ztvDeskripsiResep;
        TextView ztvResep;

        public ResepViewHolder(View itemView) {
            super(itemView);
            ztvDeskripsiResep = (TextView) itemView.findViewById(R.id.tvDeskripsiResep);
            ztvResep = (TextView) itemView.findViewById(R.id.tvNamaResep);
        }
    }
}
