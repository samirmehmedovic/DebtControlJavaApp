/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package debtcontrol.form;

//import com.mysql.cj.conf.PropertyKey;
import debtcontrol.model.JedinicaMere;
import debtcontrol.model.Proizvod;
import debtcontrol.repository.ProizvodInterface;
import debtcontrol.repositoryImpl.ProizvodInterfaceImpl;
import debtcontrol.table.TabelaProizvod;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.text.html.HTML;

/**
 *
 * @author podrska
 */
public class ListaProizvodaForm extends javax.swing.JDialog {

    ProizvodInterface proizvodInterface;

    /**
     * Creates new form ListaProizvodaForm
     */
    public ListaProizvodaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        proizvodInterface = new ProizvodInterfaceImpl();

        popuniTabeluProizvod();
        pnlIzmenaProizvoda.setVisible(false);
        popuniCombo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlListaProizvoda = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnIzmeniProizvod1 = new javax.swing.JButton();
        btnobrisiProizvod1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaProizvoda = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnlIzmenaProizvoda = new javax.swing.JPanel();
        txtKolicina = new javax.swing.JTextField();
        btnSacuvajIzmeneProizvoda = new javax.swing.JButton();
        lblNazivProizvoda = new javax.swing.JLabel();
        lblCena = new javax.swing.JLabel();
        lblJedinicaMere = new javax.swing.JLabel();
        lblKolicina = new javax.swing.JLabel();
        txtNazivProizvoda = new javax.swing.JTextField();
        txtCenaProizvoda = new javax.swing.JTextField();
        comboBoxJedinicaMere = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnOdustaniOdIzmena = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LISTA SVIH PROIZVODA");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlListaProizvoda.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("SPISAK  SVIH PROIZVODA");

        btnIzmeniProizvod1.setBackground(new java.awt.Color(153, 204, 255));
        btnIzmeniProizvod1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIzmeniProizvod1.setText("IZMENI PROIZVOD");
        btnIzmeniProizvod1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIzmeniProizvod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniProizvod1ActionPerformed(evt);
            }
        });

        btnobrisiProizvod1.setBackground(new java.awt.Color(255, 0, 51));
        btnobrisiProizvod1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnobrisiProizvod1.setText("OBRISI PROIZVOD");
        btnobrisiProizvod1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnobrisiProizvod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnobrisiProizvod1ActionPerformed(evt);
            }
        });

        tblListaProizvoda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblListaProizvoda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblListaProizvoda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblListaProizvoda);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("ODUSTANI");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlListaProizvodaLayout = new javax.swing.GroupLayout(pnlListaProizvoda);
        pnlListaProizvoda.setLayout(pnlListaProizvodaLayout);
        pnlListaProizvodaLayout.setHorizontalGroup(
            pnlListaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaProizvodaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(258, 258, 258))
            .addGroup(pnlListaProizvodaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlListaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlListaProizvodaLayout.createSequentialGroup()
                        .addComponent(btnobrisiProizvod1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIzmeniProizvod1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(pnlListaProizvodaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        pnlListaProizvodaLayout.setVerticalGroup(
            pnlListaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaProizvodaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlListaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(btnobrisiProizvod1)
                    .addComponent(btnIzmeniProizvod1))
                .addGap(27, 27, 27))
        );

        pnlIzmenaProizvoda.setBackground(new java.awt.Color(204, 255, 204));

        txtKolicina.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKolicina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSacuvajIzmeneProizvoda.setBackground(new java.awt.Color(153, 204, 255));
        btnSacuvajIzmeneProizvoda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSacuvajIzmeneProizvoda.setText("SAČUVAJ  IZMENE");
        btnSacuvajIzmeneProizvoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajIzmeneProizvodaActionPerformed(evt);
            }
        });

        lblNazivProizvoda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNazivProizvoda.setText("NAZIV PROIZVODA");

        lblCena.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCena.setText("CENA PROIZVODA");

        lblJedinicaMere.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJedinicaMere.setText("JEDINICA MERE");

        lblKolicina.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKolicina.setText("KOLIČINA");

        txtNazivProizvoda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNazivProizvoda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNazivProizvoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNazivProizvodaActionPerformed(evt);
            }
        });

        txtCenaProizvoda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCenaProizvoda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboBoxJedinicaMere.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboBoxJedinicaMere.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ID");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnOdustaniOdIzmena.setBackground(new java.awt.Color(204, 204, 255));
        btnOdustaniOdIzmena.setText("ODUSTANI");
        btnOdustaniOdIzmena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniOdIzmenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIzmenaProizvodaLayout = new javax.swing.GroupLayout(pnlIzmenaProizvoda);
        pnlIzmenaProizvoda.setLayout(pnlIzmenaProizvodaLayout);
        pnlIzmenaProizvodaLayout.setHorizontalGroup(
            pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzmenaProizvodaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlIzmenaProizvodaLayout.createSequentialGroup()
                        .addComponent(btnOdustaniOdIzmena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSacuvajIzmeneProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlIzmenaProizvodaLayout.createSequentialGroup()
                        .addGroup(pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNazivProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblCena, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJedinicaMere, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNazivProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCenaProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBoxJedinicaMere, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlIzmenaProizvodaLayout.setVerticalGroup(
            pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIzmenaProizvodaLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNazivProizvoda)
                    .addComponent(txtNazivProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCenaProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCena))
                .addGap(15, 15, 15)
                .addGroup(pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJedinicaMere)
                    .addComponent(comboBoxJedinicaMere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(pnlIzmenaProizvodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSacuvajIzmeneProizvoda)
                    .addComponent(btnOdustaniOdIzmena))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pnlListaProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(pnlIzmenaProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlListaProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnlIzmenaProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajIzmeneProizvodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajIzmeneProizvodaActionPerformed

        if (txtNazivProizvoda.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Niste uneli naziv proizvoda");
            return;
        }

        if (txtCenaProizvoda.getText().isEmpty() || !txtCenaProizvoda.getText().matches("[0-9]*\\.?[0-9]+")) {     
            JOptionPane.showMessageDialog(null, "Niste uneli adekvatno cenu proizvoda");
            return;
        }
        if (txtKolicina.getText().trim().isEmpty() || !txtKolicina.getText().matches("[0-9]*\\.?[0-9]+")) {          
            JOptionPane.showMessageDialog(null, "Niste uneli adekvatno količinu"
                    + " proizvoda");
            return;
        }

        Proizvod p = new Proizvod(Integer.parseInt(txtId.getText().trim()), txtNazivProizvoda.getText().trim(), Double.parseDouble(txtCenaProizvoda.getText().trim()), comboBoxJedinicaMere.getSelectedItem().toString(), Double.parseDouble(txtKolicina.getText().trim()), null);

        int odgovor = JOptionPane.showConfirmDialog(this, "DA LI ŽELITE DA SACUVATE IZMENE");

        if (odgovor == JOptionPane.NO_OPTION) {
            return;
        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
            return;
        } else if (odgovor == JOptionPane.CANCEL_OPTION) {
            return;
        } else if (odgovor == JOptionPane.YES_OPTION) {
            proizvodInterface.izmeniProizvod(p);
            System.out.println("Izmenjen je proizvod: " + p.getNaziv());

            popuniTabeluProizvod();

        }
    }//GEN-LAST:event_btnSacuvajIzmeneProizvodaActionPerformed

    private void txtNazivProizvodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNazivProizvodaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNazivProizvodaActionPerformed

    private void btnOdustaniOdIzmenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniOdIzmenaActionPerformed
        pnlIzmenaProizvoda.setVisible(false);
    }//GEN-LAST:event_btnOdustaniOdIzmenaActionPerformed

    private void btnIzmeniProizvod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniProizvod1ActionPerformed

        int selectedRow = tblListaProizvoda.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "NISTE SELEKTOVALI PROIZVOD KOJI ŽELITE DA IZMENITE");
            return;

        }

        TabelaProizvod tb = (TabelaProizvod) tblListaProizvoda.getModel();

        Proizvod p = tb.getSelectedProizvod(selectedRow);

        txtId.setText(String.valueOf(p.getIdProizvoda()));
        txtNazivProizvoda.setText(p.getNaziv());
        txtKolicina.setText(String.valueOf(p.getKolicina()));
        txtCenaProizvoda.setText(String.valueOf(p.getCena()));
        comboBoxJedinicaMere.setSelectedItem(p.getJedinicaMere());

        pnlIzmenaProizvoda.setVisible(true);
    }//GEN-LAST:event_btnIzmeniProizvod1ActionPerformed

    private void btnobrisiProizvod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnobrisiProizvod1ActionPerformed

        int selectedRow = tblListaProizvoda.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI PROIZVOD KOJI ŽELITE DA OBRIŠETE");
            return;
        }

        TabelaProizvod tp = (TabelaProizvod) tblListaProizvoda.getModel();

        Proizvod p = tp.getSelectedProizvod(selectedRow);

        int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA OBRIŠETE OVAJ PROIZVOD");

        if (odgovor == JOptionPane.NO_OPTION) {
            return;
        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
            return;
        } else if (odgovor == JOptionPane.CANCEL_OPTION) {
            return;
        } else if (odgovor == JOptionPane.YES_OPTION) {
            proizvodInterface.izbrisiProizvod(p);

            System.out.println("Proizvod " + p.getNaziv().toString() + " je obrisan");

            popuniTabeluProizvod();

        }

    }//GEN-LAST:event_btnobrisiProizvod1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeniProizvod1;
    private javax.swing.JButton btnOdustaniOdIzmena;
    private javax.swing.JButton btnSacuvajIzmeneProizvoda;
    private javax.swing.JButton btnobrisiProizvod1;
    private javax.swing.JComboBox<String> comboBoxJedinicaMere;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCena;
    private javax.swing.JLabel lblJedinicaMere;
    private javax.swing.JLabel lblKolicina;
    private javax.swing.JLabel lblNazivProizvoda;
    private javax.swing.JPanel pnlIzmenaProizvoda;
    private javax.swing.JPanel pnlListaProizvoda;
    private javax.swing.JTable tblListaProizvoda;
    private javax.swing.JTextField txtCenaProizvoda;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKolicina;
    private javax.swing.JTextField txtNazivProizvoda;
    // End of variables declaration//GEN-END:variables

    private void popuniTabeluProizvod() {

        List<Proizvod> proizvodi = proizvodInterface.listaProizvoda();
        TableModel tm = new TabelaProizvod(proizvodi);

        tblListaProizvoda.setModel(tm);

    }

    private void popuniCombo() {

        for (JedinicaMere jedMere : JedinicaMere.values()) {
            comboBoxJedinicaMere.addItem(jedMere.toString());
        }

    }

}
