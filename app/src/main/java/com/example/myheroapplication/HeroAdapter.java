package com.example.myheroapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroViewHolder> {

    private List<HeroModel> list;
    private Context context;
    private SelectHeroListener listener;

    public HeroAdapter(Context context, List<HeroModel> list, SelectHeroListener listener) {
        this.context = context;
        this.list = list;
        this.listener=listener;
    }

    @NonNull
    @Override
    public HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new HeroViewHolder(LayoutInflater.from(context).inflate(R.layout.cards_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HeroViewHolder holder, int position) {

        holder.name.setText(list.get(position).getName());
        holder.heroImage.setImageResource(list.get(position).getImage());
        holder.shortDesc.setText(list.get(position).getShortDesc());
        holder.longDesc.setText(list.get(position).getLongDesc());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onHeroClick(list.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
