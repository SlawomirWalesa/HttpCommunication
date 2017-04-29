package com.example.slawek.httpcommunication;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.slawek.httpcommunication.dto.TaskDTO;
import com.example.slawek.httpcommunication.model.Task;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    private class MyAsyncTask extends AsyncTask<String, Void, Task> {
        @Override
        protected Task doInBackground(String... params) {

            StringBuilder builder = new StringBuilder();

            String line;

            String link = "https://shrouded-fjord-81597.herokuapp.com/api/health-check" + params[0].toUpperCase() + "," + params[1].toUpperCase() + "," + params[2].toUpperCase();
            URL url = null;

            try {
                url = new URL(link);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) url.openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                InputStream in = new BufferedInputStream(connection.getInputStream());

                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(in, "UTF-8"));
                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                connection.disconnect();
            }
            return takeDataFromJason(builder.toString());
        }


            return null;
        }

        @Override
        protected void onPostExecute(Task task) {
            super.onPostExecute(task);
        }
    }









}
