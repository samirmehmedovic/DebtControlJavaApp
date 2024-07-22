/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.model.Korisnik;
import debtcontrol.repository.KorisnikInterface;
import debtcontrol.repositoryImpl.KorisnikInterfaceImpl;
import debtcontrol.table.TabelaKorisnik;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class LIstaKorisnikaController {
    
        public static void sacuvajKorisnika( JRadioButton radiooBtnPrihvata, JRadioButton radioBtnNePrihvata, JTextField txtIme,
            JTextField txtPrezime,JTextField txtEmail,JTextField txtId, JPanel pnlIzmeneKorisnika, JTable tblListaKorisnika ){
        
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        
         boolean prihvata = radiooBtnPrihvata.isSelected();
        boolean nePrihvata = radioBtnNePrihvata.isSelected();

        if (txtIme.getText().isEmpty() || txtIme.getText().matches(".*[\\d\\W].*")) {
            JOptionPane.showMessageDialog(null, "NIste uneli ime na adekvatan nacin ");
            return;
        }
        if (txtPrezime.getText().isEmpty() || txtPrezime.getText().matches(".*[\\d\\W].*")) {
            JOptionPane.showMessageDialog(null, "NIste uneli prezime na adekvatan nacin ");
            return;
        }
        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NIste uneli Email na adekvatan nacin ");
            return;
        }

        if (prihvata) {

            Korisnik korisnik = new Korisnik(Integer.parseInt(txtId.getText()), txtIme.getText().trim(), txtPrezime.getText().trim(), txtEmail.getText().trim(), true);
            korisnikInterface.izmeniKorisnika(korisnik);

            System.out.println("Korisnik je " + korisnik);

        } else if (nePrihvata) {
            Korisnik korisnik = new Korisnik(Integer.parseInt(txtId.getText()), txtIme.getText().trim(), txtPrezime.getText().trim(), txtEmail.getText().trim(), false);
            korisnikInterface.izmeniKorisnika(korisnik);

            System.out.println("Korisnik je " + korisnik);
        }

        popuniTabeluKorisnika(tblListaKorisnika);

        pnlIzmeneKorisnika.setVisible(false);

        
    }
    
    public static void popuniTabeluKorisnika(JTable tblListaKorisnika){
       
        
        
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        
        List<Korisnik> korisnici = korisnikInterface.listaKorisnika();

        TableModel tb = new TabelaKorisnik(korisnici);

        tblListaKorisnika.setModel(tb);
    }
    
    
    public static void odustani(JPanel pnlIzmeneKorisnika){
        
         pnlIzmeneKorisnika.setVisible(false);
//        populateTabele();
        
    }
    
    public static void obrisiKorisnika(JTable tblListaKorisnika){
        
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        
        
        int selectedRow = tblListaKorisnika.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI KORISNIKA KOJEG ŽELITE DA IZBRIŠETE");
            return;
        }

        int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA UKLONITE OVOG KORISNIKA IZ LISTE");

        if (odgovor == JOptionPane.NO_OPTION) {
            return;
        } else if (odgovor == JOptionPane.CANCEL_OPTION) {
            return;

        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
            return;
        } else if (odgovor == JOptionPane.YES_OPTION) {

            TabelaKorisnik tk = (TabelaKorisnik) tblListaKorisnika.getModel();
            Korisnik k = tk.getSelectedZaposleni(selectedRow);

            korisnikInterface.izbrisiKorisnika(k);
            popuniTabeluKorisnika(tblListaKorisnika);
        }
        
    }
    
    
    public static void izmeniKorisnika(JTable tblListaKorisnika, JPanel pnlIzmeneKorisnika,JTextField txtId, JTextField txtIme, 
           JTextField txtPrezime, JTextField txtEmail, JRadioButton radiooBtnPrihvata,JRadioButton radioBtnNePrihvata){
        
        
         int selectedRow = tblListaKorisnika.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI KORISNIKA");
            return;
        }
        pnlIzmeneKorisnika.setVisible(true);

        TabelaKorisnik tk = (TabelaKorisnik) tblListaKorisnika.getModel();

        Korisnik k = tk.getSelectedZaposleni(selectedRow);

        txtId.setText(String.valueOf(k.getIdKorisnik()));
        txtIme.setText(k.getIme());
        txtPrezime.setText(k.getPrezime());
        txtEmail.setText(k.getMail());


        if (k.isMailObavestenja() == true) {
            radiooBtnPrihvata.setSelected(true);
            radioBtnNePrihvata.setSelected(false);
        } else {
            radioBtnNePrihvata.setSelected(true);
            radiooBtnPrihvata.setSelected(false);
        }

        
    }
    
    public static void unosTeksta(KeyEvent evt, String polje){
          
        if(polje.toString().equals("ime")){
        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "NISTE UNELI IME NA ADEKVATAN NAČIN");
        } else {
            
        }
    } else if(polje.toString().equals("prezime")){
              char c = evt.getKeyChar();

        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "NISTE UNELI PREZIME  NA ADEKVATAN NAČIN, UNOSITE SLOVA");
        } else {

        }
    }  
    }

    
}
