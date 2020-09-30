package com.example.viewmodel13072020;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
//    MutableLiveData : Gia tri co the thay doi duoc
//    LiveData : Gia tri chi duoc doc chu khong thay doi
    private MutableLiveData<String> mMutableString;

    public MyViewModel() {
        mMutableString = new MutableLiveData<>();
    }

    public void setString(String value){
        mMutableString.setValue(value);
    }

    public LiveData<String> getMutableString(){
        return mMutableString;
    }
}
