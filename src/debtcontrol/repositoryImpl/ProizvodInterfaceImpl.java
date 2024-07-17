/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.repositoryImpl;

import debtcontrol.connection.KonekcijaNaBazu;
import debtcontrol.model.Proizvod;
import debtcontrol.repository.ProizvodInterface;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author podrska
 */
public class ProizvodInterfaceImpl implements ProizvodInterface{

    @Override
    public List<Proizvod> listaProizvoda() {
         List<Proizvod> proizvodi = new ArrayList<>();
         
        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            
           String upit = "SELECT * from Proizvod";
           
           Statement statement = connection.createStatement();
           ResultSet rs = statement.executeQuery(upit);
           while(rs.next()){
               Proizvod p = new Proizvod(rs.getInt("idProizvod"), rs.getString("nazivProizvoda"), rs.getDouble("cenaProizvoda"), rs.getString("jedinicaMere"),rs.getDouble("kolicinaProizvoda"), null);
           
            proizvodi.add(p);
           }
            statement.close();
            rs.close();           
            return proizvodi;
            
        } catch (SQLException ex) {
            System.out.println("Nije ucitana lista proizvoda"+ ex.getMessage());
            return null;
        }
       
    }

    @Override
    public void dodajNoviProizvod(Proizvod proizvod) {
        
        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
         
        String upit = "Insert into Proizvod ( nazivProizvoda, cenaProizvoda, jedinicaMere, kolicinaProizvoda,sastojak  )values (?,?,?,?,?)";
        
        
      PreparedStatement preparedStatement = connection.prepareStatement(upit, Statement.RETURN_GENERATED_KEYS);
        
            
            preparedStatement.setString(1, proizvod.getNaziv());
            preparedStatement.setDouble(2, proizvod.getCena());
            preparedStatement.setString(3, proizvod.getJedinicaMere());
            preparedStatement.setDouble(4, proizvod.getKolicina());
            preparedStatement.setObject(5, proizvod.getSastojci());
            
            preparedStatement.executeUpdate();
            
            ResultSet rs  = preparedStatement.getGeneratedKeys();
            if(rs.next()){
                proizvod.setIdProizvoda(rs.getInt(1));
            }
            
            preparedStatement.close();
            
            
        
        } catch (SQLException ex) {
                    System.out.println("Greska prilikom dodavanja proizvoda" + ex.getMessage());
        }

        
    }

    @Override
    public void izbrisiProizvod(Proizvod proizvod) {

        String upit = "Delete from proizvod where idProizvod = "+proizvod.getIdProizvoda();
        
        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
       
       Statement statement = connection.createStatement();
       
       statement.executeUpdate(upit);
       
       statement.close();
        
        
            
        
        } catch (SQLException ex) {
            Logger.getLogger(ProizvodInterfaceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void izmeniProizvod(Proizvod proizvod) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
        
            String upit = "UPDATE PROIZVOD SET  nazivProizvoda= ?, cenaProizvoda = ?, jedinicaMere=?, kolicinaProizvoda = ? WHERE idProizvod ="+proizvod.getIdProizvoda();
            
            PreparedStatement ps = connection.prepareStatement(upit);
            
           
            ps.setString(1, proizvod.getNaziv());
            ps.setDouble(2, proizvod.getCena());           
            ps.setString(3, proizvod.getJedinicaMere());
            ps.setDouble(4, proizvod.getKolicina());
            
            ps.executeUpdate();
            ps.close();
            
        
        } catch (SQLException ex) {
            System.out.println("Greska, proizvod nije izmenjen "+ex.getMessage()); 
        }


    }

    @Override
    public Proizvod pronadjiProizvod(int idProizvoda) {

      
        
        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "SELECT * from Proizvod where idProizvod = "+idProizvoda;
            
           Statement statement  = connection.createStatement();
           ResultSet rs = statement.executeQuery(upit);
           
           if(rs.next()){
              Proizvod p = new Proizvod(rs.getInt("idProizvod"),rs.getString("nazivProizvoda"), rs.getDouble("cenaProizvoda"), rs.getString("jedinicaMere"),rs.getDouble("kolicinaProizvoda"), null);
           return p;
           }else{
               System.out.println("Nema Proizvoda sa tim id");
        }
            rs.close();
            statement.close();
          
           
            
            
        } catch (SQLException ex) {
            System.out.println("neuspeo pokusaj pronalazenja proizvoda sa tim id");
           
        }
         return null;
    }

    @Override
    public void dodajNaStanjeProizvoda(Proizvod proizvod, double kolicina) {

        try {
            String upit = "UPDATE PROIZVOD SET kolicinaProizvoda ="+(proizvod.getKolicina() + kolicina)+ " where idProizvod ="+ proizvod.getIdProizvoda();
            
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            
           Statement statement = connection.createStatement();
            
           statement.executeUpdate(upit);
           statement.close();
           
            System.out.println("PROIZVOD JE "+proizvod.getNaziv()+ " a ukupna kolicina je "+ (proizvod.getKolicina()+kolicina));

        } catch (SQLException ex) {
            System.out.println("Neuspesno dodata kolicina proizvoda"+ex.getMessage());

        }
    }

    @Override
    public void oduzmiSaStanjaProizvoda(Proizvod proizvod, double kolicina) {

         try {
            String upit = "UPDATE PROIZVOD SET kolicinaProizvoda ="+(proizvod.getKolicina() - kolicina)+ " where idProizvod ="+ proizvod.getIdProizvoda();
            
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            
           Statement statement = connection.createStatement();
            
           statement.executeUpdate(upit);
           statement.close();
           
            System.out.println("PROIZVOD JE "+proizvod.getNaziv()+ " a ukupna kolicina je "+ (proizvod.getKolicina()+kolicina));

        } catch (SQLException ex) {
            System.out.println("Neuspesno dodata kolicina proizvoda"+ex.getMessage());

        }
        

    }
    
}
