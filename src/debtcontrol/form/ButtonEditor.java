/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form;

import debtcontrol.model.Racun;
import debtcontrol.model.StavkaRacuna;
import debtcontrol.table.TabelaRacun;
import debtcontrol.table.TabelaStavkeRacuna;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableModel;

/**
 *
 * @author podrska
 */
public class ButtonEditor extends AbstractCellEditor implements TableCellEditor {

    private JButton button;
    private String label;
    private boolean isPushed;
    
    public ButtonEditor(JCheckBox checkBox) {
        button = new JButton();
        button.setOpaque(true);
       
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
//}
//    
//            public void actionPerformed(ActionEvent e) {
//
//            if (isPushed) {
//
//                int selectedRow = tblRacuniKorisnika.getSelectedRow();
//
//                TabelaRacun tr = (TabelaRacun) tblRacuniKorisnika.getModel();
//
//                Racun r = tr.getSelectedRacun(selectedRow);
//
//                List<StavkaRacuna> stavke = r.getStavke();
//
//                TableModel tm = new TabelaStavkeRacuna(stavke);
//
//                PregledRacunaForm prf = new PregledRacunaForm(null, true);
//                prf.setData(String.valueOf(r.getIdRacuna()), r.getDatum().toString(), r.getKorisnik().getIme(), r.getKorisnik().getPrezime(), r.getKorisnik().getMail(), String.valueOf(r.getUkupno()), tm);
//                prf.setVisible(true);
//
//            }
//            isPushed = false;
//            fireEditingStopped();
//
//        }
//                
//    });
    }     
    
    @Override
    public Object getCellEditorValue() {

        if (isPushed) {
            // Dodajte akciju koja će se pokrenuti prilikom klika na dugme
            JOptionPane.showMessageDialog(button, label + ": Opreacija izvršena.");
        }
        isPushed = false;
        return label;
    
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        if (isSelected) {
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
        }
        label = (value == null) ? "PREGLED" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
    }
    
     public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    @Override
    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
    
    
}
