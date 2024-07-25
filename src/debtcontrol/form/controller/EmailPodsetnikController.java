/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.model.Korisnik;
import debtcontrol.repository.KorisnikInterface;
import debtcontrol.repository.PoslatiMailInterface;
import debtcontrol.repositoryImpl.KorisnikInterfaceImpl;
import debtcontrol.repositoryImpl.PoslatiMailInterfaceImpl;
import debtcontrol.table.TabelaKorisnik;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class EmailPodsetnikController {
    
    public static void posaljiPodsetnikPoruku(){
        
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        PoslatiMailInterface poslatiMailInterface = new PoslatiMailInterfaceImpl();
        
          List<Korisnik> korisnici = korisnikInterface.listaAktivnihKorisnika();
       
        int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA  POŠALJETE E-MAIL PODSETNIK KORISNICIMA DA IZMIRE SVOJE RAČUNE" );

        if (odgovor == JOptionPane.NO_OPTION) {
            return;
        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
            return;
        }   else if (odgovor == JOptionPane.CANCEL_OPTION) {
            return;

        } else if (odgovor == JOptionPane.YES_OPTION ) {
       
       for(Korisnik k : korisnici){

        
        String poruka = " Poštovani,\n \n"
                    + "Najljubaznije bismo Vas zamolili da, u najkracem mogućem roku, izmirite Vaš  račun(e)  u Klubu zaposlenih    "  + "\n \n"
                    
              
                    + "Srdačan pozdrav,\n"
                    + "Služba usluga";

            poslatiMailInterface.poslatiMail(k.getMail().trim(), poruka);    //"smehmedoviccc@gmail.com"
       }
        }
        
        
    }
    
    public static void popuniTabeluKorisnici(JTable tblKorisnici){
        
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        
            List<Korisnik> korisnici = korisnikInterface.listaAktivnihKorisnika();
    
    TableModel tm = new TabelaKorisnik(korisnici);
    tblKorisnici.setModel(tm);
    }
    
    
}
