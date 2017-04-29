package com.example.slawek.httpcommunication;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.slawek.httpcommunication.dto.TaskDTO;
import com.example.slawek.httpcommunication.model.Task;

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
            return null;
        }

        @Override
        protected void onPostExecute(Task task) {
            super.onPostExecute(task);
        }
    }









}
