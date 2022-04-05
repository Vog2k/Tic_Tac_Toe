package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetUp extends AppCompatActivity {

    private EditText player1;
    private EditText player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_set_up);

        player1 =findViewById(R.id.editTextTextPersonName);
        player2 =findViewById(R.id.editTextTextPersonName2);
    }

    public void submitButtonClick (View view){

        String editTextTextPersonName = player1.getText().toString();
        String editTextTextPersonName2 = player2.getText().toString();

        Intent intent = new Intent(this, Gamedisplay.class);
        intent.putExtra("PLAYER_NAMES",new String[] {editTextTextPersonName, editTextTextPersonName2});
        startActivity(intent);

    }
}