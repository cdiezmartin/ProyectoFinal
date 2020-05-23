/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import banco.Tarjetas;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class tarjetasTest {
    
    public tarjetasTest() {
    }
    
    /**
     * Test para comprobar metodos constructor y metodos getter y setter
     */
    
    @Test
    public void testTarjeta(){
        Tarjetas t = new Tarjetas ();
        t.getCuentaAsociada();
    }
    
    /**
     * Test para comprobar el funcionamiento del metodo
     */
    
    @Test 
    
    public void retirarDineroBanco(){
        Tarjetas t = new Tarjetas ();
        assertTrue(t.retirarDineroBanco(50));
        assertFalse(t.retirarDineroBanco(1001));
    }
    
    /**
     * Test para comprobar el funcionamiento del metodo
     */
    
    @Test
    
    
    public void pagosTarjetas(){
        Tarjetas t = new Tarjetas ();
        assertTrue(t.pagosInternet(300));
        assertFalse(t.pagosInternet(5050));
    }
}
