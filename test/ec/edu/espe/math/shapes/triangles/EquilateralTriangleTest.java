/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.shapes.triangles;

import ec.edu.espe.math.geometry.shapes.triangles.EquilateralTriangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan
 */
public class EquilateralTriangleTest {
    
    public EquilateralTriangleTest() {
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
     * Test of CalculatePerimeter method, of class EquilateralTriangle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("CalculatePerimeter");
        EquilateralTriangle instance = new EquilateralTriangle((float)3,(float)6);
        Float expResult = 9f;
        Float result = instance.CalculatePerimeter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
