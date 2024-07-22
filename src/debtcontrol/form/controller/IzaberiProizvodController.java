/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.form.IzaberiProizvodForm;
import debtcontrol.model.Proizvod;
import debtcontrol.model.StavkaRacuna;
import debtcontrol.repository.ProizvodInterface;
import debtcontrol.repositoryImpl.ProizvodInterfaceImpl;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author podrska
 */
public class IzaberiProizvodController {
    
    
        public static void izaberiProizvod(JTextField txtNaziv, JTextField txtCena,JTextField txtId, int br){
        
        ProizvodInterface proizvodInterface = new ProizvodInterfaceImpl();
        
           Proizvod     proizvod = proizvodInterface.pronadjiProizvod(br);

        txtNaziv.setText(proizvod.getNaziv());
        txtCena.setText(String.valueOf(proizvod.getCena()));
        txtId.setText(String.valueOf(proizvod.getIdProizvoda()));
    }
    
    public static StavkaRacuna sacuvajProizvod(JTextField txtNaziv,JTextField txtCena, JTextField txtId, JSpinner jSpinner1, JDialog izaberiProizvodForm){
        ProizvodInterface proizvodInterface = new ProizvodInterfaceImpl();
        
        
        try{
        Proizvod p = proizvodInterface.pronadjiProizvod(Integer.parseInt(txtId.getText()));
        
        
        

      
//            if (txtNaziv.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "NISTE IZABRALI PROIZVOD");
//             return null;
//}

            Integer kolicina = (Integer) jSpinner1.getValue();
            int intValue = kolicina.intValue();

            if (intValue == 0) {
                JOptionPane.showMessageDialog(null, "NISTE UNELI KOLIČINU");
                return null;
            } else {
                
//                stavkaRacuna.setCenaProizvoda(Double.parseDouble(txtCena.getText()));
//                stavkaRacuna.setKolicina(intValue);
//                stavkaRacuna.setProizvod(p);
//                stavkaRacuna.setRacunId(0);
//                stavkaRacuna.setStavkaRacunaId(Integer.parseInt(txtid.getText().trim()));
//                stavkaRacuna.setUkupno(intValue* Double.parseDouble(txtCena.getText().trim()));
                
         StavkaRacuna       stavkaRacuna = new StavkaRacuna(0, intValue, Double.parseDouble(txtCena.getText().trim()), intValue * Double.parseDouble(txtCena.getText().trim()), 0, p);
               
                System.out.println("Stavka je: "+stavkaRacuna);
                                izaberiProizvodForm.dispose();

                return stavkaRacuna;
                
            }
            
             }catch(Exception e){
                    System.out.println("Proizvod nije pronadjen " +e.getMessage());
                    return  null;
                    }

 
    }
    
    public static void zatvoriProzor(IzaberiProizvodForm ipf){
        ipf.dispose();
    }
    
    public static void proveraProizvoda(JTextField txtNaziv, JSpinner jSpinner1){
        
        if (txtNaziv.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NISTE IZABRALI PROIZVOD");
             return ;
        }
    
}

    
}
