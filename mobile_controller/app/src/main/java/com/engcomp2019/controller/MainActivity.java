package com.engcomp2019.controller;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.engcomp2019.prj2048.R;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void voltarTela(View view){
        setContentView(R.layout.activity_main);
    }

    public void chamaTela(View view) {
        setContentView(R.layout.gamescreen);
    }

    public void openGit(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/rckmath/2048-Game"));
        startActivity(browserIntent);
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
            default:
                client = new WSClient("X");
                break;
        }
        try {
            client.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
