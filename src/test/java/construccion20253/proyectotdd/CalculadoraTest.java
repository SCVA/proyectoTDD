/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construccion20253.proyectotdd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Estudiantes
 */
public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @After
    public void tearDown() throws Exception {
    }
    
    public CalculadoraTest() {
    }
    
    @Test
    public void testSuma() {
        Integer esperado = 3;
        Integer resultado = calculadora.suma(1,2);

        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testResta() {
        Integer esperado = 3;
        Integer resultado = calculadora.resta(4,1);
        assertEquals(esperado, resultado);
    }
}
