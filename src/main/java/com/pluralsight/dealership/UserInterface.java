package com.pluralsight.dealership;

public class UserInterface {
    private Dealership Dealership;

    public void display() {

    }


    public void runApp() {
        boolean runApp = true;
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
        }
    }
}
