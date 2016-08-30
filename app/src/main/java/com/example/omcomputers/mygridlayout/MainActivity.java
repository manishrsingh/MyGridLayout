package com.example.omcomputers.mygridlayout;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
GridLayout gd;
    RelativeLayout R1,R2,R3,R4,R5,R6;
    ImageView IV1,IV2,IV3,IV4,IV5,IV6;
    TextView tv;
    Button B1,B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       gd=(GridLayout)findViewById(R.id.gl);
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics ();
        display.getMetrics(outMetrics);

        float dpHeight = outMetrics.heightPixels;
        float dpWidth  = outMetrics.widthPixels;
        R1=(RelativeLayout)findViewById(R.id.rl1);
        //R1.setWidth((int) dpWidth);
        R2=(RelativeLayout)findViewById(R.id.rl2);
        R3=(RelativeLayout)findViewById(R.id.rl3);
        R4=(RelativeLayout)findViewById(R.id.rl4);
        R5=(RelativeLayout)findViewById(R.id.rl5);
        R6=(RelativeLayout)findViewById(R.id.rl6);

        Toolbar t=(Toolbar)findViewById(R.id.toolbar);

        int h=t.getHeight();
        //B2.setWidth((int) dpWidth);
     int statusBarHeight = 0;
     int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
     if (resourceId > 0) {
      statusBarHeight = getResources().getDimensionPixelSize(resourceId);
     }
        //Log.d("height and width", Float.toString(dpHeight) + " " + statusBarHeight );

        ViewGroup.LayoutParams p=R1.getLayoutParams();
        p.width=((int)dpWidth/2);
        p.height=(p.width-40);
        R1.setLayoutParams(p);
        R1.setBackgroundColor(Color.BLUE);
        R1.setBackgroundResource(R.drawable.border);

        ViewGroup.LayoutParams p1=R2.getLayoutParams();
        p1.width=((int)dpWidth/2);
        p1.height=(p.width-40);
        R2.setLayoutParams(p1);
        R2.setBackgroundColor(Color.MAGENTA);
        R2.setBackgroundResource(R.drawable.border1);

        ViewGroup.LayoutParams p2=R3.getLayoutParams();
        p2.width=((int)dpWidth/2);
        p2.height=(p.width-40);
        R3.setLayoutParams(p2);
        R3.setBackgroundColor(Color.MAGENTA);
        R3.setBackgroundResource(R.drawable.border3);

        ViewGroup.LayoutParams p3=R4.getLayoutParams();
        p3.width=((int)dpWidth/2);
        p3.height=(p.width-40);
        R4.setLayoutParams(p3);
        R4.setBackgroundColor(Color.BLUE);
        R4.setBackgroundResource(R.drawable.border2);

        ViewGroup.LayoutParams p4=R5.getLayoutParams();
        p4.width=((int)dpWidth/2);
        p4.height=(p.width-40);
        R5.setLayoutParams(p4);
        R5.setBackgroundColor(Color.BLUE);
        R5.setBackgroundResource(R.drawable.border4);

        ViewGroup.LayoutParams p5=R6.getLayoutParams();
        p5.width=((int)dpWidth/2);
        p5.height=(p.width-40);
        R6.setLayoutParams(p5);
        R6.setBackgroundColor(Color.MAGENTA);
        R6.setBackgroundResource(R.drawable.border5);

        IV1=(ImageView)findViewById(R.id.iv1);
        IV2=(ImageView)findViewById(R.id.iv2);
        IV3=(ImageView)findViewById(R.id.iv3);
        IV4=(ImageView)findViewById(R.id.iv4);
        IV5=(ImageView)findViewById(R.id.iv5);
        IV6=(ImageView)findViewById(R.id.iv6);

        IV1.setBackgroundResource(R.drawable.presentation_board_with_graph);
        IV2.setBackgroundResource(R.drawable.idea);
        IV3.setBackgroundResource(R.drawable.icon);
        IV4.setBackgroundResource(R.drawable.binary_data_search_symbol);
        IV5.setBackgroundResource(R.drawable.management);
        IV6.setBackgroundResource(R.drawable.management_1);

        B1=(Button)findViewById(R.id.button1);
        B2=(Button)findViewById(R.id.button2);

        B1.setWidth((int)dpWidth/2);
        B2.setWidth((int)dpWidth/2);

    }


}
