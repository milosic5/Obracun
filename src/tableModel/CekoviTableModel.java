package tableModel;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author view4
 */
public class CekoviTableModel extends AbstractTableModel {

    private String[] tableColumnsNames = {"ID", "Broj ceka", "Vrednost", "Datum realizacije", "Realizovan"};
    private Class[] classesColumns = {Integer.class, Integer.class, Integer.class, Date.class, Boolean.class};

    private ArrayList listaCekova = new ArrayList();

    @Override
    public int getRowCount() {
        return listaCekova.size();
    }

    @Override
    public int getColumnCount() {
        return tableColumnsNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return tableColumnsNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] element;
        try {
            element = (Object[]) listaCekova.get(rowIndex);
        } catch (Exception e) {
            return null;
        }
        return element[columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Object[] element = (Object[]) listaCekova.get(rowIndex);
        element[columnIndex] = aValue;
        fireTableDataChanged();

        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void insertRow(int id, int brojCeka, int vrednost, Date datumRealizacije, boolean realizovan) {
        Object[] allElements = {id, brojCeka, vrednost, datumRealizacije, realizovan};
        listaCekova.add(allElements);
        fireTableDataChanged();
    }

    public void removeRow(int row) {
        listaCekova.remove(row);
        fireTableDataChanged();
    }

    public void clearData() {
        listaCekova = new ArrayList();
        fireTableDataChanged();
    }
}
