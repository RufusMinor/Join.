package com.example.joinv10.singin;

public interface Contract {




    interface ViewSingin{

    }

    interface PresenterSingIn{
        void clickOnButtonReg(String email,String password);

    }

    interface ModuleSingIn{
                void SingIn(String email, String password);
    }


}
