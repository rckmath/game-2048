package com.engcomp2019.controller;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.engcomp2019.prj2048.R;

public class MainActivity extends AppCompatActivity {
    public String IP;


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

    public void callConfig(View view) {
        setContentView(R.layout.config);
    }

    public void openGit(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/rckmath/2048-Game")));
    }

    public void hide(View view) {
        hideKeyboard(MainActivity.this);
    }

    public void onClickSubmit(View view) {
        hideKeyboard(MainActivity.this);
        EditText inputIP = findViewById(R.id.inputIP);
        IP = inputIP.getText().toString();
        Toast.makeText(MainActivity.this, IP, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        WSClient client;
        switch (view.getId()) {
            case R.id.btnU:
                client = new WSClient(IP, "U");
                break;
            case R.id.btnL:
                client = new WSClient(IP, "L");
                break;
            case R.id.btnD:
                client = new WSClient(IP, "D");
                break;
            case R.id.btnR:
                client = new WSClient(IP, "R");
                break;
            case R.id.btnUndo:
                client = new WSClient(IP, "Z");
                break;
            default:
                client = new WSClient(IP, "X");
                break;
        }
        client.execute();
    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
