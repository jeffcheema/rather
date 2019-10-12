package com.example.rather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainScreen extends AppCompatActivity {
    public void openSettings(View view){

        Intent myIntent = new Intent(this, Settings.class);
        //myIntent.putExtra("key", value); //Optional parameters
        this.startActivity(myIntent);
    }
    public void vcm(View view){

        Intent myIntent = new Intent(this, Info.class);
        myIntent.putExtra("title", "Valley Children's Museum"); //Optional parameters
        myIntent.putExtra("description", "At this volunteering opportunity, volunteers will be asked to help set up exhibits and ensuring that they are of the utmost quality. Volunteers will also be asked to explain various exhibits to visitors as well as their historical significance. Weekly involvement is required on Thursday from 3:30PM to 8:00PM. Volunteer hours will be signed off at the end of a volunteering period."); //Optional parameters
        this.startActivity(myIntent);
    }
    public void library(View view){

        Intent myIntent = new Intent(this, Info.class);
        myIntent.putExtra("title", "Library"); //Optional parameters
        myIntent.putExtra("description", "At this volunteering opportunity, volunteers will be asked to help set up to organize and place books in their correct shelves. Volunteers will also be asked to help people find the books they need and take an inventory of the books in the library. Weekly involvement is required on Friday from 3:30PM to 8:00PM. Volunteer hours will be signed off at the end of a volunteering period. \n"); //Optional parameters
        this.startActivity(myIntent);
    }
    public void cc(View view){

        Intent myIntent = new Intent(this, Info.class);
        myIntent.putExtra("title", "Community Park"); //Optional parameters
        myIntent.putExtra("description", "At this volunteering opportunity, volunteers will be asked to help clean up and maintain the quality of the local park. Volunteers will also be asked to help pick up litter and manage the park garden. Weekly involvement is required on Saturday from 3:30PM to 8:00PM. Volunteer hours will be signed off at the end of a volunteering period. "); //Optional parameters
        this.startActivity(myIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
}
