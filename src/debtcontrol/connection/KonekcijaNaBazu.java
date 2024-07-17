/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author podrska
 */
public class KonekcijaNaBazu {
    
    private static KonekcijaNaBazu instance;
    private final Connection connection;

    private KonekcijaNaBazu () throws SQLException  {
        
        String url = "jdbc:mysql://localhost:3306/debtcontrol";
        String user = "root";
        String password = "root";
        
        connection = DriverManager.getConnection(url, user, password);
        
        
    }
    
    public static KonekcijaNaBazu getInstance () throws SQLException{
        if (instance==null){
            instance = new KonekcijaNaBazu();
        }
        return instance;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void closeConnection () throws SQLException{
        if (connection!=null){
        connection.close();
    }
    }
}
