package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.model.CustomBuble;

import java.util.Locale;

public class Reverse extends AppCompatActivity {
    CustomBuble customBuble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);


        customBuble =  CustomBuble.getInstance();
        updateUI();

    }

    private void updateUI() {
        TextView show = findViewById(R.id.txt_show_mines);
        String msg = String.format(Locale.getDefault() , "buble %d" ,customBuble.getBuble() );
        show.setText(msg);
    }

    public void addClick(View view) {
        customBuble.mines();
        updateUI();
    }

    public void onClick(View view) {

        startActivity(new Intent(this , MainActivity.class));
    }

    @Override
    protected void onResume() {

        super.onResume();
        updateUI();
    }

    @Override
    protected void onPause() {
        super.onPause();
        updateUI();
    }
}
