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
    @Test
    
    public void testCuenta(){
        Cuenta c = new Cuenta (3000.75,LocalDate.now());
        assertTrue(c.getSaldo()==3000.75);
        c.setSaldo(3000.75);
    }
}
