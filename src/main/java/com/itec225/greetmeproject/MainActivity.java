package com.itec225.greetmeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variable declaration
    TextView welcomeBanner1;
    EditText welcomeBannerUserInput1;
    EditText welcomeBannerUserInput2;
    Button welcomeButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     welcomeBanner1 = (TextView) findViewById(R.id.welcomeBanner);

     welcomeBannerUserInput1 = (EditText) findViewById(R.id.firstNameInput );
     welcomeBannerUserInput2 = (EditText) findViewById(R.id.lastNameInput);


        welcomeButton1 = (Button) findViewById(R.id.welcomeButton);

        welcomeButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                This is a String Builder, we encountered an issue trying to display the First Name and Last Name.
                The String Builder is needed to concatenate 2 variables  welcomeBannerUserInput1 and  welcomeBannerUserInput2.
                */
                welcomeBanner1.setText( welcomeBannerUserInput1.getText().toString() + " " + welcomeBannerUserInput2.getText() +" "+ " Welcome to NLC");
            }
        });
    }




    }

