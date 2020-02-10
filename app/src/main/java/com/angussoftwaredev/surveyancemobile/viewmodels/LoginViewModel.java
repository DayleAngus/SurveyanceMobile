package com.angussoftwaredev.surveyancemobile.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.angussoftwaredev.surveyancemobile.model.User;

public class LoginViewModel
{
    private MutableLiveData<User> mUser;
    
    public LiveData<User> getUser()
    {
        return mUser;
    }
}
