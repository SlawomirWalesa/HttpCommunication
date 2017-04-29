package com.example.slawek.httpcommunication.dto;

/**
 * Created by Slawek on 29.04.2017.
 */

public class TaskDTO {

    private boolean completed;
    private int user;
    private int id;
    private String value;

    public TaskDTO(boolean completed, int user, int id, String value) {
        this.completed = completed;
        this.user = user;
        this.id = id;
        this.value = value;
    }

    public TaskDTO(){}

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
