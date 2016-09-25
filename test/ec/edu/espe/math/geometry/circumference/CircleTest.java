/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.circumference;

import ec.edu.espe.math.shapes.circumference.Circle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Labs-DECC
 */
public class CircleTest {
    
    public CircleTest() {
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
     * Test of CalculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("CalculateArea");
        Circle instance = null;
        float expResult = 0.0F;
        float result = instance.CalculateArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculatePerimeter method, of class Circle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("CalculatePerimeter");
        Circle instance = new Circle(5f);
        float expResult = (float)(2*Math.PI*5f);
        float result = instance.CalculatePerimeter();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    @Test
    public void testNotCalculatePerimeter() {
        System.out.println("CalculatePerimeter");
        Circle instance = new Circle(5f);
        float expResult = (float)(2*Math.PI*15f);
        float result = instance.CalculatePerimeter();
        assertNotEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
