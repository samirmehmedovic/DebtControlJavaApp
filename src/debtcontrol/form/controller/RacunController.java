/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import com.toedter.calendar.JDateChooser;
import debtcontrol.form.IzaberiProizvodForm;
import debtcontrol.model.Korisnik;
import debtcontrol.model.Racun;
import debtcontrol.model.Status;
import debtcontrol.model.StavkaRacuna;
import debtcontrol.repository.KorisnikInterface;
import debtcontrol.repository.PoslatiMailInterface;
import debtcontrol.repository.ProizvodInterface;
import debtcontrol.repository.RacunInterface;
import debtcontrol.repository.StavkeRacunaInterface;
import debtcontrol.repositoryImpl.KorisnikInterfaceImpl;
import debtcontrol.repositoryImpl.PoslatiMailInterfaceImpl;
import debtcontrol.repositoryImpl.ProizvodInterfaceImpl;
import debtcontrol.repositoryImpl.RacunInterfaceImpl;
import debtcontrol.repositoryImpl.StavkaRacunaInterfaceImpl;
import debtcontrol.table.TabelaKorisnik;
import debtcontrol.table.TabelaStavkeRacuna;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class RacunController {
    
        public static void izaberiKorisnika(JPanel pnlRacun, JTable tblKorisnici, JTextField txtIme,JTextField txtPrezime,JTextField txtEmail,
            JDateChooser jDateChooser1){
         pnlRacun.setVisible(true);
        int selectedRow = tblKorisnici.getSelectedRow();
        TabelaKorisnik tz = (TabelaKorisnik) tblKorisnici.getModel();

        Korisnik k = tz.getSelectedZaposleni(selectedRow);

        txtIme.setText(k.getIme());
        txtPrezime.setText(k.getPrezime());
        txtEmail.setText(k.getMail());

        jDateChooser1.setDate(new Date());

        LocalDate ld = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        
        
        
    }
    
    public static void unesiteProizvodeUListu(IzaberiProizvodForm izaberiProizvodForm, List<StavkaRacuna>stavke, JTextField txtUkupno, JTable tblStavkeRacuna){
        
       izaberiProizvodForm = new IzaberiProizvodForm(null, true);
        izaberiProizvodForm.setVisible(true);
        izaberiProizvodForm.setLocationRelativeTo(null);
        
        if(izaberiProizvodForm.vratiStavku()==null){
            return;
        }
        stavke.add(izaberiProizvodForm.vratiStavku());
        popuniTabeluStavkeRacuna(tblStavkeRacuna, stavke);
        ukupno(0, txtUkupno, stavke);

    }


    
    public static double ukupno(double ukupno, JTextField txtUkupno, List<StavkaRacuna>stavke){
        
        if(stavke==null){
            
        }
        ukupno = 0;
        for (int i = 0; i < stavke.size(); i++) {

            ukupno = ukupno + stavke.get(i).getUkupno();
            System.out.println(stavke.get(i).toString());

        }
        txtUkupno.setText(String.valueOf(ukupno));
        return ukupno;

        
    }
    
    public static void popuniTabeluStavkeRacuna(JTable tblStavkeRacuna, List<StavkaRacuna>stavke){
        
        
        List<StavkaRacuna> stavkeRacuna = stavke;

        TableModel tb = new TabelaStavkeRacuna(stavkeRacuna);
        tblStavkeRacuna.setModel(tb);
        System.out.println("Lista p ima proizvoda" + stavkeRacuna.size());
        
        System.out.println(stavke.toString());
    }
    
    
    public static void sacuvajRacun(JDateChooser jDateChooser1,JTextField txtEmail,JTextField txtUkupno,List<StavkaRacuna>stavke,JTable  tblStavkeRacuna, JDialog racunForm,
                                JTextField txtIme,JTextField txtPrezime, double ukupno){
        
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        RacunInterface racunInterfacea = new RacunInterfaceImpl();
        StavkeRacunaInterface stavkeRacunaInterface = new StavkaRacunaInterfaceImpl();
        ProizvodInterface proizvodInterface = new ProizvodInterfaceImpl();
        PoslatiMailInterface poslatiMailInterface = new PoslatiMailInterfaceImpl();
        
       ukupno =  ukupno(0, txtUkupno, stavke);
          jDateChooser1.setDate(new Date());

        LocalDate ld = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        System.out.println("Datum je " + ld);

        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), "");
        System.out.println("email je " + txtEmail.getText().trim());
        
        
        if (k.isMailObavestenja() == false) {
            JOptionPane.showMessageDialog(null, "OVAJ KORISNIK NE ŽELI DA MU SE POŠALJE E-MAIL OBAVEŠTENJA");
            Racun racun = new Racun(0, ld, stavke, ukupno, k, Status.AKTIVAN_NEPLACEN);

            int id = racunInterfacea.dodajRacunIvratiId(racun);

            TabelaStavkeRacuna tsr = (TabelaStavkeRacuna) tblStavkeRacuna.getModel();

            List<StavkaRacuna> stavkeRacuna = new ArrayList<>();

            for (int i = 0; i < stavke.size(); i++) {
                StavkaRacuna sr = tsr.getSelectedStavka(i);
                sr.setRacunId(id);
                stavkeRacuna.add(sr);
                stavkeRacunaInterface.dodajStavkaRacuna(sr);
                proizvodInterface.dodajNaStanjeProizvoda(sr.getProizvod(), sr.getKolicina());
            }
            racunForm.dispose();
            return;
             
        }

        int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA SAČUVATE RAČUN I POŠALJETE E-MAIL KORISNIKU " + txtIme.getText().trim() + " " + txtPrezime.getText().trim() + " NA E-MAIL ADRESU: " + txtEmail.getText().trim());

        if (odgovor == JOptionPane.NO_OPTION) {
            return;
        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
            return;

        } else if (odgovor == JOptionPane.YES_OPTION && k.isMailObavestenja() == true) {

            Racun racun = new Racun(0, ld, stavke, ukupno, k, Status.AKTIVAN_NEPLACEN);

            int id = racunInterfacea.dodajRacunIvratiId(racun);

            TabelaStavkeRacuna tsr = (TabelaStavkeRacuna) tblStavkeRacuna.getModel();

            List<StavkaRacuna> stavkeRacuna = new ArrayList<>();

            for (int i = 0; i < stavke.size(); i++) {
                StavkaRacuna sr = tsr.getSelectedStavka(i);
                sr.setRacunId(id);
                stavkeRacuna.add(sr);
                stavkeRacunaInterface.dodajStavkaRacuna(sr);
                proizvodInterface.dodajNaStanjeProizvoda(sr.getProizvod(), sr.getKolicina());
            }

            SimpleDateFormat datum = new SimpleDateFormat("dd.MM.yyyy.", new Locale("sr", "RS"));
            jDateChooser1.setDateFormatString(datum.toPattern());
            String datumFormat = datum.format(jDateChooser1.getDate());
       
            double ukupnoZaduzenje = 0;

            List<Racun> racuniPoKorisniku = racunInterfacea.listaRacuna(k, Status.AKTIVAN_NEPLACEN);

            for (Racun r : racuniPoKorisniku) {
                ukupnoZaduzenje = r.getUkupno() + ukupnoZaduzenje;
            }

            String poruka = " Poštovani,\n"
                    + "Danas, " + datumFormat + " u Klubu zaposlenih niste izmirilli račun u iznosu od  " + txtUkupno.getText() + " dinara\n" + "\n"
                    + "BR RACUNA: " + id + "\n"
                    + stavke.toString() + "\n"
                 

                    + "\n A ukupno zaduženje po svim neplaćenim računima je: " + ukupnoZaduzenje + "\n" + "\n"
                    + "Srdačan pozdrav,\n"
                    + "Služba usluga";

            poslatiMailInterface.poslatiMail(txtEmail.getText().trim(), poruka);    //"smehmedoviccc@gmail.com"
            racunForm.dispose();
    }
    }
    
    public static void obrisiProizvodIzListe(JTable tblStavkeRacuna, List<StavkaRacuna>stavke, double ukupno, JTextField txtUkupno){
        
        if (tblStavkeRacuna.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "SELEKTUJTE PROIZVOD KOJI ŽELITE DA UKLONITE IZ LISTE ");
            return;
        }
        int selectedStavka = tblStavkeRacuna.getSelectedRow();

        TabelaStavkeRacuna tp = (TabelaStavkeRacuna) tblStavkeRacuna.getModel();
        StavkaRacuna sr = tp.getSelectedStavka(selectedStavka);

        stavke.remove(sr);
        System.out.println("Obrisana stavka " + sr.toString());
        popuniTabeluStavkeRacuna(tblStavkeRacuna, stavke);
        ukupno = ukupno(0, txtUkupno, stavke);
       
    }
    
    public static void pronadjiKorisnika(JTextField txtImeKorisnika, JTable tblKorisnici){
        
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        
              List<Korisnik> novaLista = new ArrayList<>();
        String searchTherm = txtImeKorisnika.getText().toLowerCase();

        List<Korisnik> trazeniKorisnici = korisnikInterface.listaKorisnika().stream().filter(item -> item.getIme().toLowerCase().startsWith(searchTherm)).collect(Collectors.toList());
        novaLista.clear();

        for (Korisnik k : trazeniKorisnici) {
            novaLista.add(k);
        }

        TableModel tm = new TabelaKorisnik(novaLista);
        tblKorisnici.setModel(tm);
    }
    
    public static void popuniTabeluKorisnici(JTable tblKorisnici){
        
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        
         List<Korisnik> korisnici = korisnikInterface.listaKorisnika();   // ovo mora da se inicijalizuje preko repozitorijuma ;
        TableModel tb = new TabelaKorisnik(korisnici);
        tblKorisnici.setModel(tb);
    }

    
}
