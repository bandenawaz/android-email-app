package com.sveri.emailapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

                //Lets get the text from the text boxes and store in a string variable
                String emailTo = etEmail.getText().toString().trim();
                String subj = etSubj.getText().toString().trim();
                String msg = etBody.getText().toString().trim();

                //lets define an intent
                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                //lets pass the data to email app
                emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{ emailTo});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, subj);
                emailIntent.putExtra(Intent.EXTRA_TEXT, msg);

                //lets set the type of intent
                emailIntent.setType("messge/rfc822");

                //lets launch the activity
                startActivity(Intent.createChooser(emailIntent, "Choose email client :"));

                etEmail.setText(null);
                etBody.setText(null);
                etSubj.setText(null);
            }
        });
    }
}