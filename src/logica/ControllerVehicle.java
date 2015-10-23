/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.util.ArrayList;
import java.util.Date;

/**
 * @version 0.1 -> 2014-11-17
 * @author Marcos
 */
public abstract class ControllerVehicle {

    private static ArrayList<Vehicle> lVehicles = new ArrayList<>();
    
    public static Vehicle createVehicle(String plate, String brand, String model, Date year, int kilometer, boolean van) {
        if (van) return new UtilityVan(plate, brand, model, year, kilometer);
        else return new CommonCar(plate, brand, model, year, kilometer, Short.valueOf("0"));
    }
    
    public static void saveVehicle(Vehicle vehicle) {
        lVehicles.add(vehicle);
    }
    
    public static ArrayList<Vehicle> getVehicles() {
        return lVehicles;
    }    
    
    public static Boolean validateVehicle(Vehicle vehicle) {
        return false;
    }
    
}
