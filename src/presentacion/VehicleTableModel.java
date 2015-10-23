/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentacion;

import logica.Vehicle;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
import logica.CommonCar;
import logica.ControllerVehicle;

/**
 * @version 0.1 -> 2014-11-17
 * @author Marcos
 */
public class VehicleTableModel extends AbstractTableModel {
    
    private ArrayList<Vehicle> mDatos = ControllerVehicle.getVehicles();
    private final String[] aHeaders = {"Marca","Modelo","Año","Chapa","Precio Por Dia","Kilometraje","Puertas"};
    
    public VehicleTableModel(){}

    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Vehicle vehicle = mDatos.get(rowIndex);

        switch (columnIndex) {
            case 0:
                vehicle.setBrand((String) value);
                break;
            case 1:
                vehicle.setModel((String) value);
                break;
            case 2:
                vehicle.setYear((Date) value);
                break;
            case 3:
                vehicle.setPlate((String) value);
                break;
            case 4:
                vehicle.setPricePerDay((double) value);
                break;
            case 5:    
                vehicle.setKilometer((int) value);
                break;
            case 6:
                if (vehicle instanceof CommonCar) {
                    ((CommonCar)vehicle).setDoorQty((short) value);
                }
                break;
        }
    }
    
    @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }
    
    @Override
    public int getRowCount() {
        if (mDatos == null) {
            return 0;
        }
        return mDatos.size();
    }

    @Override
    public int getColumnCount() {
        return aHeaders.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vehicle v = mDatos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return v.getBrand();
            case 1:
                return v.getModel();
            case 2:
                return v.getYear();
            case 3:
                return v.getPlate();
            case 4:
                return v.getPricePerDay();
            case 5:
                return v.getKilometer();
            case 6:
                if (v instanceof CommonCar) return ((CommonCar)v).getDoorQty();
                else return "";
        }
        return null;
    }
       @Override
    public String getColumnName(int i) {
        return aHeaders[i];
    }

    public void addRow(Vehicle v) {
        mDatos.add(v);
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }

    public void deleteRow(int i) {
        mDatos.remove(mDatos.get(i));
        fireTableDataChanged();
    }    
}
