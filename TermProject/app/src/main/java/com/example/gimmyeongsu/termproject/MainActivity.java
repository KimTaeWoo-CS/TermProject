package com.example.gimmyeongsu.termproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private BackPressCloseHandler backPressCloseHandler;

    Button alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        backPressCloseHandler = new BackPressCloseHandler(this);
        alarm = (Button)findViewById(R.id.button_Alarm);


        alarm.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent alarm = new Intent(getApplicationContext(), AlarmActivity.class);
                startActivity(alarm);
            }
        });

    }


    public void onBackPressed(){
        backPressCloseHandler.onBackPressed();
    }

}
