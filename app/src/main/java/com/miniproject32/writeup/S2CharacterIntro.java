package com.miniproject32.writeup;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import static com.miniproject32.writeup.R.drawable.a;
import static com.miniproject32.writeup.R.string.next;

public class S2CharacterIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagebutton_frag);

        ImageView imageView = (ImageView) findViewById(R.id.imgbut);
        //give screen2 image link below in load()
        Glide.with(this).load(R.drawable.a).into(imageView);
        Button button_s2 = (Button) findViewById(R.id.but);
        //if button image changes are there, put a drawable in imagebutton_frag.xml
        button_s2.setText(next);
    }

     public void nextScreen(View view){
         Intent intent = new Intent(S2CharacterIntro.this,S3Character.class);
         startActivity(intent);
     }
    //On clicking next button go to screen 3
    //We get to this screen from screen 1e's Let's Start button
}
