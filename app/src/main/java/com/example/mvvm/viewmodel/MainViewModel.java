package com.example.mvvm.viewmodel;

import android.databinding.BaseObservable;

import com.example.mvvm.model.*;

public class MainViewModel extends BaseObservable {

    public MainViewModel() {
        this.Init();
    }

    // attribute
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // method
    public void Init() {
        this.user = new User();
        this.user.setName("who are u");
    }

    // command
    public void SubmitCommand(android.view.View view) {
        this.user.setName("hello world");
    }
}