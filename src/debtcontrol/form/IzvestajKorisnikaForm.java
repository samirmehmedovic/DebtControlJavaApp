/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package debtcontrol.form;

//import com.mysql.cj.xdevapi.Table;
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
import java.util.EventObject;
import java.util.List;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class IzvestajKorisnikaForm extends javax.swing.JDialog {

    KorisnikInterface korisnikInterface;
    RacunInterface racunInterface;
    ProizvodInterface proizvodInterface;
    StavkeRacunaInterface stavkeRacunaInterface;
    PoslatiMailInterface poslatiMailInterface;

    /**
     * Creates new form IzvestajZaposlenihForm
     */
    public IzvestajKorisnikaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        pnlIzvestaj.setVisible(false);
        korisnikInterface = new KorisnikInterfaceImpl();
        racunInterface = new RacunInterfaceImpl();
        proizvodInterface = new ProizvodInterfaceImpl();
        stavkeRacunaInterface = new StavkaRacunaInterfaceImpl();
        poslatiMailInterface = new PoslatiMailInterfaceImpl();
        
        lblIzvestajZaRacune.setVisible(false);
        txtIznosRacuna.setVisible(false);

        populateTableKorisnici();

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));

    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlListaKorisnika = new javax.swing.JPanel();
        lblListaKorisnika1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblIzvestajKorisnika = new javax.swing.JTable();
        btnIzaberi1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnlIzvestaj = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblRacuni = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRacuniKorisnika = new javax.swing.JTable();
        btnSviRacuni = new javax.swing.JButton();
        btnStorniraniRacuni = new javax.swing.JButton();
        btnPlaceniRacuni = new javax.swing.JButton();
        btnPlatiRacun = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnStornirajRacun = new javax.swing.JButton();
        btnPregledracuna = new javax.swing.JButton();
        btnAktivniNeplaceni = new javax.swing.JButton();
        lblIzvestajZaRacune = new javax.swing.JLabel();
        txtIznosRacuna = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IZVEŠTAJ ZA KORISNIKE ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlListaKorisnika.setBackground(new java.awt.Color(204, 255, 204));

        lblListaKorisnika1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListaKorisnika1.setText("LISTA   KORISNIKA ");

        tblIzvestajKorisnika.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblIzvestajKorisnika.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblIzvestajKorisnika.setModel(new javax.swing.table.DefaultTableModel(
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
        tblIzvestajKorisnika.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tblIzvestajKorisnika.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIzvestajKorisnikaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblIzvestajKorisnika);

        btnIzaberi1.setBackground(new java.awt.Color(153, 204, 255));
        btnIzaberi1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIzaberi1.setText("IZABERI  KORISNIKA");
        btnIzaberi1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIzaberi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzaberi1ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlListaKorisnikaLayout = new javax.swing.GroupLayout(pnlListaKorisnika);
        pnlListaKorisnika.setLayout(pnlListaKorisnikaLayout);
        pnlListaKorisnikaLayout.setHorizontalGroup(
            pnlListaKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaKorisnikaLayout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(lblListaKorisnika1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaKorisnikaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(jSeparator1)
            .addGroup(pnlListaKorisnikaLayout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(btnIzaberi1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlListaKorisnikaLayout.setVerticalGroup(
            pnlListaKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaKorisnikaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblListaKorisnika1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIzaberi1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlIzvestaj.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("IME");

        txtIme.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PREZIME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("E-MAIL");

        txtPrezime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrezime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblRacuniKorisnika.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblRacuniKorisnika.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblRacuniKorisnika.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tblRacuniKorisnika.setSelectionBackground(new java.awt.Color(204, 255, 255));
        jScrollPane2.setViewportView(tblRacuniKorisnika);

        btnSviRacuni.setBackground(new java.awt.Color(204, 255, 255));
        btnSviRacuni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSviRacuni.setText("SVI RAČUNI");
        btnSviRacuni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSviRacuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSviRacuniActionPerformed(evt);
            }
        });

        btnStorniraniRacuni.setBackground(new java.awt.Color(204, 255, 255));
        btnStorniraniRacuni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStorniraniRacuni.setText("STORNIRANI");
        btnStorniraniRacuni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnStorniraniRacuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStorniraniRacuniActionPerformed(evt);
            }
        });

        btnPlaceniRacuni.setBackground(new java.awt.Color(204, 255, 255));
        btnPlaceniRacuni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlaceniRacuni.setText("NEAKTIVNI-PLAĆENI");
        btnPlaceniRacuni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPlaceniRacuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceniRacuniActionPerformed(evt);
            }
        });

        btnPlatiRacun.setBackground(new java.awt.Color(153, 204, 255));
        btnPlatiRacun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlatiRacun.setText("PLATI RAČUN");
        btnPlatiRacun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPlatiRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatiRacunActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ID");

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnStornirajRacun.setBackground(new java.awt.Color(255, 0, 51));
        btnStornirajRacun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStornirajRacun.setText("STORNIRAJ RAČUN");
        btnStornirajRacun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnStornirajRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStornirajRacunActionPerformed(evt);
            }
        });

        btnPregledracuna.setBackground(new java.awt.Color(204, 204, 255));
        btnPregledracuna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPregledracuna.setText("PREGLED");
        btnPregledracuna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPregledracuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregledracunaActionPerformed(evt);
            }
        });

        btnAktivniNeplaceni.setBackground(new java.awt.Color(204, 255, 255));
        btnAktivniNeplaceni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAktivniNeplaceni.setText("AKTIVNI - NEPLAĆENI");
        btnAktivniNeplaceni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAktivniNeplaceni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAktivniNeplaceniActionPerformed(evt);
            }
        });

        lblIzvestajZaRacune.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblIzvestajZaRacune.setForeground(new java.awt.Color(255, 0, 51));

        txtIznosRacuna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIznosRacuna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlIzvestajLayout = new javax.swing.GroupLayout(pnlIzvestaj);
        pnlIzvestaj.setLayout(pnlIzvestajLayout);
        pnlIzvestajLayout.setHorizontalGroup(
            pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzvestajLayout.createSequentialGroup()
                .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIzvestajLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(lblRacuni, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlIzvestajLayout.createSequentialGroup()
                        .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlIzvestajLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlIzvestajLayout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jLabel2)))
                        .addGap(48, 48, 48)
                        .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlIzvestajLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlIzvestajLayout.createSequentialGroup()
                                .addComponent(btnStornirajRacun, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184)
                                .addComponent(btnPregledracuna, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlIzvestajLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(lblIzvestajZaRacune, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPlatiRacun, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtIznosRacuna))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlIzvestajLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlaceniRacuni, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIzvestajLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSviRacuni, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAktivniNeplaceni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(btnStorniraniRacuni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlIzvestajLayout.setVerticalGroup(
            pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzvestajLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4))
                    .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGap(12, 12, 12)
                .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblRacuni, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSviRacuni)
                        .addComponent(btnStornirajRacun))
                    .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPlatiRacun)
                        .addComponent(btnPregledracuna)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlaceniRacuni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIzvestajLayout.createSequentialGroup()
                        .addComponent(btnStorniraniRacuni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzvestajLayout.createSequentialGroup()
                        .addGroup(pnlIzvestajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIzvestajZaRacune)
                            .addComponent(txtIznosRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addComponent(btnAktivniNeplaceni)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlListaKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlIzvestaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnlListaKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlIzvestaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public IzvestajKorisnikaForm() {
    }

    private void btnSviRacuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSviRacuniActionPerformed

        lblRacuni.setText("SVI RAČUNI");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k);

        System.out.println("Racuna ima " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);

        tblRacuniKorisnika.setModel(tm);

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));
        
        lblIzvestajZaRacune.setVisible(false);
        txtIznosRacuna.setVisible(false);


    }//GEN-LAST:event_btnSviRacuniActionPerformed

    private void btnPlaceniRacuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceniRacuniActionPerformed
        lblRacuni.setText("NEAKTIVNI - PLAĆENI");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je: " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k, Status.NEAKTIVAN_PLACEN);

        System.out.println("Lista je dugacka " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);

        tblRacuniKorisnika.setModel(tm);

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));
        
        lblIzvestajZaRacune.setText("Ukupan iznos svih NEAKTIVNIH-PLAĆENIH  računa iznosi: ");
        
        lblIzvestajZaRacune.setVisible(true);
        txtIznosRacuna.setVisible(true);
        
        double ukupanIznos =0;
        for(Racun r : racuni){
         ukupanIznos = ukupanIznos+r.getUkupno();   
        }
        txtIznosRacuna.setText(String.valueOf(ukupanIznos));


    }//GEN-LAST:event_btnPlaceniRacuniActionPerformed

    private void btnPlatiRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatiRacunActionPerformed

//        int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA IZMIRITE RAČUN I POŠALJETE E-MAIL KORISNIKU " + txtIme.getText().trim() + " " + txtPrezime.getText().trim() + " NA E-MAIL ADRESU: " + txtEmail.getText().trim());
//
//        if (odgovor == JOptionPane.NO_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.CANCEL_OPTION) {
//            return;
//        }
 //       else if (odgovor == JOptionPane.YES_OPTION) {

            int selectedRow = tblRacuniKorisnika.getSelectedRow();

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "NISTE SELEKTOVALI RAČUN KOJI ŽELITE DA PLATITE");
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

                populateTableRacuni();;

            }
        }


    }//GEN-LAST:event_btnPlatiRacunActionPerformed

    private void btnStorniraniRacuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStorniraniRacuniActionPerformed
        lblRacuni.setText("STORNIRANI - GREŠKA");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je: " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k, Status.STORNIRAN_GRESKA);

        System.out.println("Lista je dugacka " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);

        tblRacuniKorisnika.setModel(tm);
        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));
        lblIzvestajZaRacune.setText("Ukupan iznos svih STORNIRANIH  računa iznosi: ");
        
        lblIzvestajZaRacune.setVisible(true);
        txtIznosRacuna.setVisible(true);
        
        double ukupanIznos =0;
        for(Racun r : racuni){
         ukupanIznos = ukupanIznos+r.getUkupno();   
        }
        txtIznosRacuna.setText(String.valueOf(ukupanIznos));


    }//GEN-LAST:event_btnStorniraniRacuniActionPerformed

    private void btnStornirajRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStornirajRacunActionPerformed

//        int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA STORNIRATE RAČUN I POŠALJETE E-MAIL KORISNIKU " + txtIme.getText().trim() + " " + txtPrezime.getText().trim() + " NA E-MAIL ADRESU: " + txtEmail.getText().trim());
//
//        if (odgovor == JOptionPane.NO_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.CANCEL_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.YES_OPTION) {

            int selectetedRow = tblRacuniKorisnika.getSelectedRow();

            if (selectetedRow == -1) {
                JOptionPane.showMessageDialog(this, "NISTE SELEKTOVALI RAČUN KOJI ŽELITE DA STORNIRATE");
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
                        }       populateTableRacuni();
                        btnPlatiRacun.setVisible(false);
                        LocalDate datum = LocalDate.now();
                        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
                        String datumFormat = datum.format(formater);
                       
                        
                        String poruka = " Poštovani,\n"
                                + "Danas, " + datumFormat + " u Klubu zaposlenih storniran je Vaš račun, broj: " + r.getIdRacuna() + " u iznosu od  " + r.getUkupno() + " dinara\n" + "\n"
                                
                                + "Srdačan pozdrav,\n"
                                + "Služba usluga";
                        poslatiMailInterface.poslatiMail(txtEmail.getText().trim(), poruka);    //"smehmedoviccc@gmail.com"
                        dispose();
                        break;
                    default:
                        break;
                }


    }//GEN-LAST:event_btnStornirajRacunActionPerformed
    }
    private void btnPregledracunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregledracunaActionPerformed

        int selectedRow = tblRacuniKorisnika.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "NISTE SELEKTOVALI RAČUN KOJI ŽELITE DA POGLEDATE");
            return;
        }

        TabelaRacun tr = (TabelaRacun) tblRacuniKorisnika.getModel();

        Racun r = tr.getSelectedRacun(selectedRow);

        TableModel tm = new TabelaStavkeRacuna(r.getStavke());

        PregledRacunaForm prf = new PregledRacunaForm(null, true);
        prf.setData(String.valueOf(r.getIdRacuna()), r.getDatum().toString(), r.getKorisnik().getIme(), r.getKorisnik().getPrezime(), r.getKorisnik().getMail(), String.valueOf(r.getUkupno()), tm, r.getStatus());
        prf.setVisible(true);


    }//GEN-LAST:event_btnPregledracunaActionPerformed

    private void tblIzvestajKorisnikaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIzvestajKorisnikaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIzvestajKorisnikaMouseClicked

    private void btnIzaberi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzaberi1ActionPerformed

        int selectedRow = tblIzvestajKorisnika.getSelectedRow();

        TabelaKorisnik tk = (TabelaKorisnik) tblIzvestajKorisnika.getModel();

        Korisnik k;

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "NISTE SELEКTOVALI KORISNIKA");
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

        lblRacuni.setText("AKTIVNI - NEPLACENI RACUNI");        // TODO add your handling code here:
    }//GEN-LAST:event_btnIzaberi1ActionPerformed

    private void btnAktivniNeplaceniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAktivniNeplaceniActionPerformed
        lblRacuni.setText("AKTIVNI - NEPLAĆENI");
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        System.out.println("Korisnik je: " + k.getIme());
        List<Racun> racuni = racunInterface.listaRacuna(k, Status.AKTIVAN_NEPLACEN);

        System.out.println("Lista je dugacka " + racuni.size());

        TableModel tm = new TabelaRacun(racuni);

        tblRacuniKorisnika.setModel(tm);
        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());

        tblRacuniKorisnika.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblRacuniKorisnika));
        
        lblIzvestajZaRacune.setText("Ukupan iznos svih AKTIVNIH-NEPLAĆENIH  računa iznosi: ");
        
        lblIzvestajZaRacune.setVisible(true);
        txtIznosRacuna.setVisible(true);
        
        double ukupanIznos =0;
        for(Racun r : racuni){
         ukupanIznos = ukupanIznos+r.getUkupno();   
        }
        txtIznosRacuna.setText(String.valueOf(ukupanIznos));
        
    }//GEN-LAST:event_btnAktivniNeplaceniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAktivniNeplaceni;
    private javax.swing.JButton btnIzaberi1;
    private javax.swing.JButton btnPlaceniRacuni;
    private javax.swing.JButton btnPlatiRacun;
    private javax.swing.JButton btnPregledracuna;
    private javax.swing.JButton btnStornirajRacun;
    private javax.swing.JButton btnStorniraniRacuni;
    private javax.swing.JButton btnSviRacuni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblIzvestajZaRacune;
    private javax.swing.JLabel lblListaKorisnika1;
    private javax.swing.JLabel lblRacuni;
    private javax.swing.JPanel pnlIzvestaj;
    private javax.swing.JPanel pnlListaKorisnika;
    private javax.swing.JTable tblIzvestajKorisnika;
    private javax.swing.JTable tblRacuniKorisnika;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtIznosRacuna;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    public void populateTableKorisnici() {

        List<Korisnik> korisnici = korisnikInterface.listaKorisnika();

        TableModel tm = new TabelaKorisnik(korisnici);
        tblIzvestajKorisnika.setModel(tm);

    }

    public void populateTableRacuni() {
        Korisnik k = korisnikInterface.pronadjiKorisnika(txtEmail.getText().trim(), txtIme.getText().trim());

        List<Racun> racuni = racunInterface.listaRacuna(k, Status.AKTIVAN_NEPLACEN);

        TableModel tm = new TabelaRacun(racuni);
        tblRacuniKorisnika.setModel(tm);

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

        public void actionPerformed(ActionEvent e) {

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

    }

    public Racun getSelectedRacun() {

        int selectedRow = tblRacuniKorisnika.getSelectedRow();

        TabelaRacun tr = (TabelaRacun) tblRacuniKorisnika.getModel();

        Racun r = tr.getSelectedRacun(selectedRow);

        return r;

    }

}
