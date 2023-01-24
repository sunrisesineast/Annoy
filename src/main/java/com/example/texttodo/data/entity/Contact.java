package com.example.texttodo.data.entity;

import javax.persistence.Entity;
import javax.validation.constraints.Email;

@Entity
public class Contact extends AbstractEntity {

    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String phone;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
