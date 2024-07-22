/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.form.DodajProizvodForm;
import debtcontrol.model.JedinicaMere;
import debtcontrol.model.Proizvod;
import debtcontrol.repository.ProizvodInterface;
import debtcontrol.repositoryImpl.ProizvodInterfaceImpl;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author podrska
 */
public class DodajProizvodController {
    
        public static void sacuvajProizvod(JTextField txtNazivProizvoda, JTextField txtCenaProizvoda, JTextField txtKolicina, DodajProizvodForm proizvodForm, JComboBox comboBoxJedinicaMere){
      
        ProizvodInterface proizvodInterface = new ProizvodInterfaceImpl();
        
        
        if (txtNazivProizvoda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NIste uneli naziv proizvoda na adekvatan način ");
            
            return;
        }

        if (txtCenaProizvoda.getText().isEmpty() || !txtCenaProizvoda.getText().matches("[0-9]*\\.?[0-9]+")) {
            JOptionPane.showMessageDialog(null, "NIste uneli cenu na odgovarajuci način");
            txtCenaProizvoda.setText("");
            return;
        }

        if (txtKolicina.getText().isEmpty() || !txtKolicina.getText().matches("[0-9]*\\.?[0-9]+")) {
            JOptionPane.showMessageDialog(null, "NIste uneli količinu na odgovarajući način");
            txtKolicina.setText("");
            return;
        }

        Proizvod p = new Proizvod(0, txtNazivProizvoda.getText().trim(), Double.parseDouble(txtCenaProizvoda.getText().trim()), comboBoxJedinicaMere.getSelectedItem().toString(), Double.parseDouble(txtKolicina.getText().trim()), null);
        try {
            proizvodInterface.dodajNoviProizvod(p);
            System.out.println("Unet je proizvod u bazu");
            proizvodForm.dispose();
        } catch (Exception e) {
            System.out.println("Nije sacuvan proizvod " + e.getMessage());
        }
    }
    
    public static void popuniCombo(JComboBox comboBoxJedinicaMere){
        
         for (JedinicaMere jedMere : JedinicaMere.values()) {
            comboBoxJedinicaMere.addItem(jedMere.toString());
        }
        
    }

    
}
