package com.sarvan;

import java.util.List;

public class Customer {
    private String name;
    private String contact;
    private List <String> address;

    public String getName(){
        return name;
    }
    public String getContact(){
        return contact;
    }
    public List <String> getAddress(){
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public void setAddress(List<String> address) {
        this.address = address;
    }

}
