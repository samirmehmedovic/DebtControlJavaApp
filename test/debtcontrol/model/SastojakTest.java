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
public class SastojakTest {
    
    public SastojakTest() {
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
     * Test of getJedinicaMere method, of class Sastojak.
     */
    @Test
    public void testGetJedinicaMere() {
        System.out.println("getJedinicaMere");
        Sastojak instance = new Sastojak();
        JedinicaMere expResult = null;
        JedinicaMere result = instance.getJedinicaMere();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJedinicaMere method, of class Sastojak.
     */
    @Test
    public void testSetJedinicaMere() {
        System.out.println("setJedinicaMere");
        JedinicaMere jedinicaMere = null;
        Sastojak instance = new Sastojak();
        instance.setJedinicaMere(jedinicaMere);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSastojakId method, of class Sastojak.
     */
    @Test
    public void testGetSastojakId() {
        System.out.println("getSastojakId");
        Sastojak instance = new Sastojak();
        int expResult = 0;
        int result = instance.getSastojakId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSastojakId method, of class Sastojak.
     */
    @Test
    public void testSetSastojakId() {
        System.out.println("setSastojakId");
        int sastojakId = 0;
        Sastojak instance = new Sastojak();
        instance.setSastojakId(sastojakId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProizvod method, of class Sastojak.
     */
    @Test
    public void testGetProizvod() {
        System.out.println("getProizvod");
        Sastojak instance = new Sastojak();
        Proizvod expResult = null;
        Proizvod result = instance.getProizvod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProizvod method, of class Sastojak.
     */
    @Test
    public void testSetProizvod() {
        System.out.println("setProizvod");
        Proizvod proizvod = null;
        Sastojak instance = new Sastojak();
        instance.setProizvod(proizvod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKolicina method, of class Sastojak.
     */
    @Test
    public void testGetKolicina() {
        System.out.println("getKolicina");
        Sastojak instance = new Sastojak();
        double expResult = 0.0;
        double result = instance.getKolicina();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKolicina method, of class Sastojak.
     */
    @Test
    public void testSetKolicina() {
        System.out.println("setKolicina");
        double kolicina = 0.0;
        Sastojak instance = new Sastojak();
        instance.setKolicina(kolicina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Sastojak.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Sastojak instance = new Sastojak();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Sastojak.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Sastojak instance = new Sastojak();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Sastojak.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sastojak instance = new Sastojak();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
