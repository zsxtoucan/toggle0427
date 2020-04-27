package com.example.togg0427;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ImageView img_on,img_off;
    private ConstraintLayout conLayout;
    private ToggleButton togButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_on = findViewById(R.id.imageView2);
        img_off = findViewById(R.id.imageView);
        conLayout = findViewById(R.id.layout);
        togButton = findViewById(R.id.toggleButton);

        togButton.setOnCheckedChangeListener(this);
        conLayout.setBackgroundColor(Color.parseColor("#FFFF33"));
        img_off.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked) {
            conLayout.setBackgroundColor(Color.parseColor("#000000"));
            img_off.setVisibility(View.VISIBLE);
            img_on.setVisibility(View.INVISIBLE);

        }else{
            conLayout.setBackgroundColor(Color.parseColor("#FFFF33"));
            img_off.setVisibility(View.INVISIBLE);
            img_on.setVisibility(View.VISIBLE);
        }
    }
}

