package com.soldagor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("targetUserValidator")
public class UserValidator {

    public void validateUser() {
        System.out.println("Validating user from UserValidator");
    }
}
