package com.example.control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void chamaTela(View view){
        setContentView(R.layout.gamescreen);
    }

    public void openGit(View view){
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/rckmath/2048-Game"));
        startActivity(browserIntent);
    }


}
