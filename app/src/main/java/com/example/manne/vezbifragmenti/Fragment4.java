package com.example.manne.vezbifragmenti;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by manne on 10.12.2017.
 */

public class Fragment4 extends Fragment{
    @BindView(R.id.button4)
    Button button4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4, null);
        return view;
    }

    @OnClick(R.id.button4)
    public void buttonClick(View view){
        ((MainActivity)getActivity()).pager.setCurrentItem(0);

    }
}
