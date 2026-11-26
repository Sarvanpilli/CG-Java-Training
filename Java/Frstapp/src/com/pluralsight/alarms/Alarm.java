package com.pluralsight.alarms;

import java.time.LocalDateTime;

public class Alarm {
    boolean active;
    String message = "";
    LocalDateTime snoozeUntil;
    void turnon() {
        boolean active = true;
    }

    void turnoff() {
        boolean active = false;
    }

    void Snooze(){
        snoozeUntil = LocalDateTime.now().plusMinutes(5);
    }
    boolean isSnoozing(){
        if(snoozeUntil.isAfter(LocalDateTime.now().plusMinutes(5))){
            return true;
        } else {
            return false;
        }
    }

    void StopSnooze(){
        snoozeUntil = LocalDateTime.now().minusSeconds(1) ;
    }
    String getreport(boolean uppercase) {
        if (active) {
            if (uppercase) {
                return message.toUpperCase();
            } else {
                return message;
            }
        } else {
            return " Alarm is not active";
        }
    }

    void sendreport() {
        System.out.println(getreport(true));
    }

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        alarm.active = true;
        alarm.message = "This is a test";
        System.out.println(alarm.getreport(true));
        System.out.println(alarm.getreport(false));
        alarm.sendreport();
    }
}