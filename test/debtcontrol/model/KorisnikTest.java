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
public class KorisnikTest {
    
    public KorisnikTest() {
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
     * Test of getIdKorisnik method, of class Korisnik.
     */
    @Test
    public void testGetIdKorisnik() {
        System.out.println("getIdKorisnik");
        Korisnik instance = new Korisnik();
        instance.setIdKorisnik(1);
        int expResult = 1;
        int result = instance.getIdKorisnik();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 //       fail("The test case is a prototype.");
    }

    /**
     * Test of setIdKorisnik method, of class Korisnik.
     */
    @Test
    public void testSetIdKorisnik() {
        System.out.println("setIdKorisnik");
        int idKorisnik = 1;
        Korisnik instance = new Korisnik();
        instance.setIdKorisnik(idKorisnik);
        // TODO review the generated test code and remove the default call to fail.
   //     fail("The test case is a prototype.");
    }

    /**
     * Test of getIme method, of class Korisnik.
     */
    @Test
    public void testGetIme() {
        System.out.println("getIme");
        Korisnik instance = new Korisnik();
        String expResult = "Sima";
        String result = instance.getIme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

    /**
     * Test of setIme method, of class Korisnik.
     */
    @Test
    public void testSetIme() {
        System.out.println("setIme");
        String ime = "Sima";
        Korisnik instance = new Korisnik();
        instance.setIme(ime);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

    /**
     * Test of getPrezime method, of class Korisnik.
     */
    @Test
    public void testGetPrezime() {
        System.out.println("getPrezime");
        Korisnik instance = new Korisnik();
        String expResult = "Simic";
        String result = instance.getPrezime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 //       fail("The test case is a prototype.");
    }

    /**
     * Test of setPrezime method, of class Korisnik.
     */
    @Test
    public void testSetPrezime() {
        System.out.println("setPrezime");
        String prezime = "Simic";
        Korisnik instance = new Korisnik();
        instance.setPrezime(prezime);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }
}

    /**
     * Test of getMail method, of class Korisnik.
     */
//    @Test
//    public void testGetMail() {
//        System.out.println("getMail");
//        Korisnik instance = new Korisnik();
//        String expResult = "";
//        String result = instance.getMail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMail method, of class Korisnik.
//     */
//    @Test
//    public void testSetMail() {
//        System.out.println("setMail");
//        String mail = "";
//        Korisnik instance = new Korisnik();
//        instance.setMail(mail);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
 //   }

    /**
     * Test of isMailObavestenja method, of class Korisnik.
     */
//    @Test
//    public void testIsMailObavestenja() {
//        System.out.println("isMailObavestenja");
//        Korisnik instance = new Korisnik();
//        boolean expResult = false;
//        boolean result = instance.isMailObavestenja();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//  //      fail("The test case is a prototype.");
 //   }

    /**
     * Test of setMailObavestenja method, of class Korisnik.
     */
//    @Test
//    public void testSetMailObavestenja() {
//        System.out.println("setMailObavestenja");
//        boolean mailObavestenja = false;
//        Korisnik instance = new Korisnik();
//        instance.setMailObavestenja(mailObavestenja);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of hashCode method, of class Korisnik.
     */
//    @Test
//    public void testHashCode() {
//        System.out.println("hashCode");
//        Korisnik instance = new Korisnik();
//        int expResult = 0;
//        int result = instance.hashCode();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of equals method, of class Korisnik.
//     */
//    @Test
//    public void testEquals() {
//        System.out.println("equals");
//        Object obj = null;
//        Korisnik instance = new Korisnik();
//        boolean expResult = false;
//        boolean result = instance.equals(obj);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Korisnik.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Korisnik instance = new Korisnik();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
// //   }} 

