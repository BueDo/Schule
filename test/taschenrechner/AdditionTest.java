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
public class AdditionTest {
    
    public AdditionTest() {
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
     * Test of berechnen method, of class Addition.
     */
    @Test
    public void posTestPosZahlenBerechnen() {
        System.out.println("berechnen positiv");
        double a = 4.5;
        double b = 10.3;
        Addition instance = new Addition();
        double expResult = 14.8;
        double result = instance.berechnen(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void posTestNegZahlenBerechnen(){
        System.out.println("berechnen negative Zahlen");
        double a = -4.5;
        double b = 10.3;
        Addition instance = new Addition();
        double expResult = 5.8;
        double result = instance.berechnen(a, b);
        assertEquals(expResult, result, 2.0);
    }
    
    
}
