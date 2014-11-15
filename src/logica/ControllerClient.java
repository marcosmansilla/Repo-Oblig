package logica;

import java.util.ArrayList;

/**
 * @version 0.1 -> 2014-11-03
 * @author Marcos
 */
public abstract class ControllerClient {
    private static ArrayList<Client> lClients = new ArrayList<>();
    
    public static Client createClient(int doc, String name, String lastName) {
        return new Client(doc, name, lastName);
    }
    
    public static void saveClient(Client client) {
        lClients.add(client);
    }
    
    public static ArrayList<Client> getClients() {
        return lClients;
    }    
    
    public static Boolean validateClient(Client client) {
        if (!(client.getLastName().length() > 0) || !(client.getName().length() > 0) || client.getDocument() == 0) {
            return false;
        } else
        return (Client.documentValidator(String.valueOf(client.getDocument())));
    }
    
}
