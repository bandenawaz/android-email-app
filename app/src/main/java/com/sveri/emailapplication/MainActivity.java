package com.sveri.emailapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declaration
    EditText etEmail,etSubj,etBody;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialisation

        etEmail = findViewById(R.id.editTextEmailAddress);
        etSubj = findViewById(R.id.editTextSubject);
        etBody = findViewById(R.id.editTextBody);
        btnSend = findViewById(R.id.buttonSend);

        //handlers
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}