/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.table;

import debtcontrol.model.Proizvod;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import jdk.jfr.Enabled;

/**
 *
 * @author podrska
 */
public class TabelaProizvod extends AbstractTableModel {

    List<Proizvod> proizvodi;

    public TabelaProizvod(List<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }

    @Override
    public int getRowCount() {

        return proizvodi.size();

    }

    @Override
    public int getColumnCount() {

        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Proizvod p = proizvodi.get(rowIndex);
        if (columnIndex == 0) {
            return rowIndex + 1;
        }
        if (columnIndex == 1) {
            return p.getNaziv();
        }
        if (columnIndex == 2) {
            return p.getCena();
        }
        if (columnIndex == 3) {
            return p.getJedinicaMere();
        }
        if (columnIndex == 4) {
            return p.getKolicina();
        }
        if (columnIndex == 5) {
            return p.getKolicina() * p.getCena();
        }
        return "N/A";
    }

    @Override
    public String getColumnName(int column) {

        if (column == 0) {
            return "REDNI BROJ";
        }
        if (column == 1) {
            return "NAZIV";
        }
        if (column == 2) {
            return "CENA";
        }
        if (column == 3) {
            return "JEDINICA MERE";
        }
        if (column == 4) {
            return "KOLICINA";
        }
        if (column == 5) {
            return "UKUPNO";
        }
        return "N/A";

    }

    @Override
    public boolean isCellEditable(int row, int column) {

        return column == 4;

    }

    public Proizvod getSelectedProizvod(int index) {
        if (proizvodi == null) {
            return null;
        }
        return proizvodi.get(index);
    }

}
