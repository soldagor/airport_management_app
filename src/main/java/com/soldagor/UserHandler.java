package com.soldagor;

public class UserHandler {

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
