package com.example.rather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
public class Info extends AppCompatActivity {
    public void back(View view){

        Intent myIntent = new Intent(this, mainScreen.class);
        //myIntent.putExtra("key", value); //Optional parameters
        this.startActivity(myIntent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent intent = getIntent();
        String value = intent.getStringExtra("title");
        TextView tv = (TextView)findViewById(R.id.Title);
        tv.setText(value);
        String desc = intent.getStringExtra("description");
        TextView tt = (TextView)findViewById(R.id.description);
        tt.setText(desc);
    }
}
