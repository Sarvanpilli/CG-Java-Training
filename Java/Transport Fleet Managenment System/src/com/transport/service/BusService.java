package com.transport.service;

import com.transport.model.Bus;
import java.util.ArrayList;
import java.util.List;

public class BusService {
    private List<Bus> buses = new ArrayList<>(); //List<Bus>--> It's a list,it contains objects of the Buses <Bus> it specially tells only the buses
    //in java every we should use Interface variable = Implementation object

    public boolean addBus(Bus bus){
        if(findByBusId(bus.getId()) != null){
            return false;//Method
        }
        if(findBusByRegistration(bus.getRegistrationNumber()) != null){
            return false;
        }
        buses.add(bus);
        return true;
    }

    public void displayAllbuses(){
        for(Bus bus:buses){ //For every Bus inside buses temporary call it as bus Means list has bus1,bus2,bus3 these buses in Bus can be temporary bus = bus1 print it and so on..
            System.out.println(bus);
        }

    }

    public Bus findByBusId(int id){
        for(Bus bus:buses){
            if(bus.getId()==id){
                return bus;
            }
        }
        return null;
    }
    public Bus findBusByRegistration(String registrationNumber){
        for(Bus bus: buses){
            if(bus.getRegistrationNumber().equalsIgnoreCase(registrationNumber)){
                return bus;
            }
        }
        return null;
    }

    //Iterators next
    public int busCount(){
        return buses.size();
    }


}
