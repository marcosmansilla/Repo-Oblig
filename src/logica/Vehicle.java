package logica;

import java.util.Date;

/**
 * @version 0.1 -> 2014-09-08
 * @author Marcos
 */
public abstract class Vehicle {

    private String plate;
    private String model;
    private Date year;
    private double pricePerDay;
    private int kilometer;
    //private TypeOfCar typeOfCar;
    // COMMON CAR Y UTILITY TIENEN LAS SUYAS PROPIAS...
    public enum TypeOfCar {
        CHEAP, EXPENSIVE
    }
    // CONSTRU
    
    public Vehicle (String plate, String brand, String model, Date year, int kilometer) {
        this.setPlate(plate);
        if (brand == null) brand = "";
        if (model == null) model = "";
        this.setModel(brand, model);
        this.setYear(year);
        this.setKilometer(kilometer);
    }

// METHODS
    
    
    
    // SETTERS 
    
    public void setPlate(String plate) {
        this.plate = plate;
    }    
    public void setModel(String brand, String model) {
        this.model = brand + " " + model;
    }
    public void setYear(Date year) {
        this.year = year;
    }
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }
    /*public void setType(TypeOfCar type) {
        this.typeOfCar = type;
    }*/
    // GETTERS
    
    public String getModel() {
        return model.trim();
    }
    public Date getYear() {
        return year;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }
    public String getPlate() {
        return plate.trim();
    }
    public int getKilometer() {
        return kilometer;
    }
}
