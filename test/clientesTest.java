/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import banco.Clientes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class clientesTest {

    /**
     * Test para comprobar metodos constructor y metodos getter y setter
     */
    
    @Test

    public void testCliente(){
        Clientes c = new Clientes ("Christian","Diez Martin","Rio Odiel","50254459B",633089624,19);
        assertTrue("Christian".equals(c.getNombre()));
        assertTrue("Diez Martin".equals(c.getApellidos()));
        assertTrue("Rio Odiel".equals(c.getDireccion()));
        assertTrue("50254459B".equals(c.getNif()));
        assertTrue(c.getTelefono()==633089624);
        assertTrue(c.getEdad()==19);
        c.setNombre("Christian");
        c.setApellidos("Diez Martin");
        c.setDireccion("Rio Odiel");
        c.setNif("50254459B");
        c.setTelefono(633089624);
        c.setEdad(19);
        
    }
    
    /**
     * Test para comprobar el funcionamiento de la funcion
     */
    
    @Test 
    
    public void testMensualidad(){
        Clientes c = new Clientes ("Christian","Diez Martin","Rio Odiel","50254459B",633089624,19);
        c.saldoMensual(3000);
    }
}
