package com.miniproject32.writeup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by USER on 4/1/2017.
 */

public class ImageButtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.imagebutton_frag,container,false);
        ImageView image = (ImageView) v.findViewById(R.id.imgbut);
        Glide.with(getActivity()).load(getArguments().getString("img_res")).into(image);
        Button button =(Button) v.findViewById(R.id.but);
        button.setText(getArguments().getString("button_text"));

        return v;
    }

    public static ImageFragment newInstance(String source,String text) {
        ImageFragment f =new ImageFragment();
        Bundle b =new Bundle();
        b.putString("img_res",source);
        b.putString("button_text",text);
        f.setArguments(b);
        return f;
    }
}
