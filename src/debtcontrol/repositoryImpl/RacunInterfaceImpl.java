/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.repositoryImpl;

import debtcontrol.connection.KonekcijaNaBazu;
import debtcontrol.model.Korisnik;
import debtcontrol.model.Proizvod;
import debtcontrol.model.Racun;
import debtcontrol.model.Status;
import debtcontrol.model.StavkaRacuna;
import debtcontrol.repository.KorisnikInterface;
import debtcontrol.repository.RacunInterface;
import debtcontrol.repository.StavkeRacunaInterface;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 *
 * @author podrska
 */
public class RacunInterfaceImpl implements RacunInterface {

    StavkeRacunaInterface stavke;
    KorisnikInterface korisnikInterface;

    public RacunInterfaceImpl() {
        stavke = new StavkaRacunaInterfaceImpl();
        korisnikInterface = new KorisnikInterfaceImpl();
        
    }

    @Override
    public List<Racun> listaRacuna() {

        List<Racun> racuni = new ArrayList<>();

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

     //       String upit = "SELECT * from Racun ";
              String upit2 = "SELECT * FROM Racun Join Korisnik on Korisnik.idKorisnik = Racun.korisnikId  ";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(upit2);

            while (rs.next()) {
                List<StavkaRacuna> listaStavki = stavke.stavkePoRacunu(rs.getInt("idRacun"));
                
                Korisnik k = new Korisnik(rs.getInt("korisnikId"), rs.getString("ime"), rs.getString("prezime"), rs.getString("email"), rs.getBoolean("mailObavestenje"));
       //         Korisnik ko = korisnikInterface.pronadjiKorisnika(rs.getInt("idRacun"));
                System.out.println("Korisnik je: "+k);
               
                Racun r = new Racun(rs.getInt("idRacun"), rs.getDate("datum").toLocalDate(), listaStavki, rs.getDouble("ukupanIznos"), k, Status.valueOf(rs.getString("status")));
                racuni.add(r);

            }

            statement.close();
            rs.close();
            return racuni;

        } catch (SQLException ex) {
            System.out.println("Greska prilikom izrade liste Racuna " + ex.getMessage());
            return null;
        }

    }

    @Override
    public void dodajRacun(Racun racun) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "Insert into racun ( datum,korisnikId,stavkaRacuna,ukupanIznos , status) values (?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(upit, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setDate(1, Date.valueOf(racun.getDatum()));
            preparedStatement.setInt(2, racun.getKorisnik().getIdKorisnik());
            //      preparedStatement.setString(3, racun.getStavke().toString());
            preparedStatement.setObject(3, racun.getStavke().toString());
            preparedStatement.setDouble(4, racun.getUkupno());
            preparedStatement.setObject(5, racun.getStatus().toString());

            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            while (rs.next()) {
                racun.setIdRacuna(rs.getInt(1));

            }

            preparedStatement.close();
            rs.close();

        } catch (SQLException ex) {
            System.out.println("Neuspesno dodat racun" + ex.getMessage());
        }

    }

    public int dodajRacunIvratiId(Racun racun) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "Insert into racun ( datum,korisnikId,ukupanIznos , status) values (?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(upit, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setDate(1, Date.valueOf(racun.getDatum()));
            preparedStatement.setInt(2, racun.getKorisnik().getIdKorisnik());
            preparedStatement.setDouble(3, racun.getUkupno());
            preparedStatement.setObject(4, racun.getStatus().toString());

            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            while (rs.next()) {
                racun.setIdRacuna(rs.getInt(1));
                return racun.getIdRacuna();
            }

            preparedStatement.close();
            rs.close();

        } catch (SQLException ex) {
            System.out.println("Neuspesno dodat racun" + ex.getMessage());
            return 0;
        }
        return 0;
    }

    @Override
    public void izbrisiRacun(Racun racun) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

            Statement statement = connection.createStatement();
            String upit = "DELETE  from racun where idRacun = " + racun.getIdRacuna();

            statement.executeUpdate(upit);
            statement.close();

        } catch (SQLException ex) {

            System.out.println("Greska prilikom brisanja racuna" + ex.getMessage());
        }

    }

    @Override
    public void izmeniRacun(Racun racun) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

            String upit = "UPDATE Racun SET idRacun=?,datum = ?, korisnikId = ?, stavkaracuna = ?, ukupanIznos = ?, status = ? where idRacun = " + racun.getIdRacuna();

            PreparedStatement ps = connection.prepareStatement(upit);

            ps.setInt(1, racun.getIdRacuna());
            ps.setDate(2, Date.valueOf(racun.getDatum()));
            ps.setInt(3, racun.getKorisnik().getIdKorisnik());
            ps.setString(4, racun.getStavke().toString());
            ps.setDouble(5, racun.getUkupno());
            ps.setString(6, racun.getStatus().toString());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Greska prilikom izmene racuna " + racun.getIdRacuna() + " " + ex.getMessage());
        }

    }

    @Override
    public Racun pronadjiRacun(String imeKorisnika, int racunId, String emailKorinika) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Racun> listaRacunaPlaceni(Korisnik k) {

        List<Racun> aktivni = new ArrayList<>();
        List<StavkaRacuna> stav = new ArrayList<>();

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

            String upit2 = "SELECT * from Racun where korisnikId = " + k.getIdKorisnik() + " and status =" + "'NEAKTIVAN_PLACEN'";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(upit2);

            while (rs.next()) {

                List<StavkaRacuna> listaStavki = stavke.stavkePoRacunu(rs.getInt("idRacun"));

                Racun r = new Racun(rs.getInt("idRacun"), rs.getDate("datum").toLocalDate(), listaStavki, rs.getDouble("ukupanIznos"), k, Status.valueOf(rs.getString("status")));
                aktivni.add(r);
            }

            statement.close();
            rs.close();
            return aktivni;

        } catch (SQLException ex) {
            System.out.println("Neuspesno izdvajanje racuna" + ex.getMessage());
            return null;
        }

    }

    @Override
    public List<Racun> listaRacuna(Korisnik k, Status s) {
        List<Racun> listaRacuna = new ArrayList<>();

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "SELECT * from Racun where korisnikId = " + k.getIdKorisnik() + " and status =? " ;

            PreparedStatement ps = connection.prepareStatement(upit);
            
            ps.setString(1, s.name());
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                LocalDate ld1 = rs.getDate("datum").toLocalDate();

                List<StavkaRacuna> listaStavki = stavke.stavkePoRacunu(rs.getInt("idRacun"));

                Racun r = new Racun(rs.getInt("idRacun"), ld1, listaStavki, rs.getDouble("ukupanIznos"), k, Status.valueOf(rs.getString("status")));
                listaRacuna.add(r);
            }
            ps.close();
            rs.close();
            return listaRacuna;

        } catch (SQLException ex) {

            System.out.println("Greska prilikom izvestaja racuna za Korisnika " + ex.getMessage());
            return null;
        }

    }

    @Override
    public Racun vratiRacunStatusa(Status s) {

        return null;
    }

    @Override
    public void platiRacun(int racunId) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

            String upit = "UPDATE RACUN SET status = " + "'NEAKTIVAN_PLACEN' where idRacun= " + racunId;

            Statement statement = connection.createStatement();
            statement.executeUpdate(upit);

            statement.close();

        } catch (SQLException ex) {

            System.out.println("Greska prilikom placanja racuna " + ex.getMessage());
        }

    }

    @Override
    public List<Racun> listaRacuna(Korisnik k) {
        List<Racun> listaRacuna = new ArrayList<>();

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "SELECT * from Racun where korisnikId = " + k.getIdKorisnik();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(upit);

            while (rs.next()) {

                LocalDate ld1 = rs.getDate("datum").toLocalDate();

                List<StavkaRacuna> listaStavki = stavke.stavkePoRacunu(rs.getInt("idRacun"));

                Racun r = new Racun(rs.getInt("idRacun"), ld1, listaStavki, rs.getDouble("ukupanIznos"), k, Status.valueOf(rs.getString("status")));
                listaRacuna.add(r);
            }
            statement.close();
            rs.close();
            return listaRacuna;

        } catch (SQLException ex) {

            System.out.println("Greska prilikom izvestaja racuna za Korisnika " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<Racun> listaRacunaSvihStatusa(Korisnik k, Status s) {

        List<Racun> listaRacuna = new ArrayList<>();
        //     stavke =new StavkaRacunaInterfaceImpl();

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            String upit = "SELECT * from Racun where korisnikId = " + k.getIdKorisnik() + " and status =" + "'STORNIRAN_GRESKA'";
            //         String upit = "SELECT * from Racun where korisnikId = " + k.getIdKorisnik() + " and status =" + "'AKTIVAN_NEPLACEN'";
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(upit);

            while (rs.next()) {

                LocalDate ld1 = rs.getDate("datum").toLocalDate();

                List<StavkaRacuna> listaStavki = stavke.stavkePoRacunu(rs.getInt("idRacun"));

                Racun r = new Racun(rs.getInt("idRacun"), ld1, listaStavki, rs.getDouble("ukupanIznos"), k, s);

                //     stavka.stavkePoRacunu(rs.getInt("idRacun"))
                System.out.println("Stavki ima na racunu: " + rs.getInt("idRacun"));
                listaRacuna.add(r);
            }
            statement.close();
            rs.close();
            return listaRacuna;

        } catch (SQLException ex) {

            System.out.println("Greska prilikom izvestaja racuna za Korisnika " + ex.getMessage());
            return null;
        }

    }

    @Override
    public void stornirajRacun(Racun r) {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

            String upit = "UPDATE RACUN SET status = " + "'STORNIRAN_GRESKA' where idRacun = " + r.getIdRacuna();

            Statement statement = connection.createStatement();

            statement.executeUpdate(upit);

            statement.close();

        } catch (SQLException ex) {

            System.out.println("Greska prilikom izmene statusa racuna " + ex.getMessage());
        }

    }

    @Override
    public void izbrsiPrazneRacune() {

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
            
            String upit = "DELETE FROM Racun where ukupanIznos ="+0;
            
            Statement statement = connection.createStatement();
            statement.executeUpdate(upit);
            
            statement.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Greska prilikom brisanja praznih racuna "+ex.getMessage());
        }

    }

    @Override
    public List<Racun> listaRacunaStatusa() {
            
         List<Racun> racuni = new ArrayList<>();

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

               
              String upit2 = "SELECT * FROM Racun Join Korisnik on Korisnik.idKorisnik = Racun.korisnikId  where status ="+"'AKTIVAN_NEPLACEN'" ;

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(upit2);

            while (rs.next()) {
                List<StavkaRacuna> listaStavki = stavke.stavkePoRacunu(rs.getInt("idRacun"));
                
                Korisnik k = new Korisnik(rs.getInt("korisnikId"), rs.getString("ime"), rs.getString("prezime"), rs.getString("email"), rs.getBoolean("mailObavestenje"));
       //         Korisnik ko = korisnikInterface.pronadjiKorisnika(rs.getInt("idRacun"));
                System.out.println("Korisnik je: "+k);
               
                Racun r = new Racun(rs.getInt("idRacun"), rs.getDate("datum").toLocalDate(), listaStavki, rs.getDouble("ukupanIznos"), k, Status.valueOf(rs.getString("status")));
                racuni.add(r);

            }

            statement.close();
            rs.close();
            return racuni;

        } catch (SQLException ex) {
            System.out.println("Greska prilikom izrade liste Racuna " + ex.getMessage());
            return null;
        }

    }

     public List<Racun> listaRacunaStatusa(Status s) {      
            
         List<Racun> racuni = new ArrayList<>();

        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();

               
              String upit2 = "SELECT * FROM Racun Join Korisnik on Korisnik.idKorisnik = Racun.korisnikId  where status =?" ;

           PreparedStatement ps = connection.prepareStatement(upit2);
          
            
            ps.setString(1, s.name());
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                List<StavkaRacuna> listaStavki = stavke.stavkePoRacunu(rs.getInt("idRacun"));
                
                
                Korisnik k = new Korisnik(rs.getInt("korisnikId"), rs.getString("ime"), rs.getString("prezime"), rs.getString("email"), rs.getBoolean("mailObavestenje"));
       //         Korisnik ko = korisnikInterface.pronadjiKorisnika(rs.getInt("idRacun"));
                System.out.println("Korisnik je: "+k);
               
                Racun r = new Racun(rs.getInt("idRacun"), rs.getDate("datum").toLocalDate(), listaStavki, rs.getDouble("ukupanIznos"), k, Status.valueOf(rs.getString("status")));
                racuni.add(r);

            }
            System.out.println("Status je: "+s.name());
           ps.close();
            rs.close();
            return racuni;

        } catch (SQLException ex) {
            System.out.println("Greska prilikom izrade liste Racuna " + ex.getMessage());
            System.out.println("Status je: "+s.name());
            return null;
        }

    }

    @Override
    public double ukupanIznozSvihRacuna() {
        
        try {
            Connection connection = KonekcijaNaBazu.getInstance().getConnection();
        
            String upit = "SELECT racun";
            
            
        
        } catch (SQLException ex) {


        }
        return 0;

    }

   

}
