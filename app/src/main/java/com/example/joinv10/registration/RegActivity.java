package com.example.joinv10.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.joinv10.R;
import com.google.android.material.textfield.TextInputEditText;

public class RegActivity extends AppCompatActivity implements Contract.ViewReg {

    Button btnReg;
    TextInputEditText email,password,login,name;
    private Contract.Presenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        mPresenter=new Presenter(this);
        email=(TextInputEditText) findViewById(R.id.emailEdit);
        password=(TextInputEditText) findViewById(R.id.passEdit);
        login=(TextInputEditText)findViewById(R.id.loginEdit);
        name=(TextInputEditText)findViewById(R.id.nameEdit);


        btnReg=(Button) findViewById(R.id.regButton);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.clickRegistrationButton(getUserEmail(),getUserPassword(),getUserName(),getUserLogin());
            }
        });

        //
    }


    private String getUserEmail(){
        return email.getText().toString();
    }
    private String getUserPassword(){
        return  password.getText().toString();
    }
    private String getUserLogin(){return login.getText().toString();}
    private String getUserName(){return  name.getText().toString();}
}