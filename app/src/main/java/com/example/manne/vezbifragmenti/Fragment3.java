package com.example.manne.vezbifragmenti;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by manne on 10.12.2017.
 */

public class Fragment3 extends Fragment {
    @BindView(R.id.imageView)
    ImageView imageView;
    Unbinder mUnBinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment3, null);
        mUnBinder = ButterKnife.bind(this, view);
        Picasso.with(getActivity())
                .load("https://vignette4.wikia.nocookie.net/readyplayerone/images/0/09/Rubik%27s_Cube.png/revision/latest?cb=20120905191549")
                .fit()
                .centerInside()
                .into(imageView);
        return view;
    }

    @OnClick(R.id.button)
    public void buttonClick(View view){
        ((MainActivity)getActivity()).pager.setCurrentItem(3);
    }
}
