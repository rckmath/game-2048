package com.engcomp2019.controller;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WSClient extends AsyncTask<Void, Void, String> {
    private String data;
    private String ip;

    WSClient(String ip, String data) {
        this.ip = ip;
        this.data = data;
    }

    @Override
    protected String doInBackground(Void... voids) {
        try {
            if (ip == null || ip.equals("")) {
                ip = "192.168.0.13";
            }
            URL url = new URL("http://" + ip + ":8080/game-ws/webresources/moves/direction");
            try {
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setConnectTimeout(250);
                con.setReadTimeout(250);

                con.setDoInput(true);
                con.setDoOutput(true);
                con.setRequestProperty("Content-Type", "application/json");
                con.setRequestMethod("POST");

                OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
                writer.write(data);
                writer.flush();

                con.getResponseCode();
                con.disconnect();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
