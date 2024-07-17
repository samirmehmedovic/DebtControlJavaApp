/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.table;

import debtcontrol.model.StavkaRacuna;
import debtcontrol.repository.StavkeRacunaInterface;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author podrska
 */
public class TabelaStavkeRacuna extends AbstractTableModel {

    List<StavkaRacuna> stavke;

    public TabelaStavkeRacuna(List<StavkaRacuna> stavke) {
        this.stavke = stavke;
    }

    @Override
    public int getRowCount() {

        return stavke.size();

    }

    @Override
    public int getColumnCount() {

        return 6;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        StavkaRacuna stavka = stavke.get(rowIndex);

        if (columnIndex == 0) {
            return rowIndex + 1;
        }

        if (columnIndex == 1) {
            return stavka.getRacunId();

        }
        if (columnIndex == 2) {
            return stavka.getProizvod().getNaziv();

        }
        if (columnIndex == 3) {
            return stavka.getKolicina();

        }
        if (columnIndex == 4) {
            return stavka.getCenaProizvoda();

        }
        if (columnIndex == 5) {
            return stavka.getUkupno();

        }

        return "N/A";

    }

    @Override
    public String getColumnName(int column) {

        if (column == 0) {
            return "RB";
        }
        if (column == 1) {
            return "RACUN ID";
        }
        if (column == 2) {
            return "PROIZVOD";
        }
        if (column == 3) {
            return "KOLICINA";
        }
        if (column == 4) {
            return "CENA";
        }
        if (column == 5) {
            return "UKUPNO";
        }

        return "N/A";

    }

    public StavkaRacuna getSelectedStavka(int index) {
        if (stavke == null) {
            return null;
        }

        return stavke.get(index);
    }

}
