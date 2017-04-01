package com.miniproject32.writeup;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;



public class S1Intro extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1);

        ViewPager myPager = (ViewPager) findViewById(R.id.viewPager);
        myPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {
                case 0: return ImageFragment.newInstance("R.drawable.a");
                case 1: return ImageFragment.newInstance("R.drawable.a");
                case 2: return ImageFragment.newInstance("R.drawable.a");
                case 3: return ImageFragment.newInstance("R.drawable.a");
                case 4: return ImageButtonFragment.newInstance("R.drawable.a","NEXT");
                default: return ImageFragment.newInstance("R.drawable.a");
            }
        }
        @Override
        public int getCount() {
            return 5;
        }
    }

    public void nextScreen(View view){
        Intent intent = new Intent(S1Intro.this,S2CharacterIntro.class);
        startActivity(intent);
    }

    //This screen has 5 (a-e) swipable views
    //Screen1e has a button Let's Start, on clicking which we go to S2CharacterIntro
    //Screens 1a-1d and just UI

}
