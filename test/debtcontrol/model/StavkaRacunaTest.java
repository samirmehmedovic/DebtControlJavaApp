/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package debtcontrol.model;

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
public class StavkaRacunaTest {
    
    public StavkaRacunaTest() {
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
     * Test of getStavkaRacunaId method, of class StavkaRacuna.
     */
    @Test
    public void testGetStavkaRacunaId() {
        System.out.println("getStavkaRacunaId");
        StavkaRacuna instance = new StavkaRacuna();
        int expResult = 0;
        int result = instance.getStavkaRacunaId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStavkaRacunaId method, of class StavkaRacuna.
     */
    @Test
    public void testSetStavkaRacunaId() {
        System.out.println("setStavkaRacunaId");
        int StavkaRacunaId = 0;
        StavkaRacuna instance = new StavkaRacuna();
        instance.setStavkaRacunaId(StavkaRacunaId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKolicina method, of class StavkaRacuna.
     */
    @Test
    public void testGetKolicina() {
        System.out.println("getKolicina");
        StavkaRacuna instance = new StavkaRacuna();
        double expResult = 0.0;
        double result = instance.getKolicina();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKolicina method, of class StavkaRacuna.
     */
    @Test
    public void testSetKolicina() {
        System.out.println("setKolicina");
        double kolicina = 0.0;
        StavkaRacuna instance = new StavkaRacuna();
        instance.setKolicina(kolicina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCenaProizvoda method, of class StavkaRacuna.
     */
    @Test
    public void testGetCenaProizvoda() {
        System.out.println("getCenaProizvoda");
        StavkaRacuna instance = new StavkaRacuna();
        double expResult = 0.0;
        double result = instance.getCenaProizvoda();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCenaProizvoda method, of class StavkaRacuna.
     */
    @Test
    public void testSetCenaProizvoda() {
        System.out.println("setCenaProizvoda");
        double cenaProizvoda = 0.0;
        StavkaRacuna instance = new StavkaRacuna();
        instance.setCenaProizvoda(cenaProizvoda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUkupno method, of class StavkaRacuna.
     */
    @Test
    public void testGetUkupno() {
        System.out.println("getUkupno");
        StavkaRacuna instance = new StavkaRacuna();
        double expResult = 0.0;
        double result = instance.getUkupno();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUkupno method, of class StavkaRacuna.
     */
    @Test
    public void testSetUkupno() {
        System.out.println("setUkupno");
        double ukupno = 0.0;
        StavkaRacuna instance = new StavkaRacuna();
        instance.setUkupno(ukupno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRacunId method, of class StavkaRacuna.
     */
    @Test
    public void testGetRacunId() {
        System.out.println("getRacunId");
        StavkaRacuna instance = new StavkaRacuna();
        int expResult = 0;
        int result = instance.getRacunId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRacunId method, of class StavkaRacuna.
     */
    @Test
    public void testSetRacunId() {
        System.out.println("setRacunId");
        int racunId = 0;
        StavkaRacuna instance = new StavkaRacuna();
        instance.setRacunId(racunId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProizvod method, of class StavkaRacuna.
     */
    @Test
    public void testGetProizvod() {
        System.out.println("getProizvod");
        StavkaRacuna instance = new StavkaRacuna();
        Proizvod expResult = null;
        Proizvod result = instance.getProizvod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProizvod method, of class StavkaRacuna.
     */
    @Test
    public void testSetProizvod() {
        System.out.println("setProizvod");
        Proizvod proizvod = null;
        StavkaRacuna instance = new StavkaRacuna();
        instance.setProizvod(proizvod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class StavkaRacuna.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        StavkaRacuna instance = new StavkaRacuna();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class StavkaRacuna.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        StavkaRacuna instance = new StavkaRacuna();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StavkaRacuna.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        StavkaRacuna instance = new StavkaRacuna();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invoice method, of class StavkaRacuna.
     */
    @Test
    public void testInvoice() {
        System.out.println("invoice");
        StavkaRacuna instance = new StavkaRacuna();
        String expResult = "";
        String result = instance.invoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mail method, of class StavkaRacuna.
     */
    @Test
    public void testMail() {
        System.out.println("mail");
        StavkaRacuna instance = new StavkaRacuna();
        String expResult = "";
        String result = instance.mail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
