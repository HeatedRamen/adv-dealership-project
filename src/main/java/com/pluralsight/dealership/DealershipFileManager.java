package com.pluralsight.dealership;

import java.io.*;

public class DealershipFileManager {

    public Dealership getDealerShip() {
        try {
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            line = bufferedReader.readLine();
            String[] dealershipFields = line.split("\\|");
            Dealership dealership = new Dealership(dealershipFields[0], dealershipFields[1], dealershipFields[2]);

            while ((line = bufferedReader.readLine()) != null) {
                dealership.addVehicle(line);
            }

            bufferedReader.close();
            return dealership;
        }catch (IOException e){
            System.out.println("Inventory file couldn't be read. Please try again");
            return null;
        }

    }

    public void saveDealership(Dealership dealership){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inventory.csv", true));
                bufferedWriter.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());
            for (Vehicle vehicle : dealership.getAllVehicles()){
                bufferedWriter.write(vehicle.getVin() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" +
                        vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" +
                        vehicle.getOdometer() + "|" + vehicle.getPrice());
            }

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }


}
