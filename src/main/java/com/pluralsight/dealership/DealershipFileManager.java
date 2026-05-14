package com.pluralsight.dealership;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    public Dealership getDealerShip() {
        try {
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            line = bufferedReader.readLine();
            String[] dealershipFields = line.split("\\|"));
            Dealership dealership = new Dealership(dealershipFields[0], dealershipFields[1], dealershipFields[2]);
            System.out.println(dealership);

            while ((line = bufferedReader.readLine()) != null) {
                String[] vehicleFields = line.split("\\|"));
                Vehicle vehicle = new Vehicle(Integer.parseInt(vehicleFields[0]), Integer.parseInt(1));

            }

            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Inventory file couldn't be read. Please try again");
        }

    }

}
