/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package debtcontrol.model;

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
public class ProizvodTest {
    
    public ProizvodTest() {
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
     * Test of getSastojci method, of class Proizvod.
     */
    @Test
    public void testGetSastojci() {
        System.out.println("getSastojci");
        Proizvod instance = new Proizvod();
        List<Sastojak> expResult = null;
        List<Sastojak> result = instance.getSastojci();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSastojci method, of class Proizvod.
     */
    @Test
    public void testSetSastojci() {
        System.out.println("setSastojci");
        List<Sastojak> sastojci = null;
        Proizvod instance = new Proizvod();
        instance.setSastojci(sastojci);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProizvoda method, of class Proizvod.
     */
    @Test
    public void testGetIdProizvoda() {
        System.out.println("getIdProizvoda");
        Proizvod instance = new Proizvod();
        Integer expResult = null;
        Integer result = instance.getIdProizvoda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdProizvoda method, of class Proizvod.
     */
    @Test
    public void testSetIdProizvoda() {
        System.out.println("setIdProizvoda");
        Integer idProizvoda = null;
        Proizvod instance = new Proizvod();
        instance.setIdProizvoda(idProizvoda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNaziv method, of class Proizvod.
     */
    @Test
    public void testGetNaziv() {
        System.out.println("getNaziv");
        Proizvod instance = new Proizvod();
        String expResult = "";
        String result = instance.getNaziv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNaziv method, of class Proizvod.
     */
    @Test
    public void testSetNaziv() {
        System.out.println("setNaziv");
        String naziv = "";
        Proizvod instance = new Proizvod();
        instance.setNaziv(naziv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCena method, of class Proizvod.
     */
    @Test
    public void testGetCena() {
        System.out.println("getCena");
        Proizvod instance = new Proizvod();
        double expResult = 0.0;
        double result = instance.getCena();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCena method, of class Proizvod.
     */
    @Test
    public void testSetCena() {
        System.out.println("setCena");
        double cena = 0.0;
        Proizvod instance = new Proizvod();
        instance.setCena(cena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJedinicaMere method, of class Proizvod.
     */
    @Test
    public void testGetJedinicaMere() {
        System.out.println("getJedinicaMere");
        Proizvod instance = new Proizvod();
        String expResult = "";
        String result = instance.getJedinicaMere();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJedinicaMere method, of class Proizvod.
     */
    @Test
    public void testSetJedinicaMere() {
        System.out.println("setJedinicaMere");
        String jedinicaMere = "";
        Proizvod instance = new Proizvod();
        instance.setJedinicaMere(jedinicaMere);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKolicina method, of class Proizvod.
     */
    @Test
    public void testGetKolicina() {
        System.out.println("getKolicina");
        Proizvod instance = new Proizvod();
        double expResult = 0.0;
        double result = instance.getKolicina();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKolicina method, of class Proizvod.
     */
    @Test
    public void testSetKolicina() {
        System.out.println("setKolicina");
        double kolicina = 0.0;
        Proizvod instance = new Proizvod();
        instance.setKolicina(kolicina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Proizvod.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Proizvod instance = new Proizvod();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Proizvod.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Proizvod instance = new Proizvod();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Proizvod.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Proizvod instance = new Proizvod();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
