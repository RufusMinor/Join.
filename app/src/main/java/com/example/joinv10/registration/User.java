package com.example.joinv10.registration;

public class User extends RegActivity {
//    TextInputEditText email,password;
//
//    User(TextInputEditText email,TextInputEditText pasword){
//        this.email=email;
//        this.password=pasword;
//   }

   private String getUserEmail(){
        return email.getText().toString();
   }

   private String getUserPassword(){
       return  password.getText().toString();
   }

}
