package com.transport;

import com.transport.model.Bus;
import com.transport.model.BusStatus;
import com.transport.model.Fueltype;
import com.transport.service.BusService;

public class Main {
    public static void main(String[] args) {
        BusService busService = new BusService();
        Bus[] buses = new Bus[3];
        Bus bus1 = new Bus(101,"AP39AP1234","VOLVO",100, BusStatus.ACTIVE, Fueltype.PETROL);
       // Bus bus2 = new Bus(102,"AP","Ashok Leyland",45,BusStatus.ACTIVE, Fueltype.PETROL);
        Bus bus2 = new Bus(
                102,
                "AP39AP1235",
                "TATA",
                50,
                BusStatus.ACTIVE,
                Fueltype.CNG
        );
        Bus bus3 = new Bus(103,"AP","TATA",40,BusStatus.ACTIVE, Fueltype.PETROL);

        buses[0] = bus1;
        buses[1] = bus2;
        buses[2] = bus3;
        for (Bus bus : buses) {
            System.out.println(bus);
        }

//        busService.addBus(bus1);
//        busService.addBus(bus2);
//        busService.addBus(bus3);
//        busService.displayAllbuses();
//        System.out.print(busService.busCount());

        Bus foundbus = busService.findByBusId(102);
        System.out.print("The bus is: "+foundbus);

    }
}
