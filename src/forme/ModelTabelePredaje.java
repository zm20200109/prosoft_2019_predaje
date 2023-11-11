/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forme;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Predaje;

/**
 *
 * @author Acer
 */
public class ModelTabelePredaje extends AbstractTableModel{
    List<Predaje> predaje = new ArrayList<>();
    String[] kolone = {"ime profesora","prezime profesora","naziv predmeta"};
    
    
    public ModelTabelePredaje(List<Predaje> predaje) {
        this.predaje = predaje;
    }

    public ModelTabelePredaje() {
    }
    
    
    
    @Override
    public int getRowCount() {
        return predaje.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Predaje p = predaje.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getPro().getIme();
            case 1:
                return p.getPro().getPrezime();
            case 2:
                return p.getPre().getNaziv();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    
    
}
