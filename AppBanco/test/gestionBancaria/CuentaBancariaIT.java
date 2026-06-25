/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gestionBancaria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jangrynds
 */
public class CuentaBancariaIT {
    
    public CuentaBancariaIT() {
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
     * Test of getTitular method, of class CuentaBancaria.
     */
    @Test
    public void testGetTitular() {
        System.out.println("getTitular");
        CuentaBancaria instance = new CuentaBancaria();
        String expResult = "";
        String result = instance.getTitular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class CuentaBancaria.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        CuentaBancaria instance = new CuentaBancaria();
        Double expResult = null;
        Double result = instance.getSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitular method, of class CuentaBancaria.
     */
    @Test
    public void testSetTitular() {
        System.out.println("setTitular");
        String titular = "";
        CuentaBancaria instance = new CuentaBancaria();
        instance.setTitular(titular);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposito method, of class CuentaBancaria.
     */
    @Test
    public void testDeposito() {
        System.out.println("deposito");
        double monto = 0.0;
        CuentaBancaria instance = new CuentaBancaria();
        double expResult = 0.0;
        double result = instance.deposito(monto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retiro method, of class CuentaBancaria.
     */
    @Test
    public void testRetiro() {
        System.out.println("retiro");
        double monto = 0.0;
        CuentaBancaria instance = new CuentaBancaria();
        double expResult = 0.0;
        double result = instance.retiro(monto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarSaldo method, of class CuentaBancaria.
     */
    @Test
    public void testMostrarSaldo() {
        System.out.println("mostrarSaldo");
        CuentaBancaria instance = new CuentaBancaria();
        instance.mostrarSaldo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
