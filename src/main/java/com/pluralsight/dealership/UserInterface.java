package com.pluralsight.dealership;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    static private Scanner keyboard = new Scanner(System.in);

    public UserInterface() {
        dealership = new Dealership();
    }

    public void runApp() {

        init();

        boolean runApp = true;


        while (runApp) {
            System.out.println("""
                    ==================================================
                     ___        ____           __   ____  ____        ___      ___   ____  _        ___  ____     _____  __ __  ____  ____ 
                    |   \\     |    \\        / ] /     ||    \\     |   \\   /  _] /    || |      /  _]|    \\  / ___/ |  |  ||    ||    \
                    |    \\    |  o  )      /  /  |  o  ||  D  )     |    \\ /  [_ |  o  || |     /  [_ |  D  ) (  \\_  |  |  | |  | |  o  )
                    |  D  |    |     |     /  /   |     ||    /      |  D  ||    _]|     || |___ |    _]|    /  \\__   ||  _  | |  | |   _/
                    |     |    |  O  |    /   \\_ |  _  ||    \\     |     ||   [_ |  _  ||     ||   [_ |    \\   _ \\ ||  |  | |  | |  |  
                    |_____|    |_____|     \\____||__|__||__|\\_|    |_____||_____||__|__||_____||_____||__|\\_|  \\___||__|__||____||__|  
                    
                    
                    
                    1)  Find vehicles within a price range
                    2)  Find vehicles by make / model
                    3)  Find vehicles by year range
                    4)  Find vehicles by color
                    5)  Find vehicles by mileage range
                    6)  Find vehicles by type (car, truck, SUV, van)
                    7)  List ALL vehicles
                    8)  Add a vehicle
                    9)  Remove a vehicle
                    99) Quit
                    
                    
                    
                    ==================================================
                    """);
            String userCmdRequest = keyboard.nextLine();

            switch (userCmdRequest){
                case "1" -> getByPriceRequest();
                case "2" -> getByMakeModelRequest();
                case "3" -> getByYearRequest();
                case "4" -> getByColorRequest();
                case "5" -> getByMileageRequest();
                case "6" -> getByVehicleTypeRequest();
                case "7" -> getAllVehiclesRequest();
                case "8" -> addVehicleRequest();
                case "9" -> removeVehicleRequest();
                case "99" -> runApp = false;
                default -> System.out.println("Invalid User Input. Try again.");
            }
        }
    }

private void init(){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealership = dealershipFileManager.getDealerShip();
}

private void displayVehicles(List<Vehicle>filteredVehicles){
        for (Vehicle vehicle : filteredVehicles){
            System.out.println(vehicle);
        }
}

public void getByPriceRequest(){

        boolean runPrice = false;

        while (!runPrice){
            System.out.println("Minimum price point? ");
                double minPrice = keyboard.nextDouble();
            System.out.println("Maximum price point? ");
                double maxPrice = keyboard.nextDouble();
            keyboard.nextLine();

            displayVehicles(dealership.getPricedVehicle(minPrice, maxPrice));
            runPrice = true;
        }

}

public void getByMakeModelRequest(){

    System.out.println("Maker of vehicle? ");
        String maker = keyboard.nextLine();
    System.out.println("Model of vehicle? ");
        String model = keyboard.nextLine();

    displayVehicles(dealership.getVehicleMakeModel(maker, model));

}

public void getByYearRequest(){

boolean runAge = false;

while (!runAge) {
    System.out.println("Youngest year for vehicle? ");
    int min = keyboard.nextInt();
    System.out.println("Oldest year for vehicle? ");
    int max = keyboard.nextInt();
    keyboard.nextLine();

    displayVehicles(dealership.getVehicleAge(min, max));
    runAge = true;

}




}

public void getByColorRequest(){

}

public void getByMileageRequest(){

}

public void getByVehicleTypeRequest(){

}

public void getAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicles());
}

public void addVehicleRequest(){}

public void removeVehicleRequest(){}

}
