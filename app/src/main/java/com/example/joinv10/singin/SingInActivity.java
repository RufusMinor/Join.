package com.example.joinv10.singin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.joinv10.R;
import com.google.android.material.textfield.TextInputEditText;

public class SingInActivity extends AppCompatActivity implements Contract.ViewSingin {
        private Contract.PresenterSingIn mPresenterSingIn;
        Button sing_in;
        private TextInputEditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
        mPresenterSingIn=new Presenter(this);


        email=(TextInputEditText)findViewById(R.id.emaleSingIn);
        password=(TextInputEditText)findViewById(R.id.passSingIn);

        sing_in=(Button) findViewById(R.id.ButtonSingIn);
        sing_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenterSingIn.clickOnButtonReg(email.getText().toString(),password.getText().toString());
            }
        });
    }
}