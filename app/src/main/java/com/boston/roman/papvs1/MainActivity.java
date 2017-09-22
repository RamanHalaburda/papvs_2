package com.boston.roman.papvs1;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnRed;
    Button btnGreen;
    Button btnBlue;
    TextView lbl;
    RelativeLayout l;
    Button btnImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRed = (Button) findViewById(R.id.btnRed);
        btnGreen = (Button) findViewById(R.id.btnGreen);
        btnBlue = (Button) findViewById(R.id.btnBlue);
        lbl = (TextView) findViewById(R.id.lbl);
        l = (RelativeLayout) findViewById(R.id.rel);
        btnImg = (Button) findViewById(R.id.btnImg);

        btnRed.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                l.setBackgroundColor(Color.RED);
                lbl.setText(R.string.hred);
                Log.d("logger", "set red");
                Toast.makeText(getApplication(), R.string.setr, Toast.LENGTH_SHORT).show();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                l.setBackgroundColor(Color.GREEN);
                lbl.setText(R.string.hgreen);
                Log.d("logger", "set green");
                Toast.makeText(getApplication(), R.string.setg, Toast.LENGTH_SHORT).show();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                l.setBackgroundColor(Color.BLUE);
                lbl.setText(R.string.hblue);
                Log.d("logger", "set blue");
                Toast.makeText(getApplication(), R.string.setb, Toast.LENGTH_SHORT).show();
            }
        });

        btnImg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //l.setBackgroundDrawable(getResources().getDrawable(R.drawable.danny));
                l.setBackgroundResource(R.drawable.danny);
                lbl.setText("Hello IMAGE");
                Log.d("logger", "set img");
                Toast.makeText(getApplication(), R.string.seti, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
