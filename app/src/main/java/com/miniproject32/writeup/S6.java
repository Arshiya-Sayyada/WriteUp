package com.miniproject32.writeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class S6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagebutton_frag);

        ImageView imageView = (ImageView) findViewById(R.id.imgbut);
        //give screen2 image link below in load()
        Glide.with(this).load(R.drawable.a).into(imageView);
        Button button_s6 = (Button) findViewById(R.id.but);
        //if button image changes are there, put a drawable in imagebutton_frag.xml
        button_s6.setText(R.string.next);
    }

    public void nextScreen(View view){
        Intent intent = new Intent(S6.this,S7.class);
        startActivity(intent);
    }
}

