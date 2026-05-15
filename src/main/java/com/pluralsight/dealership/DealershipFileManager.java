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
            System.out.println(dealership);

            while ((line = bufferedReader.readLine()) != null) {
                String[] vehicleFields = line.split("\\|");
                Vehicle vehicle = new Vehicle((Integer.parseInt(vehicleFields[0])), Integer.parseInt(vehicleFields[1], (vehicleFields[2]), (vehicleFields[3]), (vehicleFields[4]), (vehicleFields[5]), Integer.parseInt(vehicleFields[6]), Double.parseDouble(vehicleFields[7]);

            }

            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Inventory file couldn't be read. Please try again");
        }

        return null;
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
