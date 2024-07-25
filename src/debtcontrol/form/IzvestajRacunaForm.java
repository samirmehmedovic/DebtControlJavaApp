/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package debtcontrol.form;

import debtcontrol.form.controller.IzvestajRacunaController;
import debtcontrol.model.Racun;
import debtcontrol.model.Status;
import debtcontrol.model.StavkaRacuna;

import debtcontrol.repository.RacunInterface;
import debtcontrol.repository.TableActionEvent;
import debtcontrol.repositoryImpl.RacunInterfaceImpl;
import debtcontrol.table.TabelaRacun;
import debtcontrol.table.TabelaStavkeRacuna;
import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class IzvestajRacunaForm extends javax.swing.JDialog {

    RacunInterface racunInterface;
    private double ukupno;

    /**
     * Creates new form IzvestajRacunaForm
     */
    public IzvestajRacunaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();

        lblFinansijskiIzvestaj.setVisible(false);

        setLocationRelativeTo(null);

        racunInterface = new RacunInterfaceImpl();
        tblIzvestajRacuna.getColumnModel().getColumn(1).setPreferredWidth(20);
        populateTable();

        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));
        txtUkupno.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnlIzvestajRacuna = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblIzvestajRacuna = new javax.swing.JTable();
        btnNeplaceniRacuni = new javax.swing.JButton();
        btnStorniraniRAcuni = new javax.swing.JButton();
        btnPlaceniRacuni = new javax.swing.JButton();
        btnSviRacuni = new javax.swing.JButton();
        lblListaRacuna = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUkupno = new javax.swing.JTextField();
        lblFinansijskiIzvestaj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LISTA  RAČUNA");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pnlIzvestajRacuna.setBackground(new java.awt.Color(204, 255, 204));

        tblIzvestajRacuna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblIzvestajRacuna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblIzvestajRacuna.setModel(new javax.swing.table.DefaultTableModel(
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
        tblIzvestajRacuna.setSelectionBackground(new java.awt.Color(51, 204, 255));
        jScrollPane3.setViewportView(tblIzvestajRacuna);

        btnNeplaceniRacuni.setBackground(new java.awt.Color(153, 204, 255));
        btnNeplaceniRacuni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNeplaceniRacuni.setText("AKTIVNI-NEPLAĆENI");
        btnNeplaceniRacuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNeplaceniRacuniActionPerformed(evt);
            }
        });

        btnStorniraniRAcuni.setBackground(new java.awt.Color(153, 204, 255));
        btnStorniraniRAcuni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStorniraniRAcuni.setText("STORNIRANI-GREŠKA");
        btnStorniraniRAcuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStorniraniRAcuniActionPerformed(evt);
            }
        });

        btnPlaceniRacuni.setBackground(new java.awt.Color(153, 204, 255));
        btnPlaceniRacuni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlaceniRacuni.setText("NEAKTIVNI-PLAĆENI");
        btnPlaceniRacuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceniRacuniActionPerformed(evt);
            }
        });

        btnSviRacuni.setBackground(new java.awt.Color(153, 204, 255));
        btnSviRacuni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSviRacuni.setText("SVI RAČUNI");
        btnSviRacuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSviRacuniActionPerformed(evt);
            }
        });

        lblListaRacuna.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListaRacuna.setText("LISTA  RAČUNA");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtUkupno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUkupno.setForeground(new java.awt.Color(255, 0, 0));
        txtUkupno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFinansijskiIzvestaj.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlIzvestajRacunaLayout = new javax.swing.GroupLayout(pnlIzvestajRacuna);
        pnlIzvestajRacuna.setLayout(pnlIzvestajRacunaLayout);
        pnlIzvestajRacunaLayout.setHorizontalGroup(
            pnlIzvestajRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzvestajRacunaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIzvestajRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzvestajRacunaLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzvestajRacunaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblListaRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(315, 315, 315))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzvestajRacunaLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pnlIzvestajRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIzvestajRacunaLayout.createSequentialGroup()
                        .addComponent(lblFinansijskiIzvestaj, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUkupno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(pnlIzvestajRacunaLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(btnSviRacuni, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlIzvestajRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlIzvestajRacunaLayout.createSequentialGroup()
                    .addGap(5, 43, Short.MAX_VALUE)
                    .addComponent(btnNeplaceniRacuni)
                    .addGap(174, 174, 174)
                    .addComponent(btnStorniraniRAcuni)
                    .addGap(196, 196, 196)
                    .addComponent(btnPlaceniRacuni)
                    .addGap(0, 41, Short.MAX_VALUE)))
        );
        pnlIzvestajRacunaLayout.setVerticalGroup(
            pnlIzvestajRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzvestajRacunaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblListaRacuna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSviRacuni)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(pnlIzvestajRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUkupno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinansijskiIzvestaj, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(pnlIzvestajRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlIzvestajRacunaLayout.createSequentialGroup()
                    .addGap(0, 564, Short.MAX_VALUE)
                    .addGroup(pnlIzvestajRacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNeplaceniRacuni)
                        .addComponent(btnStorniraniRAcuni)
                        .addComponent(btnPlaceniRacuni))
                    .addGap(0, 79, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(pnlIzvestajRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(pnlIzvestajRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
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

    private void btnNeplaceniRacuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNeplaceniRacuniActionPerformed
//        List<Racun> racuni = racunInterface.listaRacunaStatusa(Status.AKTIVAN_NEPLACEN);
//
//        TableModel tm = new TabelaRacun(racuni);
//
//        ukupno = 0;
//        for (Racun r : racuni) {
//            ukupno = ukupno + r.getUkupno();
//        }
//
//        txtUkupno.setText(String.valueOf(ukupno));
//
//        tblIzvestajRacuna.setModel(tm);
//        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
//        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));
//
//        lblFinansijskiIzvestaj.setText("Ukupno zaduženje po svim AKTIVNIM-NEPLAĆENIM računima iznosi: ");
//        lblFinansijskiIzvestaj.setVisible(true);
//        txtUkupno.setVisible(true);

          IzvestajRacunaController.izvestajNeplacenihRacuna(tblIzvestajRacuna, txtUkupno, lblFinansijskiIzvestaj);
          tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));


    }//GEN-LAST:event_btnNeplaceniRacuniActionPerformed

    private void btnStorniraniRAcuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStorniraniRAcuniActionPerformed
//        List<Racun> racuni = racunInterface.listaRacunaStatusa(Status.STORNIRAN_GRESKA);
//
//        TableModel tm = new TabelaRacun(racuni);
//        ukupno = 0;
//        for (Racun r : racuni) {
//            ukupno = ukupno + r.getUkupno();
//        }
//
//        txtUkupno.setText(String.valueOf(ukupno));
//
//        tblIzvestajRacuna.setModel(tm);
//        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
//        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));
//
//        lblFinansijskiIzvestaj.setText("Ukupno zaduženje po svim STORNIRANIM računima iznosi: ");
//        lblFinansijskiIzvestaj.setVisible(true);
//        txtUkupno.setVisible(true);

            IzvestajRacunaController.listaStorniranihRacuna(tblIzvestajRacuna, txtUkupno, lblFinansijskiIzvestaj);
            tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));

    }//GEN-LAST:event_btnStorniraniRAcuniActionPerformed

    private void btnPlaceniRacuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceniRacuniActionPerformed
//        List<Racun> racuni = racunInterface.listaRacunaStatusa(Status.NEAKTIVAN_PLACEN);
//
//        TableModel tm = new TabelaRacun(racuni);
//        ukupno = 0;
//        for (Racun r : racuni) {
//            ukupno = ukupno + r.getUkupno();
//        }
//
//        txtUkupno.setText(String.valueOf(ukupno));
//        tblIzvestajRacuna.setModel(tm);
//        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
//        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));
//
//        lblFinansijskiIzvestaj.setText("Ukupno zaduženje po svim NEAKTIVNIM-PLAĆENIM računima iznosi: ");
//        lblFinansijskiIzvestaj.setVisible(true);
//        txtUkupno.setVisible(true);
        
        IzvestajRacunaController.listaPlacenihRacuna(tblIzvestajRacuna, txtUkupno, lblFinansijskiIzvestaj);
         tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));

    }//GEN-LAST:event_btnPlaceniRacuniActionPerformed

    private void btnSviRacuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSviRacuniActionPerformed
//        List<Racun> racuni = racunInterface.listaRacuna();
//
//        TableModel tm = new TabelaRacun(racuni);
//        ukupno = 0;
//        for (Racun r : racuni) {
//            ukupno = ukupno + r.getUkupno();
//        }
//
//        txtUkupno.setText(String.valueOf(ukupno));
//        tblIzvestajRacuna.setModel(tm);
//        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
//        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));
//
//        lblFinansijskiIzvestaj.setVisible(false);
//        txtUkupno.setVisible(false);

          IzvestajRacunaController.listaSvihRacuna(tblIzvestajRacuna, txtUkupno, lblFinansijskiIzvestaj);
           tblIzvestajRacuna.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        tblIzvestajRacuna.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(tblIzvestajRacuna));


    }//GEN-LAST:event_btnSviRacuniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNeplaceniRacuni;
    private javax.swing.JButton btnPlaceniRacuni;
    private javax.swing.JButton btnStorniraniRAcuni;
    private javax.swing.JButton btnSviRacuni;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFinansijskiIzvestaj;
    private javax.swing.JLabel lblListaRacuna;
    private javax.swing.JPanel pnlIzvestajRacuna;
    private javax.swing.JTable tblIzvestajRacuna;
    private javax.swing.JTextField txtUkupno;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        List<Racun> racuni = racunInterface.listaRacuna();
        System.out.println("Racuna u listi ima" + racuni.size());

        TableModel tm = new TabelaRacun(racuni);
        tblIzvestajRacuna.setModel(tm);

    }

    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);

        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            setText((value == null) ? "Pregled racuna" : value.toString());
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

                int selectedRow = tblIzvestajRacuna.getSelectedRow();

                TabelaRacun tr = (TabelaRacun) tblIzvestajRacuna.getModel();

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

}
