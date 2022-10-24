package com.example.joinv10.registration;

import android.util.Log;

public class Presenter implements Contract.Presenter {

    private static final String TAG="MainPresenter";

    private Contract.ViewReg mView;
    private Contract.Module mModule;
    //public String email,password;


    public Presenter(Contract.ViewReg mView){
        this.mView=mView;
        this.mModule=new Model();

    }
    @Override
    public void clickRegistrationButton(String email, String password,String name,String login){
        mModule.createAccount( email,password);
        mModule.userData(email,name,login);

    }
}
