/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.table;

import debtcontrol.model.Korisnik;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author podrska
 */
public class TabelaKorisnikIzvestaj extends AbstractTableModel {

    List<Korisnik> korisnici;

    public TabelaKorisnikIzvestaj(List<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    @Override
    public int getRowCount() {

        return korisnici.size();

    }

    @Override
    public int getColumnCount() {

        return 5;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Korisnik k = korisnici.get(rowIndex);

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
        if (columnIndex == 5) {
            return "AKTIVAN";
        }
        return "N/A";
    }

    @Override
    public String getColumnName(int column) {

        if (column == 0) {
            return "ID ZAPOSLENIH";
        }
        if (column == 1) {
            return "Ime ";
        }
        if (column == 2) {
            return "Prezime";
        }
        if (column == 3) {
            return " E mail";
        }
        if (column == 4) {
            return " Obvestenje";
        }
        if (column == 5) {
            return "Aktivan";
        }
        return "N/A";
    }

}
