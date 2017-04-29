package com.example.slawek.httpcommunication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.slawek.httpcommunication.model.Task;

import java.util.List;

/**
 * Created by Slawek on 29.04.2017.
 */

public class TaskArrayAdapter extends ArrayAdapter<Task> {

    public TaskArrayAdapter(@NonNull Context context, @NonNull List<Task> objects) {

        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        Task task = getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.single_row_layout, parent, false);

        }
        TextView index = (TextView) convertView.findViewById(R.id.index);
        TextView note = (TextView) convertView.findViewById(R.id.note);
        CheckBox checkBox = (CheckBox) convertView.findViewById(R.id.checkbox);

        index.setText(String.valueOf(position));
        note.setText(task.getValue());
        checkBox.setChecked(task.isCompleted());


        return convertView;

    }
}
