/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitrepasoexamen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author El_Ma
 */
public class ArrayWrapperTest {

    private int[] Array;
    private ArrayWrapper instance;
    private int Tamanno=5;

    public ArrayWrapperTest() {

    }

    @BeforeClass
    public static void setUpClass() {
        
    }

    @AfterClass
    public static void tearDownClass() {
        
    }

    @Before
    public void setUp() {
        Array = new int[Tamanno];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = i;
        }
        instance = new ArrayWrapper(Array);
    }

    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testSize() {
        System.out.println("size");
        int expResult = Tamanno;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ArrayWrapper.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "[0,1,2,3,4]";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of setElementAt method, of class ArrayWrapper.
     */
    @Test
    public void testSetElementAt() {
        System.out.println("setElementAt");
        int elemento = 0;
        int indice = 0;
        
        instance.setElementAt(elemento, indice);
    }

    /**
     * Test of getArray method, of class ArrayWrapper.
     */
    @Test
    public void testGetArray() {
        System.out.println("getArray");
        int[] expResult = null;
        int[] result = instance.getArray();
        assertArrayEquals(expResult, result);

    }

}
