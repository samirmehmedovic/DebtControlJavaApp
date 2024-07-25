/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package debtcontrol.model;

import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author podrska
 */
public class RacunTest {
    
    public RacunTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getUkupno method, of class Racun.
     */
    @Test
    public void testGetUkupno() {
        System.out.println("getUkupno");
        Racun instance = new Racun();
        double expResult = 0.0;
        double result = instance.getUkupno();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUkupno method, of class Racun.
     */
    @Test
    public void testSetUkupno() {
        System.out.println("setUkupno");
        double ukupno = 0.0;
        Racun instance = new Racun();
        instance.setUkupno(ukupno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdRacuna method, of class Racun.
     */
    @Test
    public void testGetIdRacuna() {
        System.out.println("getIdRacuna");
        Racun instance = new Racun();
        int expResult = 0;
        int result = instance.getIdRacuna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdRacuna method, of class Racun.
     */
    @Test
    public void testSetIdRacuna() {
        System.out.println("setIdRacuna");
        int idRacuna = 0;
        Racun instance = new Racun();
        instance.setIdRacuna(idRacuna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatum method, of class Racun.
     */
    @Test
    public void testGetDatum() {
        System.out.println("getDatum");
        Racun instance = new Racun();
        LocalDate expResult = null;
        LocalDate result = instance.getDatum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatum method, of class Racun.
     */
    @Test
    public void testSetDatum() {
        System.out.println("setDatum");
        LocalDate datum = null;
        Racun instance = new Racun();
        instance.setDatum(datum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStavke method, of class Racun.
     */
    @Test
    public void testGetStavke() {
        System.out.println("getStavke");
        Racun instance = new Racun();
        List<StavkaRacuna> expResult = null;
        List<StavkaRacuna> result = instance.getStavke();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStavke method, of class Racun.
     */
    @Test
    public void testSetStavke() {
        System.out.println("setStavke");
        List<StavkaRacuna> stavke = null;
        Racun instance = new Racun();
        instance.setStavke(stavke);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKorisnik method, of class Racun.
     */
    @Test
    public void testGetKorisnik() {
        System.out.println("getKorisnik");
        Racun instance = new Racun();
        Korisnik expResult = null;
        Korisnik result = instance.getKorisnik();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKorisnik method, of class Racun.
     */
    @Test
    public void testSetKorisnik() {
        System.out.println("setKorisnik");
        Korisnik korisnik = null;
        Racun instance = new Racun();
        instance.setKorisnik(korisnik);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Racun.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Racun instance = new Racun();
        Status expResult = null;
        Status result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Racun.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        Status status = null;
        Racun instance = new Racun();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Racun.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Racun instance = new Racun();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Racun.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Racun instance = new Racun();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Racun.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Racun instance = new Racun();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
