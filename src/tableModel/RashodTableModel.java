
package tableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author view4
 */
public class RashodTableModel extends AbstractTableModel {

    private String[] tableColumnsNames = {"ID", "Naziv", "Planirana", "Realizovana"};
    private Class[] classesColumns = {Integer.class, String.class, Integer.class, Integer.class};

    private ArrayList listaRashoda = new ArrayList();

    public int initialCapacity = 2;
    boolean[][] canEdit = new boolean[initialCapacity][4];

    @Override
    public int getRowCount() {
        return listaRashoda.size();
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
            element = (Object[]) listaRashoda.get(rowIndex);
        } catch (Exception e) {
            return null;
        }
        return element[columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Object[] element = (Object[]) listaRashoda.get(rowIndex);
        element[columnIndex] = aValue;
        fireTableDataChanged();

        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void insertRow(int id, String naziv, int planirana_vrednost, int realizovana_vrednost) {
        Object[] allElements = {id, naziv, planirana_vrednost, realizovana_vrednost};
        listaRashoda.add(allElements);
        fireTableDataChanged();
    }

    public void removeRow(int row) {
        listaRashoda.remove(row);
        fireTableDataChanged();
    }

    public void clearData() {
        listaRashoda = new ArrayList();
        fireTableDataChanged();
    }
}
