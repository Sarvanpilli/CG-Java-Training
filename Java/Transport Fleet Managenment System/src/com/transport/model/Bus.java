package com.transport.model;

public class Bus { //Defining an class
    //private hides the access of the
    private int id;
    private String registrationNumber;
    private String model;
    private int capacity;
    private BusStatus status;
    private Fueltype fueltype;

    public Bus(int id, String registrationNumber, String model, int capacity, BusStatus status, Fueltype fueltype) {

        if(id<=0){
            throw new IllegalArgumentException("ID Cannot be less than 0");
        }
        if(registrationNumber == null || registrationNumber.isBlank()){
            throw new IllegalArgumentException("Registration number cannot be Empty");
        }
        if(model == null|| model.isBlank()){
            throw new IllegalArgumentException("Model Cannot be null or Empty");
        }
        if(capacity <= 0){
            throw new IllegalArgumentException("Capacity cannot be less than or equal to 0");
        }
        if(status == null){
            throw new IllegalArgumentException("Status cannot be Empty");
        }
        if(fueltype == null){
            throw  new IllegalArgumentException("Fueltype cannot be Empty");
        }
        this.id = id; //this.id = object's id -- id = constructors parameter
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.capacity = capacity;
        this.status = status;
        this.fueltype = fueltype;
    }

    public int getId() {
        return id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public BusStatus getStatus() {
        return status;
    }

    public Fueltype getFueltype() {
        return fueltype;
    }

    @Override
    public String toString(){
        return "Bus{"+ "id=" + id +
                ", registrationnNumber='" + registrationNumber + '\'' +
                ", model=" + model + '\'' +
                ", capacity=" + capacity +
                ", status='" + status + '\'' +
                ", fueltype='" + fueltype + '\'';
    }
}
