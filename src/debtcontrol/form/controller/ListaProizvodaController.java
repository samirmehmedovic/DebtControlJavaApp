/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.model.Proizvod;
import debtcontrol.repository.ProizvodInterface;
import debtcontrol.repositoryImpl.ProizvodInterfaceImpl;
import debtcontrol.table.TabelaProizvod;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class ListaProizvodaController {
    
        public static void sacuvajIzmene(JTextField txtNazivProizvoda,JTextField txtCenaProizvoda,JTextField txtKolicina,
            JTextField txtId, JTable tblListaProizvoda, JComboBox comboBoxJedinicaMere, JPanel pnlIzmenaProizvoda){
       
        ProizvodInterface proizvodInterface = new ProizvodInterfaceImpl();
        
        
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

        int odgovor = JOptionPane.showConfirmDialog(null, "DA LI ŽELITE DA SACUVATE IZMENE");

        if (odgovor == JOptionPane.NO_OPTION) {
            return;
        } else if (odgovor == JOptionPane.CLOSED_OPTION) {
            return;
        } else if (odgovor == JOptionPane.CANCEL_OPTION) {
            return;
        } else if (odgovor == JOptionPane.YES_OPTION) {
            proizvodInterface.izmeniProizvod(p);
            System.out.println("Izmenjen je proizvod: " + p.getNaziv());

            popuniTabeluProizvodi(tblListaProizvoda);
            
            pnlIzmenaProizvoda.setVisible(false);
            

        }
    }
    
    public static void popuniTabeluProizvodi(JTable tblListaProizvoda){
        ProizvodInterface proizvodInterface = new ProizvodInterfaceImpl();
        
         List<Proizvod> proizvodi = proizvodInterface.listaProizvoda();
        TableModel tm = new TabelaProizvod(proizvodi);

        tblListaProizvoda.setModel(tm);
    }
    
    public static void izmeniProizvod(JTextField txtNazivProizvoda,JTextField txtCenaProizvoda,JTextField txtKolicina, 
                                JTextField txtId, JTable table, JComboBox comboBoxJedinicaMere, JPanel pnlIzmenaProizvoda){
        
        
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "NISTE SELEKTOVALI PROIZVOD KOJI ŽELITE DA IZMENITE");
            return;

        }

        TabelaProizvod tb = (TabelaProizvod) table.getModel();

        Proizvod p = tb.getSelectedProizvod(selectedRow);

        txtId.setText(String.valueOf(p.getIdProizvoda()));
        txtNazivProizvoda.setText(p.getNaziv());
        txtKolicina.setText(String.valueOf(p.getKolicina()));
        txtCenaProizvoda.setText(String.valueOf(p.getCena()));
        comboBoxJedinicaMere.setSelectedItem(p.getJedinicaMere());

        pnlIzmenaProizvoda.setVisible(true);
    }                                                  

    public static void obrisiProizvod(JTable tblListaProizvoda) {    
        
        ProizvodInterface proizvodInterface = new ProizvodInterfaceImpl();

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

            popuniTabeluProizvodi(tblListaProizvoda);

        }
    }    

    
}
