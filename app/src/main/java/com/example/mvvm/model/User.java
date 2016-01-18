package com.example.mvvm.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {

    @Bindable
    private String name;

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.example.mvvm.BR.name);
    }

    public String getName() {
        return name;
    }
}

