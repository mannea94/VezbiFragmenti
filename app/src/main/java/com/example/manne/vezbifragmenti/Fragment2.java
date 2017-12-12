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

import static android.app.Activity.RESULT_OK;

/**
 * Created by manne on 10.12.2017.
 */

public class Fragment2 extends Fragment {
    @BindView(R.id.button2)
    Button button2;
    static int REQUEST_CODE=1000;
    String text;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, null);
        return view;
    }

    @OnClick(R.id.button2)
    public void buttonClick(View view){
        ((MainActivity)getActivity()).pager.setCurrentItem(1);
        startActivity(new Intent(getActivity(), MainActivity2.class));
//        Intent intent = new Intent(getActivity(), MainActivity2.class);
//        String text="";
//        intent.putExtra("Text1", text);
//        startActivityForResult(intent, REQUEST_CODE);
    }

//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if(requestCode==REQUEST_CODE && resultCode==RESULT_OK){
//            if(data.hasExtra("Text")){
//                text=data.getExtras().toString();
//            }
//        }
//    }
}
