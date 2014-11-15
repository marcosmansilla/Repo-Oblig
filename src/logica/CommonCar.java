package logica;

import java.util.Date;

/**
 *
 * @author Marcos
 */
public class CommonCar extends Vehicle {
    
    private short doorQuantity;
    //enum entre gamaAlta y economico
    
    public CommonCar (String plate, String brand, String model, short doorQuantity, Date year, int kilometer) {
        super(plate, brand, model, year, kilometer);
        this.doorQuantity = doorQuantity;
    }
    
    public CommonCar (String plate, String brand) {
        this(plate, brand, null, Short.valueOf("0"), null, 0);
    }
    
    public short getDoorQty() {
        return this.doorQuantity;
    }
    
    public void setDoorQty(short doors) {
        this.doorQuantity = doors;
    }
    
}
