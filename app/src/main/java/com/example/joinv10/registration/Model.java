package com.example.joinv10.registration;

import android.util.Log;

import com.example.joinv10.registration.Contract;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Model implements Contract.Module{

    FirebaseAuth mAuth;
    DatabaseReference mDatabase;
    private static final String TAG="MainModule";


        public void createAccount(String email, String password){
            mAuth=FirebaseAuth.getInstance();
            Log.d("login","Вот сука"+email);
                mAuth.createUserWithEmailAndPassword(email,password);
//                      .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if(task.isSuccessful()){
//                                    Intent intent=new Intent(,MainActivity2.class);
//
//                                }
//                            }
//                        });

            }
        public  void userData(String email, String name,String login){
            mAuth=FirebaseAuth.getInstance();
            mDatabase= FirebaseDatabase.getInstance("https://join-6dc33-default-rtdb.asia-southeast1.firebasedatabase.app").getReference();
            mDatabase.child(login).child("name").setValue(name);
            mDatabase.child(login).child("email").setValue(email);


        }



        }




