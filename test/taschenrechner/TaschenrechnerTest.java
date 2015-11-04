/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Domi
 */
public class TaschenrechnerTest {
    
    public TaschenrechnerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setZahl1 method, of class Taschenrechner.
     */
    @Test
    public void posTestSetZahl1() {
        System.out.println("setZahl1 auf 5");
        double zahl = 5.0;
        Taschenrechner instance = new Taschenrechner();
        instance.setZahl1(zahl);
        //boolean expResult = false;
        //boolean result = instance.getZahl1()==zahl;
        assertEquals(zahl, instance.getZahl1(), 0.0);
        
    }

    /**
     * Test of setZahl2 method, of class Taschenrechner.
     */
    @Test
    public void posTestSetZahl2() {
       System.out.println("setZahl2 auf 5");
        double zahl = 5.0;
        Taschenrechner instance = new Taschenrechner();
        boolean expResult = true;
        boolean result = instance.setZahl2(zahl);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setErgebnis method, of class Taschenrechner.
     */
    @Test
    public void testSetErgebnis() {
        System.out.println("setErgebnis auf 5");
        double zahl = 5.0;
        Taschenrechner instance = new Taschenrechner();
        boolean expResult = true;
        boolean result = instance.setErgebnis(zahl);
        //assertEquals(expResult, result);
        assertEquals(zahl, instance.getErgebnis(), 0.0);
        
    }

    /**
     * Test of setBerechnung method, of class Taschenrechner.
     */
    @Test (expected = IllegalArgumentException.class)
    public void negTestSetBerechnung() {
        System.out.println("setBerechnung null");
        Berechnung berechnungsArt = null;
        Taschenrechner instance = new Taschenrechner();
        instance.setBerechnung(berechnungsArt);
        
        
    }
    
    /**
     * Test of setBerechnung method, of class Taschenrechner.
     */
    @Test 
    public void posTestSetBerechnungAdd() {
        System.out.println("setBerechnung auf add");
        Berechnung berechnungsArt = new Addition();
        Taschenrechner instance = new Taschenrechner();
        boolean result = instance.setBerechnung(berechnungsArt);
        boolean expResult = true;
        assertEquals(expResult, result);
        
        
    }
    

    /**
     * Test of getZahl1 method, of class Taschenrechner.
     */
    @Test
    public void testGetZahl1() {
        System.out.println("getZahl1 5");
        Taschenrechner instance = new Taschenrechner();
        double expResult = 5.0;
        instance.setZahl1(expResult);
        double result = instance.getZahl1();
        assertEquals(expResult, result, 0.0);
    
    }

    /**
     * Test of getZahl2 method, of class Taschenrechner.
     */
    @Test
    public void testGetZahl2() {
        System.out.println("getZahl2 5");
        Taschenrechner instance = new Taschenrechner();
        double expResult = 5.0;
        instance.setZahl2(expResult);
        double result = instance.getZahl2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getErgebnis method, of class Taschenrechner.
     */
    @Test
    public void testGetErgebnis() {
        System.out.println("getErgebnis");
        Taschenrechner instance = new Taschenrechner();
        double expResult = 5.0;
        instance.setErgebnis(expResult);
        double result = instance.getErgebnis();
        assertEquals(expResult, result, 0.0);
    
    }

    /**
     * Test of berechnen method, of class Taschenrechner.
     */
    @Test
    public void testBerechnen() {
        System.out.println("berechnen");
        Taschenrechner instance = new Taschenrechner();
        instance.setZahl1(5);
        instance.setZahl2(2);
        Berechnung add = new Addition();
        instance.setBerechnung(add);
        instance.berechnen();
        assertEquals(7, instance.getErgebnis(), 0);
    }
    
}
