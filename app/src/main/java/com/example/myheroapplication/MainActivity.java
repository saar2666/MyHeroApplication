package com.example.myheroapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectHeroListener{
    RecyclerView recyclerView;
    List <HeroModel> datalist;
    HeroAdapter heroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroesList();

    }

    private void heroesList() {
        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

        datalist = new ArrayList<>();

        for(int i=0 ; i<HeroData.heroName.length ; i++)
        {
            datalist.add(new HeroModel(
                    HeroData.heroName[i],
                    HeroData.shortDescription[i],
                    HeroData.longDescription[i],
                    HeroData.heroImage[i]
            ));
        }

        heroAdapter = new HeroAdapter(this, datalist, this);
        recyclerView.setAdapter(heroAdapter);

    }

    @Override
    public void onHeroClick(HeroModel heroModel) {
        //Toast.makeText(this, "You Clicked: " + heroModel.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, HeroFullInfo.class);
        intent.putExtra("heroImage", heroModel.getImage());
        intent.putExtra("longDesc", heroModel.getLongDesc());
        intent.putExtra("heroName", heroModel.getName());
        startActivity(intent);
    }
}