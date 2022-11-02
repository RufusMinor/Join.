package com.example.joinv10.singin;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Model implements Contract.ModuleSingIn {
    FirebaseAuth mAuth;
    DatabaseReference mDatabase;


    public void SingIn(String email, String password){
        mAuth=FirebaseAuth.getInstance();
        mAuth.signInWithEmailAndPassword(email, password);


    }
}
