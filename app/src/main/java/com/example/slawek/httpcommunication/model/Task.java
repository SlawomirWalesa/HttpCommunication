package com.example.slawek.httpcommunication.model;

/**
 * Created by Slawek on 29.04.2017.
 */

public class Task {

    private boolean completed;
    private int user;
    private String value;

    public Task(boolean completed, int user, String value) {
        this.completed = completed;
        this.user = user;
        this.value = value;
    }

    public Task() {}

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
