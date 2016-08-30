package com.example.omcomputers.mygridlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Notification extends AppCompatActivity {

    RelativeLayout R1;
    TextView t1,t2;
    ImageView iv1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        R1=(RelativeLayout)findViewById(R.id.layout);
        iv1=(ImageView)findViewById(R.id.notifimage);
        t1=(TextView)findViewById(R.id.notiftitle);
        t2=(TextView)findViewById(R.id.notiftext);


    }
}