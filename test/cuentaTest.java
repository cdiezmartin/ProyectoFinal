/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import banco.Cuenta;
import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class cuentaTest {
    
    public cuentaTest() {
    }
    
    /**
     * Test para comprobar metodos constructor y metodos getter y setter
     */
    @Test
    
    public void testCuenta(){
        Cuenta c = new Cuenta (3000.75,LocalDate.now());
        assertTrue(c.getSaldo()==3000.75);
        c.setSaldo(3000.75);
    }
    
    /**
     * Test para comprobar el funcionamiento del metodo
     */
    
    @Test
    
    public void ingresarDinero(){
        Cuenta c = new Cuenta (3000.75,LocalDate.now());
        c.ingresarDinero(40.0);
    }
    
    /**
     * Test para comprobar el funcionamiento del metodo
     */
    
    @Test 
    
    public void retirarDinero(){
        Cuenta c = new Cuenta (3000.75,LocalDate.now());
        assertTrue(c.retirarDinero(50.0));
    }
    
    /**
     * Test para comprobar el funcionamiento del metodo
     */
    
    @Test
    
    public void dineroSuficiente(){
        Cuenta c = new Cuenta (3000.75,LocalDate.now());
        assertTrue(c.tieneSufiente(3000.75));
        assertFalse(c.tieneSufiente(3500));
        
    }
}
