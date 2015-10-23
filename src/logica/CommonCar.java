package logica;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class CommonCar extends Vehicle {
    
    private short doorQuantity;

    public CommonCar (String plate, String brand, String model, Date year, int kilometer, short doorQuantity) {
        super(plate, brand, model, year, kilometer);
        this.doorQuantity = doorQuantity;
    }
    
    public CommonCar (String plate, String brand) {
        this(plate, brand, null, null, 0, Short.valueOf("0"));
    }
    
    public short getDoorQty() {
        return this.doorQuantity;
    }
    
    public void setDoorQty(short doors) {
        this.doorQuantity = doors;
    }
    
    @Override
    public void setType(String type) {
        if (type.toUpperCase().trim().equals("CHEAP") || type.toUpperCase().trim().equals("EXPENSIVE")){
            this.setType(type);
        } else {
            try {
                throw new Exception("Tipo "+type+" inexistente en "+CommonCar.class.getName());
            } catch (Exception ex) {
                Logger.getLogger(CommonCar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
