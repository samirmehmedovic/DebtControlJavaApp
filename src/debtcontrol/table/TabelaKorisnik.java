/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.table;

import debtcontrol.model.Korisnik;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author podrska
 */
public class TabelaKorisnik extends AbstractTableModel {

    List<Korisnik> korisnik;

    public TabelaKorisnik(List<Korisnik> korisnik) {
        this.korisnik = korisnik;
    }

    @Override
    public int getRowCount() {
        return korisnik.size();
    }

    @Override
    public int getColumnCount() {

        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Korisnik k = korisnik.get(rowIndex);
        if (columnIndex == 0) {
            return k.getIdKorisnik();
        }
        if (columnIndex == 1) {
            return k.getIme();
        }
        if (columnIndex == 2) {
            return k.getPrezime();
        }
        if (columnIndex == 3) {
            return k.getMail();
        }
        if (columnIndex == 4) {
            return k.isMailObavestenja();
        }
        return "N/A";
    }

    @Override
    public String getColumnName(int column) {

        if (column == 0) {
            return "ID";
        }
        if (column == 1) {
            return "IME ";
        }
        if (column == 2) {
            return "PREZIME";
        }
        if (column == 3) {
            return "E-MAIL";
        }
        if (column == 4) {
            return "PRIHVATA OBAVESTENJE";
        }
        return "N/A";
    }

    public Korisnik getSelectedZaposleni(int index) {

        if (korisnik == null) {
            return null;
        }
        return korisnik.get(index);
    }
}
