/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
import banco.Clientes;
import banco.Cuenta;
import banco.Tarjetas;
import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 *//*
public class clientesTest {

    @Test
    
    public void añadirCuenta(){
       Clientes c = new Clientes ("","","","",0,0);
       Cuenta nuevaCuenta = new Cuenta(0,LocalDate.now());
       c.añadirCuenta(nuevaCuenta);
       assertEquals(1,c.getCUENTAS().size());
    }
    
    @Test
    public void eliminarCuenta(){
        Clientes c = new Clientes ("","","","",0,0);
        int indiceCuenta = 0;
        c.añadirCuenta(new Cuenta(0,LocalDate.now()));
        assertTrue(c.eliminarCuenta(indiceCuenta));
        assertFalse(c.eliminarCuenta(0));
    }
    
    @Test
    public void getTarjetas(){
        Clientes c = new Clientes ("","","","",0,0);
        c.añadirTarjeta(new Tarjetas(new Cuenta (0,LocalDate.now())));
        double resultado1=0;
        double resultado= c.getTARJETAS().get(0).getCuentaAsociada().getSaldo();
        assertEquals(resultado1,resultado,0.0);
    }
}*/
