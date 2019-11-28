package com.engcomp2019.controller;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.engcomp2019.prj2048.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goBack(View view) {
        setContentView(R.layout.activity_main);
    }

    public void callController(View view) {
        setContentView(R.layout.gamescreen);
    }

    public void openGit(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/rckmath/2048-Game")));
    }

    public void onClick(View view) {
        WSClient client;
        switch (view.getId()) {
            case R.id.btnU:
                client = new WSClient("U");
                break;
            case R.id.btnL:
                client = new WSClient("L");
                break;
            case R.id.btnD:
                client = new WSClient("D");
                break;
            case R.id.btnR:
                client = new WSClient("R");
                break;
            case R.id.btnUndo:
                client = new WSClient("Z");
                break;
            default:
                client = new WSClient("X");
                break;
        }
        client.execute();
    }
}
