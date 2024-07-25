/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.repositoryImpl;

import debtcontrol.connection.KonekcijaNaBazu;
import debtcontrol.model.Korisnik;
import debtcontrol.repository.KorisnikInterface;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

/**
 *
 * @author podrska
 */
public class KorisnikInterfaceImpl implements KorisnikInterface {

    @Override
    public List<Korisnik> listaKorisnika() {

        List<Korisnik> korisnici = new ArrayList<>();

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

            String upit = "SELECT * from korisnik";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(upit);

            while (rs.next()) {
                Korisnik z = new Korisnik(rs.getInt("idKorisnik"), rs.getString("Ime"), rs.getString("prezime"), rs.getString("email"), rs.getBoolean("mailObavestenje"));
                korisnici.add(z);
            }
            statement.close();
            rs.close();
            return korisnici;

        } catch (SQLException ex) {
            System.out.println("Lista zaposlenih greska" + ex.getMessage());
            return null;
        }

    }

    @Override
    public void dodajKorisnika(Korisnik k) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

            String upit = "INSERT INTO korisnik (ime, prezime, email, mailObavestenje) values  (?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(upit, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, k.getIme());
            preparedStatement.setString(2, k.getPrezime());
            preparedStatement.setString(3, k.getMail());
            preparedStatement.setBoolean(4, k.isMailObavestenja());

            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                k.setIdKorisnik(rs.getInt(1));
            }
            preparedStatement.close();

        } catch (SQLException ex) {

            System.out.println("GRESKA prilikom unosa novog zaposlenog" + ex.getMessage());
        }

    }

    @Override
    public void izbrisiKorisnika(Korisnik k) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

            String upit = "DELETE FROM Korisnik where idKorisnik = " + k.getIdKorisnik();

            Statement statement = connection.createStatement();
            statement.executeUpdate(upit);
            statement.close();

        } catch (SQLException ex) {

            System.out.println("Greska prilikom brisanja korisnika" + ex.getMessage());
        }

    }

    @Override
    public void izmeniKorisnika(Korisnik k) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

            String upit = "UPDATE Korisnik set idKorisnik = ?, ime = ?, prezime  = ?, email = ?, mailObavestenje = ? where idKorisnik = " + k.getIdKorisnik();

            PreparedStatement ps = connection.prepareStatement(upit);
            ps.setInt(1, k.getIdKorisnik());
            ps.setString(2, k.getIme());
            ps.setString(3, k.getPrezime());
            ps.setString(4, k.getMail());
            ps.setBoolean(5, k.isMailObavestenja());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {
            System.out.println("GRESKA prilikom izmene podataka korisnika " + ex.getMessage());

        }

    }

    @Override
    public Korisnik pronadjiKorisnika(String email, String ime) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "Select * from korisnik where email = '" + email + "'  or ime = '" + ime + "'";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(upit);

            while (rs.next()) {
                Korisnik k = new Korisnik(rs.getInt("idKorisnik"), rs.getString("ime"), rs.getString("Prezime"), rs.getString("email"), rs.getBoolean("mailObavestenje"));
                return k;
            }

            statement.close();
            rs.close();

        } catch (SQLException ex) {

            System.out.println("Doslo je do greske prilikom pronalaska zaposlenog preko emiala" + ex.getMessage());
            return null;
        }

        return null;
    }

    @Override
    public List<Korisnik> pronadjiKorisnike(String email, String ime) {

        List<Korisnik> korisnici = new ArrayList<>();

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "Select * from korisnik where email = '" + email + "'  or ime = '" + ime + "'";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(upit);

            while (rs.next()) {

                Korisnik k = new Korisnik(rs.getInt("idKorisnik"), rs.getString("ime"), rs.getString("Prezime"), rs.getString("email"), rs.getBoolean("mailObavestenje"));

                korisnici.add(k);

            }

            statement.close();
            rs.close();
            return korisnici;

        } catch (SQLException ex) {

            System.out.println("Doslo je do greske prilikom pronalaska zaposlenog preko emiala" + ex.getMessage());
            return null;
        }

    }

    @Override
    public List<Korisnik> listaAktivnihKorisnika() {

        List<Korisnik> korisnici = new ArrayList<>();
        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "SELECT DISTINCT k. *  from Korisnik k join racun r on k.idKorisnik = r.korisnikId where r.status = "+"'AKTIVAN_NEPLACEN'";
            
            PreparedStatement ps = connection.prepareStatement(upit);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Korisnik k = new Korisnik(rs.getInt("idKorisnik"), rs.getString("ime"), rs.getString("prezime"), rs.getString("email"), rs.getBoolean("mailObavestenje"));
           korisnici.add(k);
            }
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Greska prilikom kreiranja liste korisnika sa aktivnim racunima" + ex.getMessage());
            return null;
        }

             return korisnici;
    }

    @Override
    public Korisnik pronadjiKorisnika(int racunId) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "SELECT * FROM Korisnik Join Racun on Korisnik.idKorisnik = Racun.korisnikId where idRacun = " + racunId;

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(upit);

            Korisnik k1 = new Korisnik(rs.getInt("korisnikId"), rs.getString("ime"), rs.getString("prezime"), rs.getString("email"), rs.getBoolean("mailObavestenje"));

            statement.close();
            rs.close();

            return k1;
        } catch (SQLException ex) {

            System.out.println("Greska pri pronalasku Korisnika putem racunaID " + ex.getMessage());
            return null;
        }

    }

}
