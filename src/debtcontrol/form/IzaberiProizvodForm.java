/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package debtcontrol.form;

import debtcontrol.form.controller.IzaberiProizvodController;
import debtcontrol.model.Proizvod;
import debtcontrol.model.StavkaRacuna;

import debtcontrol.repository.ProizvodInterface;
import debtcontrol.repositoryImpl.ProizvodInterfaceImpl;

import debtcontrol.repository.StavkeRacunaInterface;
import debtcontrol.repositoryImpl.StavkaRacunaInterfaceImpl;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author podrska
 */
public class IzaberiProizvodForm extends javax.swing.JDialog {

    ProizvodInterface proizvodInterface;
    Proizvod proizvod;
    StavkeRacunaInterface stavkeRacunaInterface;
    StavkaRacuna stavkaRacuna;

    /**
     * Creates new form IzaberiProizvodForm
     */
    public IzaberiProizvodForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        proizvodInterface = new ProizvodInterfaceImpl();
        stavkeRacunaInterface = new StavkaRacunaInterfaceImpl();

        initComponents();
        
        txtId.setVisible(false);

        btnBlanko.setVisible(false);

        setLocationRelativeTo(null);
        jLabel6.setVisible(true);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        pnlProizvod.setVisible(true);
        
        
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProizvod = new javax.swing.JPanel();
        txtNaziv = new javax.swing.JTextField();
        txtCena = new javax.swing.JTextField();
        btnSacuvajProizvod = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        btnIzadji = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        txtId = new javax.swing.JTextField();
        pnlProizvodi = new javax.swing.JPanel();
        btnKafa = new javax.swing.JButton();
        btnEspresso = new javax.swing.JButton();
        btnKafaSaMlekom = new javax.swing.JButton();
        btnKafaKabeza = new javax.swing.JButton();
        btnKapucino = new javax.swing.JButton();
        btnNeskafa = new javax.swing.JButton();
        btnEspresoSaMlekom = new javax.swing.JButton();
        btnMleko = new javax.swing.JButton();
        btnCajNana = new javax.swing.JButton();
        btnCedjenaPomorandza = new javax.swing.JButton();
        btnMed = new javax.swing.JButton();
        btnCajZeleni = new javax.swing.JButton();
        btnCedjeniGrejpfrut = new javax.swing.JButton();
        btnToplaCokolada = new javax.swing.JButton();
        btnCajJabukaCimet = new javax.swing.JButton();
        btnCedjeniMiks = new javax.swing.JButton();
        btnRosa = new javax.swing.JButton();
        btnCajDjumbir = new javax.swing.JButton();
        btnLimunada = new javax.swing.JButton();
        btnKiselaVoda = new javax.swing.JButton();
        btnCajKamilica = new javax.swing.JButton();
        btnKokaKola = new javax.swing.JButton();
        btnSokNarandza = new javax.swing.JButton();
        btnCajHibiskus = new javax.swing.JButton();
        btnSvepsBiterLemon = new javax.swing.JButton();
        btnSokBorovnica = new javax.swing.JButton();
        btnBlanko = new javax.swing.JButton();
        btnSvepsTangerina = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IZABERI  PROIZVOD");
        setBackground(new java.awt.Color(255, 255, 255));

        pnlProizvod.setBackground(new java.awt.Color(204, 255, 204));
        pnlProizvod.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtNaziv.setEditable(false);
        txtNaziv.setBackground(new java.awt.Color(255, 255, 255));
        txtNaziv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNaziv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCena.setEditable(false);
        txtCena.setBackground(new java.awt.Color(255, 255, 255));
        txtCena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSacuvajProizvod.setBackground(new java.awt.Color(153, 204, 255));
        btnSacuvajProizvod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSacuvajProizvod.setText("DODAJ NA RAČUN");
        btnSacuvajProizvod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSacuvajProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajProizvodActionPerformed(evt);
            }
        });

        btnIzadji.setBackground(new java.awt.Color(255, 204, 255));
        btnIzadji.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIzadji.setText("ZATVORI");
        btnIzadji.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIzadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzadjiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("NAZIV  PROIZVODA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CENA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("KOLIČINA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("IZABRANI  PROIZVOD");

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSpinner1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout pnlProizvodLayout = new javax.swing.GroupLayout(pnlProizvod);
        pnlProizvod.setLayout(pnlProizvodLayout);
        pnlProizvodLayout.setHorizontalGroup(
            pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProizvodLayout.createSequentialGroup()
                .addGroup(pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProizvodLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIzadji, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProizvodLayout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProizvodLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSacuvajProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlProizvodLayout.createSequentialGroup()
                                        .addGroup(pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))))))
                    .addGroup(pnlProizvodLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProizvodLayout.setVerticalGroup(
            pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProizvodLayout.createSequentialGroup()
                .addGroup(pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProizvodLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblError))
                    .addGroup(pnlProizvodLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlProizvodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzadji)
                    .addComponent(btnSacuvajProizvod))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pnlProizvodi.setBackground(new java.awt.Color(255, 255, 255));
        pnlProizvodi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnKafa.setBackground(new java.awt.Color(204, 153, 0));
        btnKafa.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnKafa.setText("KAFA");
        btnKafa.setBorder(new javax.swing.border.MatteBorder(null));
        btnKafa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKafaActionPerformed(evt);
            }
        });

        btnEspresso.setBackground(new java.awt.Color(204, 153, 0));
        btnEspresso.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEspresso.setText("ESPRESO");
        btnEspresso.setBorder(new javax.swing.border.MatteBorder(null));
        btnEspresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspressoActionPerformed(evt);
            }
        });

        btnKafaSaMlekom.setBackground(new java.awt.Color(204, 153, 0));
        btnKafaSaMlekom.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnKafaSaMlekom.setText("<html>KAFA <br>SA MLEKOM</html>");
        btnKafaSaMlekom.setBorder(new javax.swing.border.MatteBorder(null));
        btnKafaSaMlekom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKafaSaMlekomActionPerformed(evt);
            }
        });

        btnKafaKabeza.setBackground(new java.awt.Color(204, 153, 0));
        btnKafaKabeza.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnKafaKabeza.setText("<html>   KAFA <br>KABEZA</html>\n");
        btnKafaKabeza.setBorder(new javax.swing.border.MatteBorder(null));
        btnKafaKabeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKafaKabezaActionPerformed(evt);
            }
        });

        btnKapucino.setBackground(new java.awt.Color(204, 153, 0));
        btnKapucino.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnKapucino.setText("KAPUĆINO");
        btnKapucino.setBorder(new javax.swing.border.MatteBorder(null));
        btnKapucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapucinoActionPerformed(evt);
            }
        });

        btnNeskafa.setBackground(new java.awt.Color(204, 153, 0));
        btnNeskafa.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnNeskafa.setText("NES KAFA");
        btnNeskafa.setBorder(new javax.swing.border.MatteBorder(null));
        btnNeskafa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNeskafaActionPerformed(evt);
            }
        });

        btnEspresoSaMlekom.setBackground(new java.awt.Color(204, 153, 0));
        btnEspresoSaMlekom.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnEspresoSaMlekom.setText("<html>ESPRESO <br>SA MLEKOM</html>");
        btnEspresoSaMlekom.setBorder(new javax.swing.border.MatteBorder(null));
        btnEspresoSaMlekom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspresoSaMlekomActionPerformed(evt);
            }
        });

        btnMleko.setBackground(new java.awt.Color(204, 153, 0));
        btnMleko.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnMleko.setText("MLEKO");
        btnMleko.setBorder(new javax.swing.border.MatteBorder(null));
        btnMleko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMlekoActionPerformed(evt);
            }
        });

        btnCajNana.setBackground(new java.awt.Color(0, 204, 153));
        btnCajNana.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCajNana.setText("<html>ČAJ <br>NANA</html>");
        btnCajNana.setBorder(new javax.swing.border.MatteBorder(null));
        btnCajNana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajNanaActionPerformed(evt);
            }
        });

        btnCedjenaPomorandza.setBackground(new java.awt.Color(0, 204, 153));
        btnCedjenaPomorandza.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnCedjenaPomorandza.setText("<html>CEDJENA <br>POMORANDŽA</html>");
        btnCedjenaPomorandza.setBorder(new javax.swing.border.MatteBorder(null));
        btnCedjenaPomorandza.setMargin(new java.awt.Insets(2, 8, 3, 14));
        btnCedjenaPomorandza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCedjenaPomorandzaActionPerformed(evt);
            }
        });

        btnMed.setBackground(new java.awt.Color(204, 153, 0));
        btnMed.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnMed.setText("MED");
        btnMed.setBorder(new javax.swing.border.MatteBorder(null));
        btnMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedActionPerformed(evt);
            }
        });

        btnCajZeleni.setBackground(new java.awt.Color(0, 204, 153));
        btnCajZeleni.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCajZeleni.setText("<html>ČAJ <br>ZELENI</html>");
        btnCajZeleni.setBorder(new javax.swing.border.MatteBorder(null));
        btnCajZeleni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajZeleniActionPerformed(evt);
            }
        });

        btnCedjeniGrejpfrut.setBackground(new java.awt.Color(0, 204, 153));
        btnCedjeniGrejpfrut.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCedjeniGrejpfrut.setText("<html>CEDJENI <br>GREJPFRUT</html>");
        btnCedjeniGrejpfrut.setBorder(new javax.swing.border.MatteBorder(null));
        btnCedjeniGrejpfrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCedjeniGrejpfrutActionPerformed(evt);
            }
        });

        btnToplaCokolada.setBackground(new java.awt.Color(204, 153, 0));
        btnToplaCokolada.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnToplaCokolada.setText("<html>TOPLA <br>ČOKOLADA</html>");
        btnToplaCokolada.setBorder(new javax.swing.border.MatteBorder(null));
        btnToplaCokolada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToplaCokoladaActionPerformed(evt);
            }
        });

        btnCajJabukaCimet.setBackground(new java.awt.Color(0, 204, 153));
        btnCajJabukaCimet.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnCajJabukaCimet.setText("<html>ČAJ <br>JABUKA-CIMET</html>");
        btnCajJabukaCimet.setBorder(new javax.swing.border.MatteBorder(null));
        btnCajJabukaCimet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajJabukaCimetActionPerformed(evt);
            }
        });

        btnCedjeniMiks.setBackground(new java.awt.Color(0, 204, 153));
        btnCedjeniMiks.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCedjeniMiks.setText("<html>CEDJENI <br>MIKS</html>");
        btnCedjeniMiks.setBorder(new javax.swing.border.MatteBorder(null));
        btnCedjeniMiks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCedjeniMiksActionPerformed(evt);
            }
        });

        btnRosa.setBackground(new java.awt.Color(204, 153, 0));
        btnRosa.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRosa.setText("ROSA");
        btnRosa.setBorder(new javax.swing.border.MatteBorder(null));
        btnRosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRosaActionPerformed(evt);
            }
        });

        btnCajDjumbir.setBackground(new java.awt.Color(0, 204, 153));
        btnCajDjumbir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCajDjumbir.setText("<html>ČAJ <br>DJUMBIR</html>");
        btnCajDjumbir.setBorder(new javax.swing.border.MatteBorder(null));
        btnCajDjumbir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajDjumbirActionPerformed(evt);
            }
        });

        btnLimunada.setBackground(new java.awt.Color(0, 204, 153));
        btnLimunada.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnLimunada.setText("LIMUNADA");
        btnLimunada.setBorder(new javax.swing.border.MatteBorder(null));
        btnLimunada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimunadaActionPerformed(evt);
            }
        });

        btnKiselaVoda.setBackground(new java.awt.Color(204, 153, 0));
        btnKiselaVoda.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnKiselaVoda.setText("<html>KISELA <br>VODA</html>");
        btnKiselaVoda.setBorder(new javax.swing.border.MatteBorder(null));
        btnKiselaVoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiselaVodaActionPerformed(evt);
            }
        });

        btnCajKamilica.setBackground(new java.awt.Color(0, 204, 153));
        btnCajKamilica.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCajKamilica.setText("<html>ČAJ <br>KAMILICA</html>");
        btnCajKamilica.setBorder(new javax.swing.border.MatteBorder(null));
        btnCajKamilica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajKamilicaActionPerformed(evt);
            }
        });

        btnKokaKola.setBackground(new java.awt.Color(0, 204, 153));
        btnKokaKola.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnKokaKola.setText("KOKA KOLA");
        btnKokaKola.setBorder(new javax.swing.border.MatteBorder(null));
        btnKokaKola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKokaKolaActionPerformed(evt);
            }
        });

        btnSokNarandza.setBackground(new java.awt.Color(204, 153, 0));
        btnSokNarandza.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSokNarandza.setText("<html>SOK <br>NARANDŽA</html>");
        btnSokNarandza.setBorder(new javax.swing.border.MatteBorder(null));
        btnSokNarandza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokNarandzaActionPerformed(evt);
            }
        });

        btnCajHibiskus.setBackground(new java.awt.Color(0, 204, 153));
        btnCajHibiskus.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCajHibiskus.setText("<html>ČAJ <br>HIBISKUS</html>");
        btnCajHibiskus.setBorder(new javax.swing.border.MatteBorder(null));
        btnCajHibiskus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajHibiskusActionPerformed(evt);
            }
        });

        btnSvepsBiterLemon.setBackground(new java.awt.Color(0, 204, 153));
        btnSvepsBiterLemon.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSvepsBiterLemon.setText("<html>ŠVEPS <br>BITERLEMON</html>");
        btnSvepsBiterLemon.setBorder(new javax.swing.border.MatteBorder(null));
        btnSvepsBiterLemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSvepsBiterLemonActionPerformed(evt);
            }
        });

        btnSokBorovnica.setBackground(new java.awt.Color(204, 153, 0));
        btnSokBorovnica.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSokBorovnica.setText("<html>SOK <br>BOROVNICA</html>");
        btnSokBorovnica.setBorder(new javax.swing.border.MatteBorder(null));
        btnSokBorovnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokBorovnicaActionPerformed(evt);
            }
        });

        btnBlanko.setEnabled(false);
        btnBlanko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlankoActionPerformed(evt);
            }
        });

        btnSvepsTangerina.setBackground(new java.awt.Color(0, 204, 153));
        btnSvepsTangerina.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSvepsTangerina.setText("<html>ŠVEPS <br>TANGERINA</html>");
        btnSvepsTangerina.setBorder(new javax.swing.border.MatteBorder(null));
        btnSvepsTangerina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSvepsTangerinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProizvodiLayout = new javax.swing.GroupLayout(pnlProizvodi);
        pnlProizvodi.setLayout(pnlProizvodiLayout);
        pnlProizvodiLayout.setHorizontalGroup(
            pnlProizvodiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProizvodiLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlProizvodiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addComponent(btnKafa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMleko, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCajNana, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCedjenaPomorandza))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addComponent(btnEspresso, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMed, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCajZeleni, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCedjeniGrejpfrut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addComponent(btnKafaSaMlekom, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnToplaCokolada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCajJabukaCimet, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCedjeniMiks, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addComponent(btnKafaKabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCajDjumbir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimunada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addComponent(btnKapucino, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKiselaVoda, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCajKamilica, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKokaKola, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addComponent(btnNeskafa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSokNarandza, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCajHibiskus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSvepsBiterLemon, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addComponent(btnEspresoSaMlekom, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSokBorovnica, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBlanko, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSvepsTangerina, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlProizvodiLayout.setVerticalGroup(
            pnlProizvodiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProizvodiLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlProizvodiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addComponent(btnKafa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(btnKafaSaMlekom, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnKafaKabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnKapucino, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnNeskafa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnEspresoSaMlekom, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMleko, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCajNana, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCedjenaPomorandza, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(pnlProizvodiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProizvodiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnMed, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEspresso, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCajZeleni, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCedjeniGrejpfrut, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnToplaCokolada, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnLimunada, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(btnKiselaVoda, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(btnKokaKola, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(btnSokNarandza, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(btnSvepsBiterLemon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(btnSokBorovnica, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(btnSvepsTangerina, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProizvodiLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(pnlProizvodiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCajJabukaCimet, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCedjeniMiks, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlProizvodiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProizvodiLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnCajDjumbir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProizvodiLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(btnCajKamilica, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProizvodiLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(btnCajHibiskus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProizvodiLayout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(btnBlanko, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\podrska\\Desktop\\kafa.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlProizvodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlProizvodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKafaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKafaActionPerformed


//        proizvod = proizvodInterface.pronadjiProizvod(1);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));

        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 1);
      


    }//GEN-LAST:event_btnKafaActionPerformed

    private void btnSacuvajProizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajProizvodActionPerformed

//        if (txtNaziv.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "NISTE IZABRALI PROIZVOD");
//            return;
//        }
//
//        try {
//
//            Integer kolicina = (Integer) jSpinner1.getValue();
//            int intValue = kolicina.intValue();
//
//            if (intValue == 0) {
//                JOptionPane.showMessageDialog(this, "NISTE UNELI KOLIČINU");
//                return;
//            } else {
//
//                stavkaRacuna = new StavkaRacuna(0, intValue, Double.parseDouble(txtCena.getText().trim()), intValue * Double.parseDouble(txtCena.getText().trim()), 0, proizvod);
//
//                dispose();
//            }
//        } catch (Exception ex) {
//            System.out.println("Greska prilikom unosa količine" + " " + " " + ex.getMessage());
//        }
//
//        System.out.println("OVO JE NOVI PROIZVOD  " + proizvod.getKolicina());
        
        IzaberiProizvodController.proveraProizvoda(txtNaziv, jSpinner1);
    
         stavkaRacuna =  IzaberiProizvodController.sacuvajProizvod(txtNaziv, txtCena, txtId, jSpinner1,  this);
            
    }//GEN-LAST:event_btnSacuvajProizvodActionPerformed

    private void btnEspressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspressoActionPerformed

//        proizvod = proizvodInterface.pronadjiProizvod(7);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 7);


    }//GEN-LAST:event_btnEspressoActionPerformed

    private void btnKafaSaMlekomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKafaSaMlekomActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(2);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 2);
    }//GEN-LAST:event_btnKafaSaMlekomActionPerformed

    private void btnKafaKabezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKafaKabezaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(13);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 13);
    }//GEN-LAST:event_btnKafaKabezaActionPerformed

    private void btnKapucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapucinoActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(3);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 3);
    }//GEN-LAST:event_btnKapucinoActionPerformed

    private void btnNeskafaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNeskafaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(5);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 5);
    }//GEN-LAST:event_btnNeskafaActionPerformed

    private void btnEspresoSaMlekomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspresoSaMlekomActionPerformed
        proizvod = proizvodInterface.pronadjiProizvod(4);

        txtNaziv.setText(proizvod.getNaziv());
        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 4);
    }//GEN-LAST:event_btnEspresoSaMlekomActionPerformed

    private void btnMlekoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMlekoActionPerformed

        proizvod = proizvodInterface.pronadjiProizvod(8);

        txtNaziv.setText(proizvod.getNaziv());
        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 8);

        //      txtKolicina.setText("1");
    }//GEN-LAST:event_btnMlekoActionPerformed

    private void btnCajNanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajNanaActionPerformed
        proizvod = proizvodInterface.pronadjiProizvod(19);

        txtNaziv.setText(proizvod.getNaziv());
        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 19);
    }//GEN-LAST:event_btnCajNanaActionPerformed

    private void btnCedjenaPomorandzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCedjenaPomorandzaActionPerformed
        proizvod = proizvodInterface.pronadjiProizvod(25);

        txtNaziv.setText(proizvod.getNaziv());
        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 25);
    }//GEN-LAST:event_btnCedjenaPomorandzaActionPerformed

    private void btnMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(6);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena, txtId,6);
    }//GEN-LAST:event_btnMedActionPerformed

    private void btnCajZeleniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajZeleniActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(20);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 20);
    }//GEN-LAST:event_btnCajZeleniActionPerformed

    private void btnCedjeniGrejpfrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCedjeniGrejpfrutActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(26);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 26);
    }//GEN-LAST:event_btnCedjeniGrejpfrutActionPerformed

    private void btnToplaCokoladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToplaCokoladaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(9);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 9);
    }//GEN-LAST:event_btnToplaCokoladaActionPerformed

    private void btnCajJabukaCimetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajJabukaCimetActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(21);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 21);
    }//GEN-LAST:event_btnCajJabukaCimetActionPerformed

    private void btnCedjeniMiksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCedjeniMiksActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(27);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 27);
    }//GEN-LAST:event_btnCedjeniMiksActionPerformed

    private void btnRosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRosaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(10);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 10);
    }//GEN-LAST:event_btnRosaActionPerformed

    private void btnCajDjumbirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajDjumbirActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(22);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 22);
    }//GEN-LAST:event_btnCajDjumbirActionPerformed

    private void btnLimunadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimunadaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(28);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 28);
    }//GEN-LAST:event_btnLimunadaActionPerformed

    private void btnKiselaVodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiselaVodaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(12);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 12);
    }//GEN-LAST:event_btnKiselaVodaActionPerformed

    private void btnCajKamilicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajKamilicaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(23);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 23);
    }//GEN-LAST:event_btnCajKamilicaActionPerformed

    private void btnKokaKolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKokaKolaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(29);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 29);
    }//GEN-LAST:event_btnKokaKolaActionPerformed

    private void btnSokNarandzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokNarandzaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(14);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 14);
    }//GEN-LAST:event_btnSokNarandzaActionPerformed

    private void btnCajHibiskusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajHibiskusActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(24);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 24);
    }//GEN-LAST:event_btnCajHibiskusActionPerformed

    private void btnSvepsBiterLemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSvepsBiterLemonActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(30);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 30);
    }//GEN-LAST:event_btnSvepsBiterLemonActionPerformed

    private void btnSokBorovnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokBorovnicaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(15);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 15);
    }//GEN-LAST:event_btnSokBorovnicaActionPerformed

    private void btnBlankoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlankoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBlankoActionPerformed

    private void btnSvepsTangerinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSvepsTangerinaActionPerformed
//        proizvod = proizvodInterface.pronadjiProizvod(31);
//
//        txtNaziv.setText(proizvod.getNaziv());
//        txtCena.setText(String.valueOf(proizvod.getCena()));
        
        IzaberiProizvodController.izaberiProizvod(txtNaziv, txtCena,txtId, 31);
    }//GEN-LAST:event_btnSvepsTangerinaActionPerformed

    private void btnIzadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzadjiActionPerformed
        dispose();
    }//GEN-LAST:event_btnIzadjiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlanko;
    private javax.swing.JButton btnCajDjumbir;
    private javax.swing.JButton btnCajHibiskus;
    private javax.swing.JButton btnCajJabukaCimet;
    private javax.swing.JButton btnCajKamilica;
    private javax.swing.JButton btnCajNana;
    private javax.swing.JButton btnCajZeleni;
    private javax.swing.JButton btnCedjenaPomorandza;
    private javax.swing.JButton btnCedjeniGrejpfrut;
    private javax.swing.JButton btnCedjeniMiks;
    private javax.swing.JButton btnEspresoSaMlekom;
    private javax.swing.JButton btnEspresso;
    private javax.swing.JButton btnIzadji;
    private javax.swing.JButton btnKafa;
    private javax.swing.JButton btnKafaKabeza;
    private javax.swing.JButton btnKafaSaMlekom;
    private javax.swing.JButton btnKapucino;
    private javax.swing.JButton btnKiselaVoda;
    private javax.swing.JButton btnKokaKola;
    private javax.swing.JButton btnLimunada;
    private javax.swing.JButton btnMed;
    private javax.swing.JButton btnMleko;
    private javax.swing.JButton btnNeskafa;
    private javax.swing.JButton btnRosa;
    private javax.swing.JButton btnSacuvajProizvod;
    private javax.swing.JButton btnSokBorovnica;
    private javax.swing.JButton btnSokNarandza;
    private javax.swing.JButton btnSvepsBiterLemon;
    private javax.swing.JButton btnSvepsTangerina;
    private javax.swing.JButton btnToplaCokolada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblError;
    private javax.swing.JPanel pnlProizvod;
    private javax.swing.JPanel pnlProizvodi;
    private javax.swing.JTextField txtCena;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables


public StavkaRacuna vratiStavku(){
    return stavkaRacuna;
}


}
