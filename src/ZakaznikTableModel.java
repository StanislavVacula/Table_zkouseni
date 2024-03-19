import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.List;

public class ZakaznikTableModel extends AbstractTableModel {
    private List<Zakaznik> data;
    public ZakaznikTableModel(List<Zakaznik> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    public String getColumnName(int col){
        return switch (col){
            case 0 -> "Číslo řádku";
            case 1 -> "Jméno";
            case 2 -> "Počet písmen jména";
            default -> throw new IllegalArgumentException("Požadavek na neexistující číslo sloupce"+col +" Máme jen sloupce 0, 1 a 2!");
        };
    }
    public Class getColumnClass(int col){
        return switch (col){
            case 0 -> Integer.class;
            case 1 -> String.class;
            case 2 -> Integer.class;
            default -> throw new IllegalArgumentException("Požadavek na neexistující číslo sloupce"+col +" Máme jen sloupce 0, 1 a 2!");
        };
    }
    public boolean isCellEditable(int row, int col) {
        return true;  // or false for none editable columns
    }
    public void setValueAt(Object obj, int row, int col) {
        Zakaznik zakaznik = data.get(row);
        switch (col){
            case 0 -> zakaznik.setRadek((int)obj);
            case 1 -> zakaznik.setJmeno((String)obj);
            case 2 -> zakaznik.setPocetPismenVeJmene((int)obj);
            default -> throw new IllegalArgumentException("Požadavek na neexistující číslo sloupce"+col +" Máme jen sloupce 0, 1 a 2!");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zakaznik zakaznik = data.get(rowIndex);
        return switch (columnIndex){
            case 0 -> zakaznik.getRadek();
            case 1 -> zakaznik.getJmeno();
            case 2 -> zakaznik.getPocetPismenVeJmene();
            default -> throw new IllegalArgumentException("Požadavek na neexistující číslo sloupce"+columnIndex +" Máme jen sloupce 0, 1 a 2!");
        };
    }
}
