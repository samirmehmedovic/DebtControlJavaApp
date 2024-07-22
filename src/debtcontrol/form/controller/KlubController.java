/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.form.DodajKorisnikaForm;
import debtcontrol.form.DodajProizvodForm;
import debtcontrol.form.IzvestajKorisnikaForm;
import debtcontrol.form.IzvestajProizvodaForm;
import debtcontrol.form.IzvestajRacunaForm;
import debtcontrol.form.ListaKorisnikaForm;
import debtcontrol.form.ListaProizvodaForm;
import debtcontrol.form.RacunForm;

/**
 *
 * @author podrska
 */
public class KlubController {
    
    public static void dodajProizvodForm (){
         
       
        
        DodajProizvodForm proizvodForm = new DodajProizvodForm(null, true);
        proizvodForm.setVisible(true);
        
        
    }
     public static void dodajRacunForm (){
            RacunForm racunForm = new RacunForm(null, true);
        racunForm.setVisible(true);
     
     }
        public static void dodajKorinikaForm (){
          DodajKorisnikaForm dzf = new DodajKorisnikaForm(null, true);
        dzf.setVisible(true);
     }
           public static void dodajListuKorisnikaForm (){
                       ListaKorisnikaForm lzf = new ListaKorisnikaForm(null, true);
        lzf.setVisible(true);
     
     }
              public static void dodajIzvestajRacunaForm (){
                      IzvestajRacunaForm irf = new IzvestajRacunaForm(null, true);
        irf.setVisible(true);
     
     }
                 public static void dodajIzvestajKorisnikaForm (){
                     IzvestajKorisnikaForm ikf = new IzvestajKorisnikaForm(null, true);
        ikf.setVisible(true);
     
     }
                    public static void dodajListuProizvodaForm (){
     
                               ListaProizvodaForm lpf = new ListaProizvodaForm(null, true);
        lpf.setVisible(true);
     }
                       public static void dodajIzvestajProizvodaForm (){
                            IzvestajProizvodaForm ipf = new IzvestajProizvodaForm(null, true);
        ipf.setVisible(true);

     
     }
                          
                              

    
}
