package logica;

import java.util.Date;

/**
 * @version 0.1 -> 2014-09-08
 * @author Marcos
 */
public abstract class Vehicle {

    private String plate;
    private String model;
    private String brand;
    private Date year;
    private double pricePerDay;
    private int kilometer;
    
    // CONSTRU
    
    public Vehicle (String plate, String brand, String model, Date year, int kilometer) {
        this.setPlate(plate);
        if (brand == null) brand = "";
        if (model == null) model = "";
        this.setModel(model);
        this.setBrand(brand);
        this.setYear(year);
        this.setKilometer(kilometer);
    }

// METHODS
    
    
    
    // SETTERS 
    
    public void setPlate(String plate) {
        this.plate = plate;
    }    
    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
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
    // GETTERS
    
    public String getModel() {
        return model.trim();
    }
    public String getBrand() {
        return brand.trim();
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
