/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.form.DodajKorisnikaForm;
import debtcontrol.model.Korisnik;
import debtcontrol.repository.KorisnikInterface;
import debtcontrol.repositoryImpl.KorisnikInterfaceImpl;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author podrska
 */
public class DodajKorisnikaController {
    
        
    public static void sacuvajKorisnika(JTextField txtIme, JTextField txtPrezime, JTextField txtEmail,JRadioButton radioBtnPrihvata, JRadioButton radioBtnNePrihvata, JLabel lblErroIme,
                                    JLabel lblerrorPrezime, JLabel lblerrorMail, JLabel lblerrormailObavestavanje, DodajKorisnikaForm korsinikForm){
    
 //       try{
            
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        
                if (txtIme.getText().isEmpty()) {
    
            lblErroIme.setVisible(true);
            lblErroIme.setText("NISTE UNELI IME ");
            return;

        }

        if (txtPrezime.getText().isEmpty()) {
           
            lblerrorPrezime.setVisible(true);
            lblerrorPrezime.setText("NISTE UNELI PREZIME ");

            return;
        }

        if (txtEmail.getText().isEmpty()) {
           
            lblerrorMail.setVisible(true);
            lblerrorMail.setText("NISTE UNELI E-MAIL NA ODGOVARAJUĆI NAČIN");

            return;
        }


        if (!radioBtnNePrihvata.isSelected() && !radioBtnPrihvata.isSelected()) {

            JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI  E-MAIL OBAVEŠTENJE");

      //      lblerrormailObavestavanje.setVisible(true);
     //       lblerrormailObavestavanje.setText("NISTE SELEKTOVALI  E-MAIL OBAVEŠTENJE");
            return;

        }
        boolean prihvata = radioBtnPrihvata.isSelected();
        boolean nePrihvata = radioBtnNePrihvata.isSelected();

        if (prihvata) {

            Korisnik korisnik = new Korisnik(0, txtIme.getText().trim(), txtPrezime.getText().trim(), txtEmail.getText().trim(), true);
            korisnikInterface.dodajKorisnika(korisnik);
            
            
            System.out.println("Korisnik je " + korisnik);

            korsinikForm.dispose();
            
        } else if (nePrihvata) {
            Korisnik korisnik = new Korisnik(0, txtIme.getText().trim(), txtPrezime.getText().trim(), txtEmail.getText().trim(), false);
            korisnikInterface.dodajKorisnika(korisnik);

            System.out.println("Korisnik je " + korisnik);
            
            korsinikForm.dispose();
        }
        
//        }catch(Exception e){
//            System.out.println("Greska pri cuvanju korisnika " + e.getMessage());
//        }

        
    }
    
    
    public static void letterImeController (KeyEvent evt, JLabel lblErroIme ){
//         char c = evt.getKeyChar();
//
//        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
//            evt.consume();
//            lblErroIme.setVisible(true);
//            lblErroIme.setText("NISTE UNELI IME NA ODGOVARAJUCI NAČIN");
//        } else {
//            lblErroIme.setVisible(true);
//            lblErroIme.setText("");
//        }
        DodajKorisnikaController.letterImeController(evt, lblErroIme);
    }
    
    public static void letterPrezimeController (KeyEvent evt, JLabel lblerrorPrezime ){
//      char c = evt.getKeyChar();
//
//        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
//            evt.consume();
//            lblerrorPrezime.setVisible(true);
//            lblerrorPrezime.setText("NISTE UNELI PREZIME NA ODGOVARAJUCI NAČIN");
//
//        } else {
//            lblerrorPrezime.setVisible(true);
//            lblerrorPrezime.setText("");
 //       }
 
        DodajKorisnikaController.letterPrezimeController(evt, lblerrorPrezime);

    }

    
}
