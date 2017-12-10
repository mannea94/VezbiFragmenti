package com.example.manne.vezbifragmenti;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by manne on 10.12.2017.
 */

public class Fragment2 extends Fragment {
    @BindView(R.id.button)
    Button button;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, null);
        return view;
    }

    @OnClick(R.id.button)
    public void buttonClick(View view){
        ((MainActivity)getActivity()).pager.setCurrentItem(2);
    }



}
