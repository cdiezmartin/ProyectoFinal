/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author chris
 */
public class Tarjetas {
    
    /**
     * Declaracion de atributos
     */

    static final int RETIRADA = 1000;
    static final int PAGOS_INTERNET = 5000;
    private Cuenta cuentaAsociada;

    /**
     * Creacion del constructor
     */
    
    public Tarjetas() {
        
    }
    
    /**
     * @return the cuentaAsociada
     */
    public Cuenta getCuentaAsociada() {
        return cuentaAsociada;
    }
    
    /**
     * 
     * @param cantidad
     * @return 
     */

    public boolean retirarDineroBanco(double cantidad) {
        boolean operacion = false;
        if (this.cuentaAsociada.tieneSufiente(cantidad) && cantidad <= RETIRADA) {
            operacion = this.cuentaAsociada.retirarDinero(cantidad);
        }
        return operacion;
    }
    
    /**
     * 
     * @param cantidad
     * @return 
     */

    public boolean pagosInternet(double cantidad) {
        boolean operacion = false;
        if (this.cuentaAsociada.tieneSufiente(cantidad) && cantidad <= PAGOS_INTERNET) {
            this.cuentaAsociada.setSaldo(this.cuentaAsociada.getSaldo() - cantidad);
            operacion = true;
        }
        return operacion;
    }
}
