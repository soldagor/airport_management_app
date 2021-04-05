package com.soldagor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class UserEntity extends AbstractBaseEntity {

    @Column(name = "email")
    private String email;

    @Column(name = "fName")
    private String fName;

    @Column(name = "lName")
    private String lName;

    public UserEntity() {
    }

    public UserEntity(String email, String fName, String lName) {
        this.email = email;
        this.fName = fName;
        this.lName = lName;
    }

    public UserEntity(Long id, String email, String fName, String lName) {
        super(id);
        this.email = email;
        this.fName = fName;
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
