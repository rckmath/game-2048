package com.engcomp2019.controller;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WSClient extends AsyncTask<Void, Void, String> {
    public String data;

    public WSClient(String data) {
        this.data = data;
    }

    @Override
    protected String doInBackground(Void... voids) {
        try {
            URL url = new URL("http://192.168.0.13:8080/game-ws/webresources/moves/direction");
            HttpURLConnection urlConnection = null;

            try {
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setDoInput(true);
                urlConnection.setDoOutput(true);
                urlConnection.setRequestProperty("Content-Type", "application/json");
                urlConnection.setRequestMethod("POST");

                OutputStreamWriter writer = new OutputStreamWriter(urlConnection.getOutputStream());
                writer.write(data);
                writer.flush();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
