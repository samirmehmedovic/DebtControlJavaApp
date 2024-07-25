/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.model;

import debtcontrol.repository.ButtonAction;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author podrska
 */
public class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
    
    private final JButton button;
    private final JTable table;
    private final ButtonAction action;

    private String label;
    private boolean isPushed;
    
     public ButtonEditor(JTable table, ButtonAction action) {
        this.table = table;
        this.action = action;
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

    

    @Override
    public void actionPerformed(ActionEvent e) {

             if (isPushed) {
            int selectedRow = table.getSelectedRow();
            action.performAction(selectedRow);
        }
        isPushed = false;
        fireEditingStopped();
    
   }
    
}
