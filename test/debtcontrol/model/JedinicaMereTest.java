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
public class JedinicaMereTest {
   
    
    public JedinicaMereTest() {
    }
    
 @BeforeAll
    public static void setUpClass() {
        // Ovo se izvodi jednom pre svih testova
        System.out.println("Pokretanje test klase: JedinicaMereTest");
    }
    
    @AfterAll
    public static void tearDownClass() {
        // Ovo se izvodi jednom nakon svih testova
        System.out.println("Završavanje test klase: JedinicaMereTest");
    }
    
    @BeforeEach
    public void setUp() {
        // Ovo se izvodi pre svakog testa
      
        System.out.println("Postavljanje pre svakog testa");
    }
    
    @AfterEach
    public void tearDown() {
        // Ovo se izvodi nakon svakog testa
        System.out.println("Čišćenje nakon svakog testa");
    }

    /**
     * Test of values method, of class JedinicaMere.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        JedinicaMere[] expResult = {JedinicaMere.KOMAD, JedinicaMere.GRAM, JedinicaMere.LITAR};
        JedinicaMere[] result = JedinicaMere.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   //    fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class JedinicaMere.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "KOMAD";
        JedinicaMere expResult = JedinicaMere.KOMAD;
        JedinicaMere result = JedinicaMere.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   //     fail("The test case is a prototype.");
    }
    
}
