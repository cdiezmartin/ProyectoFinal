package banco;

import java.util.ArrayList;

/**
 * 
 * @author chris
 */

public class Gestor {
    
    /**
     * Declaracion de atributos
     */

    private final ArrayList<Cuenta> CUENTAS;


    /**
     * Creación del constructor
     * @param CUENTAS 
     */
    
    public Gestor(ArrayList<Cuenta> CUENTAS) {
        this.CUENTAS = CUENTAS;
    }
    
    /**
     * 
     * @return the CUENTAS
     */

    public ArrayList<Cuenta> getCUENTAS() {
        return CUENTAS;
    }

    /**
     * 
     * @param nuevaCuenta 
     */
    
    public void añadirCuenta(Cuenta nuevaCuenta) {
        this.CUENTAS.add(nuevaCuenta);
    }

    /**
     * 
     * @param numeroCuenta
     * @return 
     */
    
    public boolean eliminarCuenta(int numeroCuenta) {

        boolean eliminada = false;

        this.CUENTAS.remove(numeroCuenta);
        eliminada = true;
        return eliminada;

    }

}
