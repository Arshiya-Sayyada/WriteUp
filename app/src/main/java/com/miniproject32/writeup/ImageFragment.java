package com.miniproject32.writeup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by USER on 4/1/2017.
 */

public class ImageFragment extends Fragment {

    static String img_res;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.image_frag,container,false);
        ImageView image = (ImageView) v.findViewById(R.id.img);
        Glide.with(getActivity()).load(getArguments().getString(img_res)).into(image);

        return v;
    }

    public static ImageFragment newInstance(String source) {
        ImageFragment f =new ImageFragment();
        Bundle b =new Bundle();
        b.putString(img_res,source);
        f.setArguments(b);
        return f;
    }
}
