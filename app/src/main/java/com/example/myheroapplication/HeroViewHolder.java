package com.example.myheroapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.jar.Attributes;

public class HeroViewHolder extends RecyclerView.ViewHolder {

    public TextView name, shortDesc, longDesc;
    public ImageView heroImage;
    public CardView cardView;

    public HeroViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name_of_hero);
        shortDesc = itemView.findViewById(R.id.short_description);
        longDesc = itemView.findViewById(R.id.long_description);
        heroImage = itemView.findViewById(R.id.imageView);
        cardView = itemView.findViewById(R.id.details_of_heroes);



    }
}
