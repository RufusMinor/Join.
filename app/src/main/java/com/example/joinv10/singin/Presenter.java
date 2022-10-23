package com.example.joinv10.singin;

public class Presenter implements Contract.PresenterSingIn {
    private static final String TAG="PresenterSingIn";

    private Contract.ViewSingin mViewSingin;
    private Contract.ModuleSingIn mModelSingIn;

    public Presenter(Contract.ViewSingin mViewSingin){
        this.mViewSingin=mViewSingin;
        this.mModelSingIn=new Model();

    }
    @Override
    public void clickOnButtonReg(String email, String password){
        mModelSingIn.SingIn(email,password);
    }





}
