/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gestionBancaria;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Jangrynds
 */
public class CuentaBancariaTest1 {
    CuentaBancaria cuenta;
    
    public CuentaBancariaTest1() {
    }
    
    @Before
public void setUp() {
    // Inicializamos una cuenta con un titular y un saldo inicial de 1000.0
    cuenta = new CuentaBancaria("Juan Pérez", 1000.0);
}

    @Test
    public void testGetTitular() {
        assertEquals("Juan Pérez", cuenta.getTitular());
    }

    @Test
    public void testGetSaldo() {
    }

    @Test
    public void testSetTitular() {
    }

    @Test
    public void testDeposito() {
    }

    @Test
    public void testRetiro() {
    }

    @Test
    public void testMostrarSaldo() {
    }
    
}
