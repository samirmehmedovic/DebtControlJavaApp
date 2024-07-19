/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package debtcontrol.form;

import debtcontrol.model.Korisnik;
import debtcontrol.model.Racun;
import debtcontrol.model.Status;
import debtcontrol.model.StavkaRacuna;
import debtcontrol.repository.StavkeRacunaInterface;
import debtcontrol.table.TabelaStavkeRacuna;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class PregledRacunaForm extends javax.swing.JDialog {

    /**
     * Creates new form PregledRacunaForm
     */
    public PregledRacunaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlRacun2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtIme2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmail2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblStavkeRacuna2 = new javax.swing.JTable();
        lblIDRacun2 = new javax.swing.JLabel();
        txtIdRacuna2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPrezime2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUkupno2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        lblStanjeRacuna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PREGLED RAČUNA ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlRacun2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("IME");

        txtIme2.setEditable(false);
        txtIme2.setBackground(new java.awt.Color(255, 255, 255));
        txtIme2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("E-MAIL");

        txtEmail2.setEditable(false);
        txtEmail2.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        tblStavkeRacuna2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblStavkeRacuna2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane4.setViewportView(tblStavkeRacuna2);

        lblIDRacun2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIDRacun2.setText("ID RACUNA");

        txtIdRacuna2.setEditable(false);
        txtIdRacuna2.setBackground(new java.awt.Color(255, 255, 255));
        txtIdRacuna2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("PREZIME");

        txtPrezime2.setEditable(false);
        txtPrezime2.setBackground(new java.awt.Color(255, 255, 255));
        txtPrezime2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("UKUPNO :");

        txtUkupno2.setEditable(false);
        txtUkupno2.setBackground(new java.awt.Color(255, 255, 255));
        txtUkupno2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUkupno2.setForeground(new java.awt.Color(255, 0, 0));
        txtUkupno2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("DATUM");

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatus.setText("STATUS  RAČUNA : ");

        javax.swing.GroupLayout pnlRacun2Layout = new javax.swing.GroupLayout(pnlRacun2);
        pnlRacun2.setLayout(pnlRacun2Layout);
        pnlRacun2Layout.setHorizontalGroup(
            pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRacun2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRacun2Layout.createSequentialGroup()
                        .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRacun2Layout.createSequentialGroup()
                                .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlRacun2Layout.createSequentialGroup()
                                        .addComponent(txtIme2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(316, 316, 316))
                                    .addGroup(pnlRacun2Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrezime2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(85, 85, 85)))
                                .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlRacun2Layout.createSequentialGroup()
                                .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdRacuna2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIDRacun2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStanjeRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRacun2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRacun2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtUkupno2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        pnlRacun2Layout.setVerticalGroup(
            pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRacun2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDRacun2)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdRacuna2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStanjeRacuna)))
                .addGap(18, 18, 18)
                .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIme2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrezime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnlRacun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtUkupno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(pnlRacun2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(pnlRacun2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblIDRacun2;
    private javax.swing.JLabel lblStanjeRacuna;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel pnlRacun2;
    private javax.swing.JTable tblStavkeRacuna2;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtEmail2;
    private javax.swing.JTextField txtIdRacuna2;
    private javax.swing.JTextField txtIme2;
    private javax.swing.JTextField txtPrezime2;
    private javax.swing.JTextField txtUkupno2;
    // End of variables declaration//GEN-END:variables


    public void setData(String id, String datum, String ime, String prezime, String email, String ukupno, TableModel tm, Status statusRacuna) {

        txtIdRacuna2.setText(id);
        txtDatum.setText(datum);
        txtIme2.setText(ime);
        txtPrezime2.setText(prezime);
        txtEmail2.setText(email);
        txtUkupno2.setText(ukupno);
        lblStanjeRacuna.setText(statusRacuna.toString());

        tblStavkeRacuna2.setModel(tm);

    }

}
