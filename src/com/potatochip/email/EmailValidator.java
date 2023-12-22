package com.potatochip.email;

public class EmailValidator {
    public boolean validEmail(String email){
        if(email == null || email.isEmpty() || !email.contains("@")){
            return false;
        }
        return true;
    }
}
