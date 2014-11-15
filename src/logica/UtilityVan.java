package logica;

import java.util.Date;

/**
 *
 * @author Marcos
 */
public class UtilityVan extends Vehicle{
    // enum de carga/pasajeros
    
    public UtilityVan (String plate, String brand, String model, Date year, int kilometer) {
        super(plate, brand, model, year, kilometer);
    }
    
    public UtilityVan (String plate, String model) {
        super(plate, "", model, null, 0);
    }
    
}
