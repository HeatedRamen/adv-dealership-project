package com.pluralsight.dealership;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
        dealership = new Dealership();
    }

    public void display() {

    }




    public void runApp() {

        init();

        boolean runApp = true;
        Scanner keyboard = new Scanner(System.in);

        while (runApp) {
            System.out.println("""
                    
                    DB Used Car Dealership (artwork placeholder)
                    
                    
                    
                    
                    
                    
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
                    
                    
                    
                    
                    """);
            String userCmdRequest = keyboard.nextLine();


            switch (userCmdRequest){
                case "1" -> getByPriceRequest();
                case "2" -> getByMakeModelRequest();
                case "3" -> getByYearRequest();
                case "4" -> getByColorRequest();
                case "5" -> getByMileageRequest();
                case "6" -> getByVehicleTypeRequest();
                case "7" -> getAllVehcilesRequest();
                case "8" -> addVehcilesRequest();
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

}

public void getByMakeModelRequest(){

}

public void getByYearRequest(){

}

public void getByColorRequest(){

}

public void getByMileageRequest(){

}

public void getByVehicleTypeRequest(){

}

public void getAllVehcilesRequest(){
        displayVehicles(dealership.getAllVehicles());
}

public void addVehcilesRequest(){

}

public void removeVehicleRequest(){

}




}
