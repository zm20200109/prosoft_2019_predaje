/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forme;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Profesor;

/**
 *
 * @author Acer
 */
public class ModelTabeleProfesor extends AbstractTableModel {
    
   private  List<Profesor> listaProfesora;
   private String[] kolone = {"Ime","Prezime","Zvanje","Status"};
    public ModelTabeleProfesor(List<Profesor> listaProfesora) {
        this.listaProfesora = listaProfesora;
    }
    
    
    
    @Override
    public int getRowCount() {
        return listaProfesora.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Profesor p = listaProfesora.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getIme();
            case 1:
                return p.getPrezime();
            case 2:
                return p.getZvanje();
            case 3:
                return p.getStatus();
            default:
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public List<Profesor> getListaProfesora() {
        return listaProfesora;
    }

    public void setListaProfesora(List<Profesor> listaProfesora) {
        this.listaProfesora = listaProfesora;
    }

    void azurirajTabelu() {
            fireTableDataChanged();
    }
    
    
    
}
