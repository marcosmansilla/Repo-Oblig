/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persitencia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import logica.Client;
import logica.ControllerClient;

/**
 * @version 0.1 --> 2014-11-20
 * @author Marcos
 */
public abstract class ClientPersistency {
    
    public static ArrayList<Client> loadClients() {
        ArrayList lClients = null;
        
        if (!ControllerClient.getClients().isEmpty()) lClients = ControllerClient.getClients();
        else lClients = new ArrayList<> ();
        
        Connection con = ConnManager.getConnection();
        Statement st = null;
        ResultSet rs = null;
        Client c = null;
        int document = -1;
        String name = "";
        String lastName = "";
        String address = "";
        String phone = "";
        String mail = "";
        
        try {
            st = con.createStatement();
            rs = st.getResultSet();
            
            while (rs.next()) {
                document = rs.getInt("document");
                name = rs.getString("name");
                lastName = rs.getString("lastname");
                address = rs.getString("address");
                phone = rs.getString("phone");
                mail = rs.getString("mail");
                
                c = new Client(document, name, lastName);
                c.setAddress(address);
                c.setMail(mail);
                c.setPhone(phone);
                
                lClients.add(c);
            }
// TODO: tiene que traer los clientes desde la base y crearlos oomo obj.
            
            
        } catch (Exception e) {
            
        } finally {
            
        }
        
        return lClients;
    }
    
    public static void saveClient(Client client) {
        ArrayList lClients = loadClients();
        lClients.add(client);
        
        
    }
}
    
