/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.form.controller;

import debtcontrol.form.KlubForm;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author podrska
 */
public class LogInController {
    
    /**
     *
     * @param txtPassword
     * @param lblError
     * @param txtPassword
     */
    public static void logIn(JPasswordField txtPassword, JLabel lblError){
        
        
         char [ ]password = txtPassword.getPassword();
         
         String pass = new String (password);
        
        if (!pass.equals("0000")){
            lblError.setVisible(true);
            txtPassword.setText("");
            return;
        }
        else{
            KlubForm kf = new KlubForm();
            kf.setVisible(true);
            kf.setExtendedState(kf.MAXIMIZED_BOTH);

        }
        
    }
    
}
