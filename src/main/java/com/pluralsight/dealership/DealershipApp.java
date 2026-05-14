package com.pluralsight.dealership;

public class DealershipApp {

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.display();

        Dealership dealership = new Dealership();
        dealership .getAllVehicles();

    }
}
