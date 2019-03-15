package com.example.galeria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public ArrayList<Integer> lista = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista.add(R.drawable.image1);
        lista.add(R.drawable.image2);
        lista.add(R.drawable.image3);

        ImageView v1 = findViewById(R.id.image1);
        ImageView v2 = findViewById(R.id.image2);
        ImageView v3 = findViewById(R.id.image3);
        ImageView v4 = findViewById(R.id.image4);
        ImageView v5 = findViewById(R.id.image5);
        ImageView v6 = findViewById(R.id.image6);
        ImageView v7 = findViewById(R.id.image7);
        ImageView v8 = findViewById(R.id.image8);
        ImageView v9 = findViewById(R.id.image9);
        ImageView v10 = findViewById(R.id.image10);
        ImageView v11 = findViewById(R.id.image11);
        ImageView v12 = findViewById(R.id.image12);
        ImageView v13 = findViewById(R.id.image13);
        ImageView v14 = findViewById(R.id.image14);
        ImageView v15 = findViewById(R.id.image15);

        v1.setOnClickListener(this);
        v2.setOnClickListener(this);
        v3.setOnClickListener(this);
        v4.setOnClickListener(this);
        v5.setOnClickListener(this);
        v6.setOnClickListener(this);
        v7.setOnClickListener(this);
        v8.setOnClickListener(this);
        v9.setOnClickListener(this);
        v10.setOnClickListener(this);
        v11.setOnClickListener(this);
        v12.setOnClickListener(this);
        v13.setOnClickListener(this);
        v14.setOnClickListener(this);
        v15.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageView image = findViewById(v.getId());
        int num = (int) ((Math.random() * 3));
        image.setImageResource(lista.get(num));
    }
}
