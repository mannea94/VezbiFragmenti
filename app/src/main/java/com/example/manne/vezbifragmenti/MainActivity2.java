package com.example.manne.vezbifragmenti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity2 extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;
    String text="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

//        Intent intent = getIntent();
//        if(intent.hasExtra("Text1")){
//            text=intent.getStringExtra("Text1");
//        }



    }

    @OnClick(R.id.button)
    public void onClick(View view){
//        if(text!=null){
//            text="";
//        }
//        Intent intent = new Intent().putExtra("Text", text);
//        setResult(RESULT_OK, intent);
//        finish();
    }

}
