/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j
 */
public class carTest {
    
    public carTest() {
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
     * Test of getlicenseplate method, of class car.
     */
    @org.junit.Test
    public void testGetlicenseplate() {
        System.out.println("getlicenseplate");
        car instance = null;
        String expResult = "";
        String result = instance.getlicenseplate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmodel method, of class car.
     */
    @org.junit.Test
    public void testGetmodel() {
        System.out.println("getmodel");
        car instance = null;
        String expResult = "";
        String result = instance.getmodel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isrented method, of class car.
     */
    @org.junit.Test
    public void testIsrented() {
        System.out.println("isrented");
        car instance = null;
        boolean expResult = false;
        boolean result = instance.isrented();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rentcar method, of class car.
     */
    @org.junit.Test
    public void testRentcar() {
        System.out.println("rentcar");
        car instance = null;
        instance.rentcar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
