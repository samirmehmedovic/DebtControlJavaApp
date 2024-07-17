/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.repositoryImpl;

import java.sql.Connection;
import debtcontrol.connection.KonekcijaNaBazu;
import debtcontrol.model.Proizvod;
import debtcontrol.model.Racun;
import debtcontrol.model.StavkaRacuna;
import debtcontrol.repository.StavkeRacunaInterface;
import java.sql.SQLException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author podrska
 */
public class StavkaRacunaInterfaceImpl implements StavkeRacunaInterface {

    @Override
    public List<StavkaRacuna> listaStavkaRacuna() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void dodajStavkaRacuna(StavkaRacuna stavka) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

            String upit = "INSERT INTO STAVKARACUNA (kolicinaStavke, racunId, proizvodId, cena, ukupno ) values (?,?,?,?,?)";

            PreparedStatement ps = connection.prepareStatement(upit, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, stavka.getKolicina());
            ps.setInt(2, stavka.getRacunId());
            ps.setInt(3, stavka.getProizvod().getIdProizvoda());
            ps.setDouble(4, stavka.getCenaProizvoda());
            ps.setDouble(5, stavka.getUkupno());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            while (rs.next()) {
                stavka.setStavkaRacunaId(rs.getInt(1));
            }

            ps.close();
            rs.close();
            System.out.println("Uspesno dodata stavka");

        } catch (SQLException ex) {

            System.out.println("Greska, neuspesno dodata stavka racuna" + ex.getMessage());
        }

    }

    @Override
    public void izbrisiStavkuRacuna(Proizvod proizvod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void izmeniStavkuRacuna(StavkaRacuna sr) {


        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

               String upit = "UPDATE STAVKARACUNA set idStavka = ?, kolicinaStavke = ?, racunId = ?, proizvodId = ?, cena = ?, ukupno = ?";
               
               PreparedStatement ps = connection.prepareStatement(upit);
              
               ps.setInt(1, sr.getStavkaRacunaId());
               ps.setDouble(2, sr.getKolicina());
               ps.setInt(2, sr.getRacunId());
               ps.setInt(4, sr.getProizvod().getIdProizvoda());
               ps.setDouble(5, sr.getCenaProizvoda());
               ps.setDouble(6, sr.getUkupno());
               
               ps.executeUpdate();
               ps.close();
               
                       

        } catch (SQLException ex) {

            System.out.println("Greska prilikom izmene kod stavke racuna "+ ex.getMessage());
        }


    }

    @Override
    public StavkaRacuna pronadjiStavkuRacuna(int stavkaId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<StavkaRacuna> stavkePoRacunu(int racunId) {

        List<StavkaRacuna> stavke = new ArrayList<>();

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "SELECT * from stavkaracuna join Proizvod on (StavkaRacuna.proizvodId = Proizvod.idProizvod) where racunId = " + racunId;

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(upit);

            while (rs.next()) {
                Proizvod p = new Proizvod(rs.getInt("idProizvod"), rs.getString("nazivProizvoda"), rs.getDouble("cenaProizvoda"), rs.getString("jedinicaMere"), rs.getDouble("kolicinaProizvoda"), null);
                StavkaRacuna sr = new StavkaRacuna(rs.getInt("idStavka"), rs.getDouble("kolicinaStavke"), rs.getDouble("cena"), rs.getDouble("ukupno"), rs.getInt("racunId"), p);

                stavke.add(sr);
            }
            statement.close();
            rs.close();
            return stavke;

        } catch (SQLException ex) {
            System.out.println("Neuspesno izdvojene stavke racuna " + racunId + " " + ex.getMessage());
            return null;
        }

    }

}
