package com.example.myheroapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HeroFullInfo extends AppCompatActivity {
    Button button;
    ImageView imageView;
    TextView longDesc;
    TextView heroName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_full_info);

        button = findViewById(R.id.back_button);
        imageView = findViewById(R.id.hero_image);
        longDesc = findViewById(R.id.hero_long_desc);
        heroName = findViewById(R.id.hero_name_info);

        Intent intent = getIntent();
        imageView.setImageResource(intent.getExtras().getInt("heroImage"));
        longDesc.setText(intent.getStringExtra("longDesc"));
        heroName.setText(intent.getStringExtra("heroName"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HeroFullInfo.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }


}
