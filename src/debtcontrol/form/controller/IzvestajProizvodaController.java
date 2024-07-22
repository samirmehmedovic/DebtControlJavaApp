/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.model.Proizvod;
import debtcontrol.repository.ProizvodInterface;
import debtcontrol.repositoryImpl.ProizvodInterfaceImpl;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author podrska
 */
public class IzvestajProizvodaController {
        
    public static void izvestajProizvoda(int br,Proizvod proizvod, JTextField txtNaziv,JTextField txtCena, JTextField txtStanje,
            JTextField txtUkupno,JTextField txtId,JPanel pnlPodaciOProizvodu){
        
        
        ProizvodInterface proizvodInterface = new ProizvodInterfaceImpl();
        
        proizvod = proizvodInterface.pronadjiProizvod(br);

        txtNaziv.setText(proizvod.getNaziv());
        txtCena.setText(String.valueOf(proizvod.getCena()));
        txtStanje.setText(String.valueOf(proizvod.getKolicina()));
        txtUkupno.setText(String.valueOf(proizvod.getKolicina() * proizvod.getCena()));
        txtId.setText(String.valueOf(proizvod.getIdProizvoda()));
        pnlPodaciOProizvodu.setVisible(true);
    }

}
