
package logica;

import java.util.Date;

/**
 * @version 0.1 -> 2014-09-08
 * @author Marcos
 */
public class Rental {
    
    private Client client;
    private Vehicle vehicle;
    
    private Date rentDay;
    private Date returnDay;
    private Date estimatedReturnDay;
    
    private int startKilometer;
    private int endKilometer;
    
    
    public void rentACar (Client client, Date rentDay, Date estimatedReturnDay, CommonCar car, int startKilometer) {
        this.setClient(client);
        this.setRentDay(rentDay);
        this.setEstimatedReturnDay(estimatedReturnDay);
        this.setVehicle(car);
        this.setStartKilometer(startKilometer);
    }
    
    public void returnAllCar (Client client, Date returnDay, int endKilometer) {
        for (Rental rent : client.getClientRentals()) {
            rent.setReturnDay(returnDay);
            rent.setEndKilometer(endKilometer);
        }
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Date getRentDay() {
        return rentDay;
    }
    public void setRentDay(Date rentDay) {
        this.rentDay = rentDay;
    }
    public Date getReturnDay() {
        return returnDay;
    }
    public void setReturnDay(Date returnDay) {
        this.returnDay = returnDay;
    }
    public Date getEstimatedReturnDay() {
        return estimatedReturnDay;
    }
    public void setEstimatedReturnDay(Date estimatedReturnDay) {
        this.estimatedReturnDay = estimatedReturnDay;
    }
    public int getStartKilometer() {
        return startKilometer;
    }
    public void setStartKilometer(int startKilometer) {
        this.startKilometer = startKilometer;
    }
    public int getEndKilometer() {
        return endKilometer;
    }
    public void setEndKilometer(int endKilometer) {
        this.endKilometer = endKilometer;
    }
}
