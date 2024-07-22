/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package debtcontrol.form;

import debtcontrol.form.controller.LIstaKorisnikaController;
import debtcontrol.model.Korisnik;
import debtcontrol.repository.KorisnikInterface;
import debtcontrol.repositoryImpl.KorisnikInterfaceImpl;
import debtcontrol.table.TabelaKorisnik;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class ListaKorisnikaForm extends javax.swing.JDialog {

    KorisnikInterface korisnikInterface;

    /**
     * Creates new form ListaZaposlenihForm
     */
    public ListaKorisnikaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        korisnikInterface = new KorisnikInterfaceImpl();
        initComponents();
        setLocationRelativeTo(null);
        pnlIzmeneKorisnika.setVisible(false);
        populateTabele();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        pnlListaDuznika = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaKorisnika = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnObrisi1 = new javax.swing.JButton();
        btnIzmeni1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnlIzmeneKorisnika = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        btnSacuvajKorisnika = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnOdustaniOdIzmeneKorisnika = new javax.swing.JButton();
        radiooBtnPrihvata = new javax.swing.JRadioButton();
        radioBtnNePrihvata = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LISTA KORISNIKA ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pnlListaDuznika.setBackground(new java.awt.Color(204, 255, 204));
        pnlListaDuznika.setForeground(new java.awt.Color(204, 255, 204));

        tblListaKorisnika.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblListaKorisnika.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblListaKorisnika.setModel(new javax.swing.table.DefaultTableModel(
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
        tblListaKorisnika.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tblListaKorisnika.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaKorisnikaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblListaKorisnika);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("LISTA  KORISNIKA - DUŽNIKA");

        btnObrisi1.setBackground(new java.awt.Color(255, 0, 0));
        btnObrisi1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnObrisi1.setText("OBRISI ");
        btnObrisi1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnObrisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisi1ActionPerformed(evt);
            }
        });

        btnIzmeni1.setBackground(new java.awt.Color(153, 204, 255));
        btnIzmeni1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIzmeni1.setText("IZMENI");
        btnIzmeni1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIzmeni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeni1ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlListaDuznikaLayout = new javax.swing.GroupLayout(pnlListaDuznika);
        pnlListaDuznika.setLayout(pnlListaDuznikaLayout);
        pnlListaDuznikaLayout.setHorizontalGroup(
            pnlListaDuznikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaDuznikaLayout.createSequentialGroup()
                .addGroup(pnlListaDuznikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListaDuznikaLayout.createSequentialGroup()
                        .addGroup(pnlListaDuznikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlListaDuznikaLayout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlListaDuznikaLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(pnlListaDuznikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnlListaDuznikaLayout.createSequentialGroup()
                                        .addComponent(btnObrisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnIzmeni1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlListaDuznikaLayout.setVerticalGroup(
            pnlListaDuznikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaDuznikaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlListaDuznikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzmeni1)
                    .addComponent(btnObrisi1))
                .addGap(30, 30, 30))
        );

        pnlIzmeneKorisnika.setBackground(new java.awt.Color(204, 255, 204));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("MAIL OBAVESTENJA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("UNESITE  IZMENE ZA KORISNIKA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("IME ");

        txtIme.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImeKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("PREZIME");

        txtPrezime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrezime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPrezime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrezimeKeyTyped(evt);
            }
        });

        btnSacuvajKorisnika.setBackground(new java.awt.Color(153, 204, 255));
        btnSacuvajKorisnika.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSacuvajKorisnika.setText("SACUVAJ IZMENE");
        btnSacuvajKorisnika.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSacuvajKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajKorisnikaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("E MAIL");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ID");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnOdustaniOdIzmeneKorisnika.setBackground(new java.awt.Color(255, 204, 255));
        btnOdustaniOdIzmeneKorisnika.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOdustaniOdIzmeneKorisnika.setText("ODUSTANI");
        btnOdustaniOdIzmeneKorisnika.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOdustaniOdIzmeneKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniOdIzmeneKorisnikaActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiooBtnPrihvata);
        radiooBtnPrihvata.setText("PRIHVATA");

        buttonGroup1.add(radioBtnNePrihvata);
        radioBtnNePrihvata.setText("NE PRIHVATA");

        javax.swing.GroupLayout pnlIzmeneKorisnikaLayout = new javax.swing.GroupLayout(pnlIzmeneKorisnika);
        pnlIzmeneKorisnika.setLayout(pnlIzmeneKorisnikaLayout);
        pnlIzmeneKorisnikaLayout.setHorizontalGroup(
            pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzmeneKorisnikaLayout.createSequentialGroup()
                .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlIzmeneKorisnikaLayout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlIzmeneKorisnikaLayout.createSequentialGroup()
                                    .addComponent(btnOdustaniOdIzmeneKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSacuvajKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlIzmeneKorisnikaLayout.createSequentialGroup()
                                    .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPrezime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlIzmeneKorisnikaLayout.createSequentialGroup()
                                            .addComponent(radiooBtnPrihvata)
                                            .addGap(59, 59, 59)
                                            .addComponent(radioBtnNePrihvata))
                                        .addComponent(txtIme, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail)))))
                        .addGroup(pnlIzmeneKorisnikaLayout.createSequentialGroup()
                            .addGap(267, 267, 267)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlIzmeneKorisnikaLayout.setVerticalGroup(
            pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzmeneKorisnikaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radiooBtnPrihvata)
                    .addComponent(radioBtnNePrihvata))
                .addGap(19, 19, 19)
                .addGroup(pnlIzmeneKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvajKorisnika)
                    .addComponent(btnOdustaniOdIzmeneKorisnika))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(pnlListaDuznika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(pnlIzmeneKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlListaDuznika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlIzmeneKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajKorisnikaActionPerformed

//        boolean prihvata = radiooBtnPrihvata.isSelected();
//        boolean nePrihvata = radioBtnNePrihvata.isSelected();
//
//        if (txtIme.getText().isEmpty() || txtIme.getText().matches(".*[\\d\\W].*")) {
//            JOptionPane.showMessageDialog(null, "NIste uneli ime na adekvatan nacin ");
//            return;
//        }
//        if (txtPrezime.getText().isEmpty() || txtPrezime.getText().matches(".*[\\d\\W].*")) {
//            JOptionPane.showMessageDialog(null, "NIste uneli prezime na adekvatan nacin ");
//            return;
//        }
//        if (txtEmail.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "NIste uneli Email na adekvatan nacin ");
//            return;
//        }
//
//        if (prihvata) {
//
//            Korisnik korisnik = new Korisnik(Integer.parseInt(txtId.getText()), txtIme.getText().trim(), txtPrezime.getText().trim(), txtEmail.getText().trim(), true);
//            korisnikInterface.izmeniKorisnika(korisnik);
//
//            System.out.println("Korisnik je " + korisnik);
//
//        } else if (nePrihvata) {
//            Korisnik korisnik = new Korisnik(Integer.parseInt(txtId.getText()), txtIme.getText().trim(), txtPrezime.getText().trim(), txtEmail.getText().trim(), false);
//            korisnikInterface.izmeniKorisnika(korisnik);
//
//            System.out.println("Korisnik je " + korisnik);
//        }
//
//        populateTabele();
//
//        pnlIzmeneKorisnika.setVisible(false);


        LIstaKorisnikaController.sacuvajKorisnika(radiooBtnPrihvata, radioBtnNePrihvata, txtIme, txtPrezime, txtEmail, txtId, pnlIzmeneKorisnika, tblListaKorisnika);


    }//GEN-LAST:event_btnSacuvajKorisnikaActionPerformed

    private void btnOdustaniOdIzmeneKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniOdIzmeneKorisnikaActionPerformed
        pnlIzmeneKorisnika.setVisible(false);
        LIstaKorisnikaController.popuniTabeluKorisnika(tblListaKorisnika);
        
     //   populateTabele();
    }//GEN-LAST:event_btnOdustaniOdIzmeneKorisnikaActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnObrisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisi1ActionPerformed
//        int selectedRow = tblListaKorisnika.getSelectedRow();
//
//        if (selectedRow == -1) {
//            JOptionPane.showMessageDialog(this, "NISTE SELEKTOVALI KORISNIKA KOJEG ŽELITE DA IZBRIŠETE");
//            return;
//        }
//
//        int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA UKLONITE OVOG KORISNIKA IZ LISTE");
//
//        if (odgovor == JOptionPane.NO_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.CANCEL_OPTION) {
//            return;
//
//        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
//            return;
//        } else if (odgovor == JOptionPane.YES_OPTION) {
//
//            TabelaKorisnik tk = (TabelaKorisnik) tblListaKorisnika.getModel();
//            Korisnik k = tk.getSelectedZaposleni(selectedRow);
//
//            korisnikInterface.izbrisiKorisnika(k);
//            populateTabele();
//        }

        LIstaKorisnikaController.obrisiKorisnika(tblListaKorisnika);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObrisi1ActionPerformed

    private void btnIzmeni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeni1ActionPerformed

//        int selectedRow = tblListaKorisnika.getSelectedRow();
//
//        if (selectedRow == -1) {
//            JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI KORISNIKA");
//            return;
//        }
//        pnlIzmeneKorisnika.setVisible(true);
//
//        TabelaKorisnik tk = (TabelaKorisnik) tblListaKorisnika.getModel();
//
//        Korisnik k = tk.getSelectedZaposleni(selectedRow);
//
//        txtId.setText(String.valueOf(k.getIdKorisnik()));
//        txtIme.setText(k.getIme());
//        txtPrezime.setText(k.getPrezime());
//        txtEmail.setText(k.getMail());
//
//
//        if (k.isMailObavestenja() == true) {
//            radiooBtnPrihvata.setSelected(true);
//            radioBtnNePrihvata.setSelected(false);
//        } else {
//            radioBtnNePrihvata.setSelected(true);
//            radiooBtnPrihvata.setSelected(false);
//        }

        LIstaKorisnikaController.izmeniKorisnika(tblListaKorisnika, pnlIzmeneKorisnika, txtId, txtIme, txtPrezime, txtEmail, radiooBtnPrihvata, radioBtnNePrihvata);

// TODO add your handling code here:
    }//GEN-LAST:event_btnIzmeni1ActionPerformed

    private void txtImeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImeKeyTyped
//        char c = evt.getKeyChar();
//
//        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
//            evt.consume();
//            JOptionPane.showMessageDialog(null, "NISTE UNELI IME NA ADEKVATAN NAČIN");
//        } else {
//
//        }

        LIstaKorisnikaController.unosTeksta(evt, txtIme.getText().trim());
    }//GEN-LAST:event_txtImeKeyTyped

    private void txtPrezimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrezimeKeyTyped
//        char c = evt.getKeyChar();
//
//        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
//            evt.consume();
//            JOptionPane.showMessageDialog(null, "NISTE UNELI PREZIME  NA ADEKVATAN NAČIN, UNOSITE SLOVA");
//        } else {
//
//        }

        LIstaKorisnikaController.unosTeksta(evt, txtPrezime.getText().trim());
    }//GEN-LAST:event_txtPrezimeKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
//          char c = evt.getKeyChar();
//       
//       if ( !Character.isWhitespace(c) ){
//           evt.consume();
//            JOptionPane.showMessageDialog(null, "NISTE UNELI E MAIL  NA ADEKVATAN NACIN");
//       }else{
//          
//       }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void tblListaKorisnikaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaKorisnikaMouseClicked
      pnlIzmeneKorisnika.setVisible(false);
    }//GEN-LAST:event_tblListaKorisnikaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeni1;
    private javax.swing.JButton btnObrisi1;
    private javax.swing.JButton btnOdustaniOdIzmeneKorisnika;
    private javax.swing.JButton btnSacuvajKorisnika;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlIzmeneKorisnika;
    private javax.swing.JPanel pnlListaDuznika;
    private javax.swing.JRadioButton radioBtnNePrihvata;
    private javax.swing.JRadioButton radiooBtnPrihvata;
    private javax.swing.JTable tblListaKorisnika;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    public void populateTabele() {

        List<Korisnik> korisnici = korisnikInterface.listaKorisnika();

        TableModel tb = new TabelaKorisnik(korisnici);

        tblListaKorisnika.setModel(tb);

    }
}
