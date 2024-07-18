/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package debtcontrol.form;

import debtcontrol.model.Korisnik;
import debtcontrol.model.Proizvod;
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
import debtcontrol.table.TabelaProizvod;
import debtcontrol.table.TabelaStavkeRacuna;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import java.util.stream.Collectors;

/**
 *
 * @author podrska
 */
public class RacunForm extends javax.swing.JDialog {

    RacunInterface racunInterfacea;
    KorisnikInterface korisnikInterface;
    PoslatiMailInterface poslatiMailInterface;
    ProizvodInterface proizvodInterface;
    DodajProizvodForm dodajProizvodForm;
    StavkeRacunaInterface stavkeRacunaInterface;
    List<StavkaRacuna> stavke;
    double ukupno;
    Racun r;

    /**
     * Creates new form RacunFormNew
     */
    public RacunForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        poslatiMailInterface = new PoslatiMailInterfaceImpl();
        racunInterfacea = new RacunInterfaceImpl();
        korisnikInterface = new KorisnikInterfaceImpl();
        proizvodInterface = new ProizvodInterfaceImpl();
        dodajProizvodForm = new DodajProizvodForm(null, true);
        stavkeRacunaInterface = new StavkaRacunaInterfaceImpl();

        pnlIzaberiZaposlenog.setVisible(true);
        pnlRacun.setVisible(false);
        stavke = new ArrayList<>();
        ukupno = 0;
        r = new Racun();

        populateTable();
        popuniTabeluStavkaRacuna();
        searchText();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIzaberiZaposlenog = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKorisnici = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtImeKorisnika = new javax.swing.JTextField();
        btnPronadjiKorisnika = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pnlRacun = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStavkeRacuna = new javax.swing.JTable();
        btnUnesiteProizvod = new javax.swing.JButton();
        btnSacuvajRacun = new javax.swing.JButton();
        lblIDRacun = new javax.swing.JLabel();
        txtIdRacuna = new javax.swing.JTextField();
        btnZatvori = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnObrisiProizvod = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUkupno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UNESITE NOVI RAČUN");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlIzaberiZaposlenog.setBackground(new java.awt.Color(204, 255, 204));
        pnlIzaberiZaposlenog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PRONADJITE KORISNIKA");

        tblKorisnici.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblKorisnici.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblKorisnici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKorisnici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKorisniciMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKorisnici);

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("DODAJ   KORISNIKA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPronadjiKorisnika.setBackground(new java.awt.Color(153, 204, 255));
        btnPronadjiKorisnika.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPronadjiKorisnika.setText("PRONADJI");
        btnPronadjiKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronadjiKorisnikaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("UNESITE IME");

        javax.swing.GroupLayout pnlIzaberiZaposlenogLayout = new javax.swing.GroupLayout(pnlIzaberiZaposlenog);
        pnlIzaberiZaposlenog.setLayout(pnlIzaberiZaposlenogLayout);
        pnlIzaberiZaposlenogLayout.setHorizontalGroup(
            pnlIzaberiZaposlenogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzaberiZaposlenogLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlIzaberiZaposlenogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIzaberiZaposlenogLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlIzaberiZaposlenogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlIzaberiZaposlenogLayout.createSequentialGroup()
                                .addComponent(txtImeKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnPronadjiKorisnika)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlIzaberiZaposlenogLayout.setVerticalGroup(
            pnlIzaberiZaposlenogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzaberiZaposlenogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIzaberiZaposlenogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtImeKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPronadjiKorisnika)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRacun.setBackground(new java.awt.Color(204, 255, 204));
        pnlRacun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("IME");

        txtIme.setEditable(false);
        txtIme.setBackground(new java.awt.Color(255, 255, 255));
        txtIme.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("E-MAIL");

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblStavkeRacuna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblStavkeRacuna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(tblStavkeRacuna);

        btnUnesiteProizvod.setBackground(new java.awt.Color(153, 204, 255));
        btnUnesiteProizvod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUnesiteProizvod.setText("UNESITE  PROIZVOD");
        btnUnesiteProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnesiteProizvodActionPerformed(evt);
            }
        });

        btnSacuvajRacun.setBackground(new java.awt.Color(153, 204, 255));
        btnSacuvajRacun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSacuvajRacun.setText("SAČUVAJ");
        btnSacuvajRacun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSacuvajRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajRacunActionPerformed(evt);
            }
        });

        lblIDRacun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIDRacun.setText("ID RACUNA");

        txtIdRacuna.setEditable(false);
        txtIdRacuna.setBackground(new java.awt.Color(255, 255, 255));
        txtIdRacuna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdRacuna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnZatvori.setBackground(new java.awt.Color(204, 204, 255));
        btnZatvori.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnZatvori.setText("ODUSTANI");
        btnZatvori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnZatvori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZatvoriActionPerformed(evt);
            }
        });

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnObrisiProizvod.setBackground(new java.awt.Color(255, 0, 0));
        btnObrisiProizvod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnObrisiProizvod.setText("OBRIŠI PROIZVOD");
        btnObrisiProizvod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnObrisiProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiProizvodActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PREZIME");

        txtPrezime.setEditable(false);
        txtPrezime.setBackground(new java.awt.Color(255, 255, 255));
        txtPrezime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrezime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("UKUPNO :");

        txtUkupno.setEditable(false);
        txtUkupno.setBackground(new java.awt.Color(255, 255, 255));
        txtUkupno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUkupno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("DATUM");

        javax.swing.GroupLayout pnlRacunLayout = new javax.swing.GroupLayout(pnlRacun);
        pnlRacun.setLayout(pnlRacunLayout);
        pnlRacunLayout.setHorizontalGroup(
            pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRacunLayout.createSequentialGroup()
                .addGroup(pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRacunLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRacunLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRacunLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnUnesiteProizvod))
                    .addGroup(pnlRacunLayout.createSequentialGroup()
                        .addGap(587, 587, 587)
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)
                        .addComponent(txtUkupno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRacunLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnZatvori, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnObrisiProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(388, 388, 388)
                        .addComponent(btnSacuvajRacun, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRacunLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIDRacun, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(pnlRacunLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlRacunLayout.setVerticalGroup(
            pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRacunLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDRacun)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUnesiteProizvod)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRacunLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(txtUkupno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnlRacunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnZatvori)
                    .addComponent(btnObrisiProizvod)
                    .addComponent(btnSacuvajRacun))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlIzaberiZaposlenog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRacun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnlIzaberiZaposlenog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlRacun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblKorisniciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKorisniciMouseClicked
        pnlRacun.setVisible(true);
        int selectedRow = tblKorisnici.getSelectedRow();
        TabelaKorisnik tz = (TabelaKorisnik) tblKorisnici.getModel();

        Korisnik k = tz.getSelectedZaposleni(selectedRow);

        txtIme.setText(k.getIme());
        txtPrezime.setText(k.getPrezime());
        txtEmail.setText(k.getMail());

        jDateChooser1.setDate(new Date());

        LocalDate ld = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

       
    }//GEN-LAST:event_tblKorisniciMouseClicked

    private void btnUnesiteProizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnesiteProizvodActionPerformed
        IzaberiProizvodForm ipf = new IzaberiProizvodForm(null, true);
        ipf.setVisible(true);
        ipf.setLocationRelativeTo(null);

        if (ipf.stavkaRacuna == null) {
            return;
        } else {

            StavkaRacuna sr = new StavkaRacuna(0, ipf.stavkaRacuna.getKolicina(), ipf.stavkaRacuna.getCenaProizvoda(), ipf.stavkaRacuna.getUkupno(), r.getIdRacuna(), ipf.stavkaRacuna.getProizvod());

            stavke.add(sr);
            System.out.println(stavke.size());

            ukupno();

            System.out.println("Stavki u listi ima" + stavke.size());
            popuniTabeluStavkaRacuna();
        }

    }//GEN-LAST:event_btnUnesiteProizvodActionPerformed

    private void btnSacuvajRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajRacunActionPerformed

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
            dispose();
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

            dispose();
        }

    }//GEN-LAST:event_btnSacuvajRacunActionPerformed

    private void btnZatvoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZatvoriActionPerformed


        dispose();

    }//GEN-LAST:event_btnZatvoriActionPerformed

    private void btnObrisiProizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiProizvodActionPerformed

        if (tblStavkeRacuna.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "SELEKTUJTE PROIZVOD KOJI ŽELITE DA UKLONITE IZ LISTE ");
            return;
        }
        int selectedStavka = tblStavkeRacuna.getSelectedRow();

        TabelaStavkeRacuna tp = (TabelaStavkeRacuna) tblStavkeRacuna.getModel();
        StavkaRacuna sr = tp.getSelectedStavka(selectedStavka);

        stavke.remove(sr);
        System.out.println("Obrisana stavka " + sr.toString());
        popuniTabeluStavkaRacuna();
        ukupno();


    }//GEN-LAST:event_btnObrisiProizvodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DodajKorisnikaForm dkf = new DodajKorisnikaForm(null, true);
        dkf.setVisible(true);
        dkf.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        populateTable();
        jDateChooser1.setDate(new Date());
    }//GEN-LAST:event_formWindowActivated

    private void btnPronadjiKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronadjiKorisnikaActionPerformed

        List<Korisnik> novaLista = new ArrayList<>();
        String searchTherm = txtImeKorisnika.getText().toLowerCase();

        List<Korisnik> trazeniKorisnici = korisnikInterface.listaKorisnika().stream().filter(item -> item.getIme().toLowerCase().startsWith(searchTherm)).collect(Collectors.toList());
        novaLista.clear();

        for (Korisnik k : trazeniKorisnici) {
            novaLista.add(k);
        }

        TableModel tm = new TabelaKorisnik(novaLista);
        tblKorisnici.setModel(tm);


    }//GEN-LAST:event_btnPronadjiKorisnikaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObrisiProizvod;
    private javax.swing.JButton btnPronadjiKorisnika;
    private javax.swing.JButton btnSacuvajRacun;
    private javax.swing.JButton btnUnesiteProizvod;
    private javax.swing.JButton btnZatvori;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIDRacun;
    private javax.swing.JPanel pnlIzaberiZaposlenog;
    private javax.swing.JPanel pnlRacun;
    private javax.swing.JTable tblKorisnici;
    private javax.swing.JTable tblStavkeRacuna;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdRacuna;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtImeKorisnika;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUkupno;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {

        List<Korisnik> korisnici = korisnikInterface.listaKorisnika();   // ovo mora da se inicijalizuje preko repozitorijuma ;
        TableModel tb = new TabelaKorisnik(korisnici);
        tblKorisnici.setModel(tb);
    }

    public void popuniTabeluStavkaRacuna() {

        List<StavkaRacuna> stavkeRacuna = stavke;

        TableModel tb = new TabelaStavkeRacuna(stavkeRacuna);
        tblStavkeRacuna.setModel(tb);
        System.out.println("Lista p ima proizvoda" + stavkeRacuna.size());

    }

    public void ukupno() {

        ukupno = 0;
        for (int i = 0; i < stavke.size(); i++) {

            ukupno = ukupno + stavke.get(i).getUkupno();
            System.out.println(stavke.get(i).toString());

        }

        txtUkupno.setText(String.valueOf(ukupno));
    }

    public void searchText() {

        List<Korisnik> kor = new ArrayList<>();

        txtImeKorisnika.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateList();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateList();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateList();
            }

            private void updateList() {
                String pretrazi = txtImeKorisnika.getText();
                List<Korisnik> filtriraniKorisnici = korisnikInterface.listaKorisnika().stream().filter(item -> item.getIme().toLowerCase().contains(pretrazi.toLowerCase())).collect(Collectors.toList());
                kor.clear();

                for (Korisnik k : filtriraniKorisnici) {
                    kor.add(k);
                }
            }

        });

        TableModel tb = new TabelaKorisnik(kor);
        tblKorisnici.setModel(tb);

    }

}
