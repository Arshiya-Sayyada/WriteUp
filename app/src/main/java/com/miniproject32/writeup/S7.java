package com.miniproject32.writeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class S7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desp_frag);

        ImageView imageView=(ImageView) findViewById(R.id.imgbut);
        Glide.with(this).load(R.drawable.a).into(imageView);

        TextView textView =(TextView) findViewById(R.id.desp);
        textView.setText(R.string.S7_desp);

        Button button = (Button) findViewById(R.id.but);
        button.setText(R.string.next);
    }

    public void nextScreen(View view){
        Intent intent = new Intent(S7.this,S8.class);
        startActivity(intent);
    }
}
