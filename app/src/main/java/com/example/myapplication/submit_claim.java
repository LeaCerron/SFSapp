package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class submit_claim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_claim);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        configureBackButton();
        configureSubmitButton();
    }

    //code for configuring the back button
    //back button returns to home page
    private void configureBackButton(){
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //finish allows the use of the android up button
                finish();
                //startActivity(new Intent(claim_submitted.this, submit_claim.class));
            }
        });
    }

    //code for configuring the back button
    //back button returns to home page
    private void configureSubmitButton(){
        Button backButton = (Button) findViewById(R.id.submitButton);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //TODO add the actual bit that submits the claim
                //TODO need to pass the submitted claim number to submitted_claim page or save it somehow
                //closes submit page and opens claim submitted page
                startActivity(new Intent(submit_claim.this, claim_submitted.class));
                finish();
            }
        });
    }

}
