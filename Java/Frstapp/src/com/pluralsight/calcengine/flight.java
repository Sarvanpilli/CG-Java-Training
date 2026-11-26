package com.pluralsight.calcengine;

public class flight {
    private int seats;
    public void setSeats(int seats){
        this.seats=seats;
    }

    public int getSeats(){
        return this.seats;
    }
    public static void main(String[] args) {
        flight fls = new flight();
        fls.setSeats(200);
        System.out.println(fls.getSeats());
    }
}
