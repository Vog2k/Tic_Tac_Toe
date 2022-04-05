package com.example.tic_tac_toe;

//Personal Discovery, When Wanting To Link A Page Theres A Simple Way To Achive This By Using The Drop Down Menu On The Design//

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButtonClick (View view){
        Intent intent = new Intent(this, PlayerSetUp.class);
        startActivity(intent);
    }


}