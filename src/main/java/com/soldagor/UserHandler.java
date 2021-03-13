package com.soldagor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserHandler {
    @Autowired
    @Qualifier("targetUserValidator")
    private UserValidator userValidator;

    public UserHandler() {  
    }

    public UserHandler(UserValidator userValidator) {
        this.userValidator = userValidator;
    }

    public void handleUser() {
        System.out.println("Handle user from UserHandler");
        userValidator.validateUser();
    }

    public UserValidator getUserValidator() {
        return userValidator;
    }

    public void setUserValidator(UserValidator userValidator) {
        this.userValidator = userValidator;
    }
}
