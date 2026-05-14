package com.pluralsight.dealership;

import java.util.ArrayList;
import java.util.List;

    public class Dealership {
        private String name;
        private String address;
        private String phone;
        private ArrayList<Vehicle> inventory;

        public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.inventory = new ArrayList<>();
        }


        public String getName(){
            return name;
        }


        public List<Vehicle> getAllVehicles(){
            return null; /*Return later*/
        }


    }
