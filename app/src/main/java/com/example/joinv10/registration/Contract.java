package com.example.joinv10.registration;

import com.google.android.material.textfield.TextInputEditText;

public interface Contract {

        interface ViewReg{
            //void showText();
            //void getName(String email,String password);

        }

        interface Module{
            void createAccount(String email, String password);
            void userData(String email, String name,String login);
        }

        interface Presenter{
            void clickRegistrationButton(String email,String password,String name,String login);
            //void login(String email, String password);
        }
}
