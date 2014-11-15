package logica;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import presentacion.AltaCliente;
import presentacion.ClientTableModel;
import presentacion.EditCliente;
import presentacion.GestionCliente;


/**
 *
 * @author Marcos
 */
public class RentadoraObligatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GestionCliente gc = new GestionCliente();
        gc.setVisible(true);
        
        /*
        AltaCliente ac = new AltaCliente();
        ac.setVisible(true);
        
        EditCliente ec = new EditCliente();
        ec.setVisible(true);
       */
// AltaCliente ac = new AltaCliente();
       // ac.setVisible(true);
        
        /*Client mansilla = new Client(40852534, "Marcos", "Mansilla");
        
        mansilla.setAddress("Estivao 1891 esq. Neyra");
        mansilla.setMail("marcos@marcos.com");
        mansilla.setPhone("095 258839");
        
        
        
        System.out.println(Client.documentValidator("00000000"));
        
        System.out.println("Cliente: "+mansilla.getAddress()+" "+mansilla.getMail()+" "+mansilla.getPhone());
        System.out.println(mansilla.getFullName()+" cédula "+mansilla.getDocument());
        
        CommonCar cc = new CommonCar("ACA 733", "Chevrolet");
        cc.setDoorQty(Short.valueOf("5"));
        System.out.println("Vehiculo : Automóvil - "+cc.getModel()+" - Chapa - "+cc.getPlate()+" - cant.Puertas - "+cc.getDoorQty());
        
        UtilityVan uv = new UtilityVan("CAM 1234", "Volvo");
        System.out.println("Vehiculo : Camión - " + uv.getModel() + " - Chapa - " + uv.getPlate() + " ");
        
        
        Rental rent = new Rental();
        rent.rentACar(mansilla, new Date(), new GregorianCalendar(2015, 11, 29).getTime(), cc, 0);
        
        */
        /*System.out.println("Está alquilando el cliente : " + (rent.getClient().getClientRentals().isEmpty()?"No":"Si"));
        for (Rental therent : rent.getClient().getClientRentals()) {
        //if (rent.getClient(). isRenting()) {
            System.out.println("Vehículo : " + therent.getVehicle().getModel());
            System.out.println("Cliente : " + therent.getClient().getFullName());
            System.out.println(
                    "Cliente está alquilando este auto desde : " + therent.getRentDay() + " y lo entregaría el " + therent.getEstimatedReturnDay()
            );
        }*/
    }
    
}
