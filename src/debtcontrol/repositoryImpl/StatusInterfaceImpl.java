/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.repositoryImpl;

import debtcontrol.connection.KonekcijaNaBazu;
import debtcontrol.model.Status;
import debtcontrol.repository.StatusInterface;
import java.io.ObjectInputFilter;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author podrska
 */
public class StatusInterfaceImpl implements StatusInterface {

    @Override
    public Status vratiStatus(int racunId) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "SELECT STATUS JOIN Racun where idRacun = " + racunId;

        } catch (SQLException ex) {
            Logger.getLogger(StatusInterfaceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

}
