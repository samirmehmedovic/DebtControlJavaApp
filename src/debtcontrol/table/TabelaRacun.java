/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.table;

import debtcontrol.model.Korisnik;
import debtcontrol.model.Racun;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author podrska
 */
public class TabelaRacun extends AbstractTableModel {

    List<Racun> racuni;

    public TabelaRacun(List<Racun> racuni) {
        this.racuni = racuni;
    }
    
    

    @Override
    public int getRowCount() {
        return racuni.size();

    }

    @Override
    public int getColumnCount() {
        return 8;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Racun r = racuni.get(rowIndex);
        
        if (columnIndex == 0) {
            return rowIndex+1;
        }
        if (columnIndex == 1) {
            return r.getIdRacuna();
        }

        if (columnIndex == 2) {
            return r.getDatum();
        }
        if (columnIndex == 3) {
            return r.getKorisnik().getIme()+" "+r.getKorisnik().getPrezime();
        }
        if (columnIndex == 4) {
            return r.getStavke();                            //.toString();
        }
        if (columnIndex == 5) {
            return r.getUkupno();
        }
        if (columnIndex == 6) {
            return r.getStatus();
        }
        if (columnIndex == 7) {
            return "PREGLED";
        }

        return "N/A";

    }

    @Override
    public String getColumnName(int column) {

        if (column == 0) {
            return "BR";
        }
        if (column == 1) {
            return "ID RACUNA";
        }
        if (column == 2) {
            return "DATUM RACUNA";
        }
        if (column == 3) {
            return "KORISNIK";
        }
        if (column == 4) {
            return "STAVKE RACUNA";
        }
        if (column == 5) {
            return "UKUPAN IZNOS";
        }
         if (column == 6) {
            return "STATUS RACUNA";
        }
         if (column == 7) {
            return "PREGLED RACUNA";
        }

        return "N/A";

    }

    public Racun getSelectedRacun(int index) {
        if (racuni == null) {
            return null;
        }
        return racuni.get(index);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 7;
    }
    
    public Class<?> getColumnClass(int columnIndex){
        if (columnIndex==7){
            return JButton.class;
        }
        return String.class;
    }
    
    

   
    
    
    
    

}
