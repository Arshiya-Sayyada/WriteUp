package com.miniproject32.writeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class S5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s5);

        ImageView imageView = (ImageView) findViewById(R.id.imgS5);
        //here, insert drawable image resource for image
        Glide.with(this).load(R.drawable.a).into(imageView);
        Button button_s5a = (Button) findViewById(R.id.but1);
        button_s5a.setText(R.string.yes);
        Button button_s5b = (Button) findViewById(R.id.but2);
        button_s5b.setText(R.string.no);
    }

    public void prevScreen(View view) {
        Intent intent = new Intent(S5.this,S3Character.class);
        startActivity(intent);
    }
    public void nextScreen(View view){
        Intent intent = new Intent(S5.this,S6.class);
        startActivity(intent);
    }

}

