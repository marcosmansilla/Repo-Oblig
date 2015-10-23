package logica;

import java.util.Date;

/**
 *
 * @author Marcos
 */
public class UtilityVan extends Vehicle {
    
    public enum TypeOfVan {
        LOAD, PASSENGER
    }
    
    public UtilityVan (String plate, String brand, String model, Date year, int kilometer, TypeOfVan type) {
        super(plate, brand, model, year, kilometer);
        
    }
   
    public UtilityVan (String plate, String model) {
        this(plate, "", model, null, 0, TypeOfVan.PASSENGER);
    }
}
