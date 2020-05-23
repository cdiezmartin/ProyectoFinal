/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import banco.Clientes;
import banco.Cuenta;
import banco.Tarjetas;
import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class clientesTest {

    @Test

    public void testCliente(){
        Clientes c = new Clientes ("Christian","Diez Martin","Rio Odiel","50254459B",633089624,19);
        assertTrue(c.getNombre()=="Christian");
        assertTrue(c.getApellidos()=="Diez Martin");
        assertTrue(c.getDireccion()=="Rio Odiel");
        assertTrue(c.getNif()=="50254459B");
        assertTrue(c.getTelefono()==633089624);
        assertTrue(c.getEdad()==19);
        
    }
}
