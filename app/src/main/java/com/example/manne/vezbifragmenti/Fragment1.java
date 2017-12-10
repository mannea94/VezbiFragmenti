package com.example.manne.vezbifragmenti;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by manne on 10.12.2017.
 */

public class Fragment1 extends Fragment{
    public Unbinder mUnBinder;
    @BindView(R.id.textView)
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, null);
        mUnBinder = ButterKnife.bind(this, view);
        textView.setText("This is fragment 1");
        return view;
    }

    @OnClick(R.id.button)
    public void buttonClick(){
        Toast.makeText(getActivity(), "toast Fragment 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnBinder.unbind();
    }
}
