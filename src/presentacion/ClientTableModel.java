
package presentacion;

import logica.Client;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import logica.ControllerClient;

/**
 * @version 0.1 -> 2014-11-11
 * @author marcos
 */
public class ClientTableModel extends AbstractTableModel {

    private ArrayList<Client> mDatos = ControllerClient.getClients();
    private final String[] aHeaders = {"Cedula", "Nombre", "Apellido", "Dirección", "Teléfono", "Correo"};

    public ClientTableModel() {
    }

    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    }
      
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Client client = mDatos.get(rowIndex);

        switch (columnIndex) {
            case 0:
                client.setDocument((int) value);
                break;
            case 1:
                client.setName((String) value);
                break;
            case 2:
                client.setLastName((String) value);
                break;
            case 3:
                client.setAddress((String) value);
                break;
            case 4:
                client.setPhone((String) value);
                break;
            case 5:
                client.setMail((String) value);
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
        Client c = mDatos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getDocument();
            case 1:
                return c.getName();
            case 2:
                return c.getLastName();
            case 3:
                return c.getAddress();
            case 4:
                return c.getPhone();
            case 5:
                return c.getMail();
        }
        return null;
    }

    @Override
    public String getColumnName(int i) {
        return aHeaders[i];
    }

    public void addRow(Client c) {
        mDatos.add(c);
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }

    public void deleteRow(int i) {
        mDatos.remove(mDatos.get(i));
        fireTableDataChanged();
    }
}
