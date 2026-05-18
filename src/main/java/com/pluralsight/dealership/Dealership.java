package com.pluralsight.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getAllVehicles() {
        return inventory; /*Return later*/
    }

    public void addVehicle(String line) {
        String[] vehicleFields = line.split("\\|");
        Vehicle vehicle = new Vehicle(Integer.parseInt(vehicleFields[0]), Integer.parseInt(vehicleFields[1]), vehicleFields[2], vehicleFields[3], vehicleFields[4], vehicleFields[5], Integer.parseInt(vehicleFields[6]), Double.parseDouble(vehicleFields[7]));
        inventory.add(vehicle);
    }

    public Dealership() {
        name = "";
        address = "";
        phone = "";
        inventory = new ArrayList<>();
    }

    public List<Vehicle> getPricedVehicle(double min, double max) {
        List<Vehicle> vehicleMatch = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                vehicleMatch.add(vehicle);
            }
        }
        return vehicleMatch;
    }

    public List<Vehicle> getVehicleMakeModel(String maker, String model) {
        List<Vehicle> vehicleMatch = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(maker) && vehicle.getModel().equalsIgnoreCase(model)) {
                vehicleMatch.add(vehicle);
            }
        }
        return vehicleMatch;
    }

    public List<Vehicle> getVehicleAge(double min, double max) {
        List<Vehicle> vehicleMatch = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max) {
                vehicleMatch.add(vehicle);
            }
        }
        return vehicleMatch;
    }

}
