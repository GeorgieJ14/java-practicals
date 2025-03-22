/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_aoop_practicals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

/**
 *
 * @author p0074564
 */
public class TLModelTest {

    public TLModelTest() {
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

    @Test
    public void testChangeOnce() { // red-amber expected
        System.out.println("change 1x");
        TLModel instance = new TLModel();
        instance.change();
        assertTrue(instance.getRed());
        assertTrue(instance.getAmber());
        assertFalse(instance.getGreen());
    }

    @Test
    public void testChangeTwice() { // green expected
        System.out.println("change 2x");
        TLModel instance = new TLModel();
        instance.change();
        instance.change();
        assertFalse(instance.getRed());
        assertFalse(instance.getAmber());
        assertTrue(instance.getGreen());
    }

    @Test
    public void testChangeThrice() { // amber expected
        System.out.println("change 3x");
        TLModel instance = new TLModel();
        instance.change();
        instance.change();
        instance.change();
        assertFalse(instance.getRed());
        assertTrue(instance.getAmber());
        assertFalse(instance.getGreen());
    }

    @Test
    public void testChangeFourTimes() { // red expected
        System.out.println("change 4x");
        TLModel instance = new TLModel();
        instance.change();
        instance.change();
        instance.change();
        instance.change();
        assertTrue(instance.getRed());
        assertFalse(instance.getAmber());
        assertFalse(instance.getGreen());
    }

    /**
     * Test of initialise method, of class TLModel.
     */
    @Test
    public void testInitialise() { // red expected
        System.out.println("initialise");
        TLModel instance = new TLModel();
        instance.initialise();

        assertTrue(instance.getRed());
        assertFalse(instance.getAmber());
        assertFalse(instance.getGreen());
    }
}
