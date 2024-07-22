/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.form.IzvestajKorisnikaForm;
import debtcontrol.form.PregledRacunaForm;
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
import debtcontrol.table.TabelaRacun;
import debtcontrol.table.TabelaStavkeRacuna;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class IzvestajKorisnikaController {
        
    
    
    public static void listaSvihRacuna(JLabel lblRacuni,JTextField txtEmail,JTextField txtIme,JTable tblRacuniKorisnika,IzvestajKorisnikaForm ikf,
    
    JLabel lblIzvestajZaRacune,JTextField txtIznosRacuna){
        
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        RacunInterface racunInterface = new RacunInterfaceImpl();
        
         lblRacuni.setText("SVI RAČUNI");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k);

        System.out.println("Racuna ima " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);

        tblRacuniKorisnika.setModel(tm);

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer( new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));
        
         lblIzvestajZaRacune.setVisible(false);
         txtIznosRacuna.setVisible(false);
    }
    
    
    public static void listaPlacenihRacuna(JLabel lblRacuni,JTextField txtEmail,JTextField txtIme,JTable tblRacuniKorisnika,IzvestajKorisnikaForm ikf,
                                            JLabel lblIzvestajZaRacune,JTextField txtIznosRacuna){
        
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        RacunInterface racunInterface = new RacunInterfaceImpl();
        
         lblRacuni.setText("NEAKTIVNI - PLAĆENI");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je: " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k, Status.NEAKTIVAN_PLACEN);

        System.out.println("Lista je dugacka " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);

        tblRacuniKorisnika.setModel(tm);

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));
        
        lblIzvestajZaRacune.setVisible(true);
        lblIzvestajZaRacune.setText("UKUPAN IZNOS PLAĆENIH RAČUNA JE:  ");
        txtIznosRacuna.setVisible(true);
        
        double ukupanIznos =0;
        for(Racun r : racuni){
         ukupanIznos = ukupanIznos+r.getUkupno();   
        }
        txtIznosRacuna.setText(String.valueOf(ukupanIznos));
        
    }
    
       public static void listaNeplacenihRacuna(JLabel lblRacuni,JTextField txtEmail,JTextField txtIme,JTable tblRacuniKorisnika,IzvestajKorisnikaForm ikf,JLabel lblIzvestajZaRacune,JTextField txtIznosRacuna){

           KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        RacunInterface racunInterface = new RacunInterfaceImpl();
           
         lblRacuni.setText("AKTIVNI - NEPLAĆENI");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je: " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k, Status.AKTIVAN_NEPLACEN);

        System.out.println("Lista je dugacka " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);

        tblRacuniKorisnika.setModel(tm);
        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));

        lblIzvestajZaRacune.setVisible(true);
         lblIzvestajZaRacune.setText("UKUPAN IZNOS NEPLAĆENIH RAČUNA JE:  ");
        txtIznosRacuna.setVisible(true);
        
        double ukupanIznos =0;
        for(Racun r : racuni){
         ukupanIznos = ukupanIznos+r.getUkupno();   
        }
        txtIznosRacuna.setText(String.valueOf(ukupanIznos));
        
        
    }
       
        public static void listaStorniranihRacuna(JLabel lblRacuni,JTextField txtEmail,JTextField txtIme,JTable tblRacuniKorisnika,IzvestajKorisnikaForm ikf, Status status, JLabel lblIzvestajZaRacune,JTextField txtIznosRacuna){
            
        KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        RacunInterface racunInterface = new RacunInterfaceImpl();
           
         lblRacuni.setText("AKTIVNI - NEPLAĆENI");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je: " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k, Status.STORNIRAN_GRESKA);

        System.out.println("Lista je dugacka " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);

        tblRacuniKorisnika.setModel(tm);
        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));
        
        lblIzvestajZaRacune.setVisible(true);
         lblIzvestajZaRacune.setText("UKUPAN IZNOS STORNIRANIH RAČUNA JE:  ");
        txtIznosRacuna.setVisible(true);
        
        double ukupanIznos =0;
        for(Racun r : racuni){
         ukupanIznos = ukupanIznos+r.getUkupno();   
        }
        txtIznosRacuna.setText(String.valueOf(ukupanIznos));
        
            
        }
        
        public static void listaRacuna(JLabel lblRacuni,JTextField txtEmail,JTextField txtIme,JTable tblRacuniKorisnika,IzvestajKorisnikaForm ikf, Status status){

        
          KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
        RacunInterface racunInterface = new RacunInterfaceImpl();
        
        if(status.values().toString().equals("NEAKTIVAN_PLACEN")){
           
         lblRacuni.setText("NEAKTIVNI - PLAĆENI");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je: " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k, Status.NEAKTIVAN_PLACEN);

        System.out.println("Lista je dugacka " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);
        
        }
        else if(status.values().toString().equals("AKTIVAN_NEPLACEN")){
            
            lblRacuni.setText("AKTIVNI - NEPLAĆENI");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je: " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k, Status.AKTIVAN_NEPLACEN);

        System.out.println("Lista je dugacka " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);
        }
        else if(status.values().toString().equals("STORNIRAN_GRESKA")){
           
            lblRacuni.setText("STORNIRANI");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je: " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k, Status.STORNIRAN_GRESKA);

        System.out.println("Lista je dugacka " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);

        tblRacuniKorisnika.setModel(tm);
        }
        
        
        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));
                }
        
        
        public static void platiRacun(JTextField txtIme,JTextField txtPrezime,JTextField txtEmail,JTable tblRacuniKorisnika ){
            
            RacunInterface racunInterface = new RacunInterfaceImpl();
            KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
            StavkeRacunaInterface stavkeRacunaInterface = new StavkaRacunaInterfaceImpl();
            ProizvodInterface proizvodInterface = new ProizvodInterfaceImpl();
            PoslatiMailInterface poslatiMailInterface = new PoslatiMailInterfaceImpl();
            
            
//            int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA IZMIRITE RAČUN I POŠALJETE E-MAIL KORISNIKU " + txtIme.getText().trim() + " " + txtPrezime.getText().trim() + " NA E-MAIL ADRESU: " + txtEmail.getText().trim());
//
//        if (odgovor == JOptionPane.NO_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.CANCEL_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.YES_OPTION) {
//
//            int selectedRow = tblRacuniKorisnika.getSelectedRow();
//
//            if (selectedRow == -1) {
//                JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI RAČUN KOJI ŽELITE DA PLATITE");
//                return;
//            } else {
//                TabelaRacun tr = (TabelaRacun) tblRacuniKorisnika.getModel();
//
//                Racun r = tr.getSelectedRacun(selectedRow);
//                if ((r.getStatus().equals(Status.STORNIRAN_GRESKA)) || (r.getStatus().equals(Status.NEAKTIVAN_PLACEN))) {
//                    JOptionPane.showMessageDialog(null, "OVAJ RAČUN JE PlAĆEN ILI JE STORNIRAN I NE MOŽE SE IZMIRITI");
//                    return;
//                }
//
//                racunInterface.platiRacun(r.getIdRacuna());
//                List<StavkaRacuna> stavke = stavkeRacunaInterface.stavkePoRacunu(r.getIdRacuna());
//                for (int i = 0; i < stavke.size(); i++) {
//                    proizvodInterface.oduzmiSaStanjaProizvoda(stavke.get(i).getProizvod(), stavke.get(i).getKolicina());
//                }
//
//                LocalDate datum = LocalDate.now();
//                DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
//
//                String datumFormat = datum.format(formater);
//
//                String poruka = " Poštovani,\n"
//                        + "Danas, " + datumFormat + " u Klubu zaposlenih platili ste račun broj: " + r.getIdRacuna() + " u iznosu od  " + r.getUkupno() + " dinara\n" + "\n"
//                        + "Srdačan pozdrav,\n"
//                        + "Služba usluga";
//
//                poslatiMailInterface.poslatiMail(txtEmail.getText().trim(), poruka);    //"smehmedoviccc@gmail.com"
//
//             
//                popuniTabeluRacuniKorisnika(tblRacuniKorisnika, txtEmail, txtIme);
//
//            }
//        }




            int selectedRow = tblRacuniKorisnika.getSelectedRow();

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI RAČUN KOJI ŽELITE DA PLATITE");
                return;
            } else {
                TabelaRacun tr = (TabelaRacun) tblRacuniKorisnika.getModel();

                Racun r = tr.getSelectedRacun(selectedRow);
                if ((r.getStatus().equals(Status.STORNIRAN_GRESKA)) || (r.getStatus().equals(Status.NEAKTIVAN_PLACEN))) {
                    JOptionPane.showMessageDialog(null, "OVAJ RAČUN JE PlAĆEN ILI JE STORNIRAN I NE MOŽE SE IZMIRITI");
                    return;
                }
                 int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA IZMIRITE RAČUN I POŠALJETE E-MAIL KORISNIKU " + txtIme.getText().trim() + " " + txtPrezime.getText().trim() + " NA E-MAIL ADRESU: " + txtEmail.getText().trim());

                if (odgovor == JOptionPane.NO_OPTION) {
                     return;
                } else if (odgovor == JOptionPane.CLOSED_OPTION) {
                     return;
                } else if (odgovor == JOptionPane.CANCEL_OPTION) {
                    return;
                } else if (odgovor == JOptionPane.YES_OPTION) {


                racunInterface.platiRacun(r.getIdRacuna());
                List<StavkaRacuna> stavke = stavkeRacunaInterface.stavkePoRacunu(r.getIdRacuna());
                for (int i = 0; i < stavke.size(); i++) {
                    proizvodInterface.oduzmiSaStanjaProizvoda(stavke.get(i).getProizvod(), stavke.get(i).getKolicina());
                }

                
                
                
                
                LocalDate datum = LocalDate.now();
                DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd.MM.yyyy.");

                String datumFormat = datum.format(formater);

                String poruka = " Poštovani,\n"
                        + "Danas, " + datumFormat + " u Klubu zaposlenih platili ste račun broj: " + r.getIdRacuna() + " u iznosu od  " + r.getUkupno() + " dinara\n" + "\n"
                        + "Srdačan pozdrav,\n"
                        + "Služba usluga";

                poslatiMailInterface.poslatiMail(txtEmail.getText().trim(), poruka);    //"smehmedoviccc@gmail.com"

                    popuniTabeluRacuniKorisnika(tblRacuniKorisnika, txtEmail, txtIme);

            }
        }
        }
        
        public static void popuniTabeluRacuniKorisnika(JTable tblRacuniKorisnika, JTextField txtEmail,JTextField txtIme ){
            RacunInterface racunInterface = new RacunInterfaceImpl();
            KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
            
             Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        List<Racun> racuni = racunInterface.listaRacuna(k, Status.AKTIVAN_NEPLACEN);

        TableModel tm = new TabelaRacun(racuni);
        tblRacuniKorisnika.setModel(tm);
        }
        
        public static void popuniTabeluKorisnici(JTable tblIzvestajKorisnika){
            
            KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
            
             List<Korisnik> korisnici = korisnikInterface.listaKorisnika();

        TableModel tm = new TabelaKorisnik(korisnici);
        tblIzvestajKorisnika.setModel(tm);
            
            
        }
        
        
        public static void stornirajRacun(JTextField txtIme,JTextField txtPrezime,JTextField txtEmail,JTable tblRacuniKorisnika ){

            RacunInterface racunInterface = new RacunInterfaceImpl();
            KorisnikInterface korisnikInterface = new KorisnikInterfaceImpl();
            StavkeRacunaInterface stavkeRacunaInterface = new StavkaRacunaInterfaceImpl();
            ProizvodInterface proizvodInterface = new ProizvodInterfaceImpl();
            PoslatiMailInterface poslatiMailInterface = new PoslatiMailInterfaceImpl();
            
            
//        int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA STORNIRATE RAČUN I POŠALJETE E-MAIL KORISNIKU " + txtIme.getText().trim() + " " + txtPrezime.getText().trim() + " NA E-MAIL ADRESU: " + txtEmail.getText().trim());
//
//        if (odgovor == JOptionPane.NO_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.CANCEL_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.YES_OPTION) {
//
//            int selectetedRow = tblRacuniKorisnika.getSelectedRow();
//
//            if (selectetedRow == -1) {
//                JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI RAČUN KOJI ŽELITE DA STORNIRATE");
//                return;
//            } else {
//                TabelaRacun tr = (TabelaRacun) tblRacuniKorisnika.getModel();
//                Racun r = tr.getSelectedRacun(selectetedRow);
//
//                racunInterface.stornirajRacun(r);
//
//                List<StavkaRacuna> stavke = stavkeRacunaInterface.stavkePoRacunu(r.getIdRacuna());
//
//                for (int i = 0; i < stavke.size(); i++) {
//                    proizvodInterface.oduzmiSaStanjaProizvoda(stavke.get(i).getProizvod(), stavke.get(i).getKolicina());
//                }
//                popuniTabeluRacuniKorisnika(tblRacuniKorisnika, txtEmail, txtIme);
//
//           //     btnPlatiRacun.setVisible(false);
//
//                LocalDate datum = LocalDate.now();
//                DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
//
//                String datumFormat = datum.format(formater);
//
//                String poruka = " Poštovani,\n"
//                        + "Danas, " + datumFormat + " u Klubu zaposlenih storniran je Vaš račun, broj: " + r.getIdRacuna() + " u iznosu od  " + r.getUkupno() + " dinara\n" + "\n"
//                      
//                        + "Srdačan pozdrav,\n"
//                        + "Služba usluga";
//
//                poslatiMailInterface.poslatiMail(txtEmail.getText().trim(), poruka);    //"smehmedoviccc@gmail.com"
// 
//                    
//                }
//            
//        }



            int selectetedRow = tblRacuniKorisnika.getSelectedRow();

            if (selectetedRow == -1) {
                JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI RAČUN KOJI ŽELITE DA STORNIRATE");
                return;
            } else {
                TabelaRacun tr = (TabelaRacun) tblRacuniKorisnika.getModel();
                Racun r = tr.getSelectedRacun(selectetedRow);


            int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA STORNIRATE RAČUN I POŠALJETE E-MAIL KORISNIKU " + txtIme.getText().trim() + " " + txtPrezime.getText().trim() + " NA E-MAIL ADRESU: " + txtEmail.getText().trim());

                switch (odgovor) {
                    case JOptionPane.NO_OPTION:
                        return;
                    case JOptionPane.CLOSED_OPTION:
                        return;
                    case JOptionPane.CANCEL_OPTION:
                        return;
                    case JOptionPane.YES_OPTION:
                        racunInterface.stornirajRacun(r);
                        List<StavkaRacuna> stavke = stavkeRacunaInterface.stavkePoRacunu(r.getIdRacuna());
                        for (int i = 0; i < stavke.size(); i++) {
                            proizvodInterface.oduzmiSaStanjaProizvoda(stavke.get(i).getProizvod(), stavke.get(i).getKolicina());
                        }       popuniTabeluRacuniKorisnika(tblRacuniKorisnika, txtEmail, txtIme);
          //              btnPlatiRacun.setVisible(false);
                        LocalDate datum = LocalDate.now();
                        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
                        String datumFormat = datum.format(formater);
                       
                        
                        String poruka = " Poštovani,\n"
                                + "Danas, " + datumFormat + " u Klubu zaposlenih storniran je Vaš račun, broj: " + r.getIdRacuna() + " u iznosu od  " + r.getUkupno() + " dinara\n" + "\n"
                                
                                + "Srdačan pozdrav,\n"
                                + "Služba usluga";
                        poslatiMailInterface.poslatiMail(txtEmail.getText().trim(), poruka);    //"smehmedoviccc@gmail.com"
             //           dispose();
                        break;
                    default:
                        break;
                }
        }
        }
        
        public static void pregledRacuna(JTable tblRacuniKorisnika){
            
            int selectedRow = tblRacuniKorisnika.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI RAČUN KOJI ŽELITE DA POGLEDATE");
            return;
        }

        TabelaRacun tr = (TabelaRacun) tblRacuniKorisnika.getModel();

        Racun r = tr.getSelectedRacun(selectedRow);

        TableModel tm = new TabelaStavkeRacuna(r.getStavke());

        PregledRacunaForm prf = new PregledRacunaForm(null, true);
        prf.setData(String.valueOf(r.getIdRacuna()), r.getDatum().toString(), r.getKorisnik().getIme(), r.getKorisnik().getPrezime(), r.getKorisnik().getMail(), String.valueOf(r.getUkupno()), tm, r.getStatus());
        prf.setVisible(true);
        }
        
        
        public static void izaberiKorisnika(JTextField txtIme,JTextField txtPrezime,JTextField txtEmail,JTextField txtId,JTable tblIzvestajKorisnika,
                                            JPanel pnlIzvestaj, JTable tblRacuniKorisnika, JLabel lblRacuni, JLabel lblIzvestajZaRacune,JTextField txtIznosRacuna){
            
          RacunInterface racunInterface = new RacunInterfaceImpl();
            
            int selectedRow = tblIzvestajKorisnika.getSelectedRow();

        TabelaKorisnik tk = (TabelaKorisnik) tblIzvestajKorisnika.getModel();

        Korisnik k;

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "NISTE SELEКTOVALI KORISNIKA");
            return;
        } else {
            k = tk.getSelectedZaposleni(selectedRow);
            pnlIzvestaj.setVisible(true);

        }

        txtIme.setText(k.getIme());
        txtPrezime.setText(k.getPrezime());
        txtEmail.setText(k.getMail());
        txtId.setText(String.valueOf(k.getIdKorisnik()));

        List<Racun> racuni = racunInterface.listaRacuna(k, Status.AKTIVAN_NEPLACEN);

        TableModel tm = new TabelaRacun(racuni);
        tblRacuniKorisnika.setModel(tm);

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));

        lblRacuni.setText("AKTIVNI - NEPLACENI RACUNI");  
        
        lblIzvestajZaRacune.setVisible(false);
         txtIznosRacuna.setVisible(false);// TODO add your handling code here:
       
        }
        
    
}

 class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);

        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            setText((value == null) ? "PREGLED" : value.toString());
            return this;

        }
    }

    class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

        private final JButton button;

        private String label;
        private boolean isPushed;

        public ButtonEditor(JTable table) {
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(this);

        }

        @Override
        public Object getCellEditorValue() {

            return label;

        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {

            label = (value == null) ? "PREGLED" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;

        }

        public void actionPerformed(ActionEvent e, JTable tblRacuniKorisnika) {

            if (isPushed) {

                int selectedRow = tblRacuniKorisnika.getSelectedRow();

                TabelaRacun tr = (TabelaRacun) tblRacuniKorisnika.getModel();

                Racun r = tr.getSelectedRacun(selectedRow);

                List<StavkaRacuna> stavke = r.getStavke();

                TableModel tm = new TabelaStavkeRacuna(stavke);

                PregledRacunaForm prf = new PregledRacunaForm(null, true);
                prf.setData(String.valueOf(r.getIdRacuna()), r.getDatum().toString(), r.getKorisnik().getIme(), r.getKorisnik().getPrezime(), r.getKorisnik().getMail(), String.valueOf(r.getUkupno()), tm, r.getStatus());
                prf.setVisible(true);

            }
            isPushed = false;
            fireEditingStopped();

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
