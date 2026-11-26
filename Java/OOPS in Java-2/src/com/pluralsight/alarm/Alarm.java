package com.pluralsight.alarm;

public class Alarm {
    boolean active;
    String message;

    void turnOn(){
        active = true;
    }

    void turnOff(){
        active = false;
    }

    public void setMessage(String message){
        this.message = message;

    }


}
