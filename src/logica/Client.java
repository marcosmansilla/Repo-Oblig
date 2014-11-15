package logica;

import java.util.ArrayList;

/**
 * @version 0.1 -> 2014-09-08
 * @author Marcos
 */
public class Client {

    private int document;
    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String mail;
    private ArrayList <Rental> clientRentals;
    
    public Client(int doc, String name, String lastName) {
        this.document = doc;
        this.name = name;
        this.lastName = lastName;
    }
    
    // SETTERS
    public void setName(String newName) {
        this.name = newName;
    }
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    public void setDocument(int newDoc) {
        this.document = newDoc;
    }
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
    public void setPhone (String newPhone) {
        this.phone = newPhone;
    }
    public void setMail (String newMail) {
        this.mail = newMail;
    }
    public void addClientRentals(Rental clientRental) {
        this.clientRentals.add(clientRental);
    }
        
    // GETTERS
    public int getDocument() {
        return document;
    }
    public String getMail() {
        return mail;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName(boolean lastNameFirst) {
        String ret = name+" "+lastName;
        if (lastNameFirst) ret = lastName+" "+name;
            return ret.trim();
    }
    public String getFullName() {
        return getFullName(false);
    }
    public ArrayList <Rental> getClientRentals() {
        return clientRentals;
    }
   
    // métodos varios...
   
    // Coeficientes de validación cédula
    // 2987634
    public static boolean documentValidator(String ci) {
        boolean cedulaCorrecta = false;
        try {
            System.out.println("largo cedula es de " + ci.length());
            if (ci.length() == 8) {
                int[] coefValCedula = { 2, 9, 8, 7, 6, 3, 4};
                int verificador = Character.getNumericValue(ci.charAt(ci.length() - 1));
                int suma = 0;
                int digito = 0;
                int nextZeroValue = 0;
                String sumValue = String.valueOf(suma);
                
                for (int i = 0; i < (ci.length() - 1); i++) {
                    digito = Character.getNumericValue(ci.charAt(i)) * coefValCedula[i];
                    suma += digito;
                }
                if (Character.getNumericValue(sumValue.charAt(sumValue.length() - 1)) == verificador) return true;
                nextZeroValue = suma;
                while ((nextZeroValue%10) != 0) nextZeroValue++;

                if (suma < nextZeroValue && nextZeroValue - suma == verificador) return true;
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception e) {
            System.out.println("Una excepcion ocurrió en el proceso de validación");
            cedulaCorrecta = false;
        }
        return cedulaCorrecta;
    }

}
