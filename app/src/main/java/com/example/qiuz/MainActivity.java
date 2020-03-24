package com.example.qiuz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button enterNewActivityButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterNewActivityButton = (Button) findViewById(R.id.playButton);



        enterNewActivityButton.setOnClickListener(this);



    }

    public void onClick(View v) {


        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        startActivity(intent);
    }
}
