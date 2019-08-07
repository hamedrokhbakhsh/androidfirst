package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.model.CustomBuble;
import com.example.myapplication.ui.login.LoginActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private CustomBuble buble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buble = CustomBuble.getInstance();
        updateUI();
    }

    private void updateUI() {
        TextView show = findViewById(R.id.txt_show);
        String msg = String.format(Locale.getDefault() , "buble %d" ,buble.getBuble() );
        show.setText(msg);
    }

    public void onClick(View view) {

        startActivity(new Intent(this , Reverse.class));

    }

    public void addClick(View view) {
        Toast.makeText(this, "hellooo", Toast.LENGTH_SHORT).show();
        buble.addBuble();
        updateUI();

    }
    @Override
    protected void onResume() {

        super.onResume();
        updateUI();
    }

    public void login(View view) {
        startActivity(new Intent(this , LoginActivity.class));
    }
}
