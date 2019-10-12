package com.example.rather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Settings extends AppCompatActivity {
    public void logOut(View view){

        Intent myIntent = new Intent(this, MainActivity.class);
    //myIntent.putExtra("key", value); //Optional parameters
        this.startActivity(myIntent);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
}
