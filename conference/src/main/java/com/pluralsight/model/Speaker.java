package com.pluralsight.model;

public class Speaker {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String setFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
    }
    public String setLastName(String lastName){
        this.lastName = lastName;
        return lastName;
    }
}

