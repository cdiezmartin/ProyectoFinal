package banco;

import java.time.LocalDate;

public class Cuenta {

    static final int LIMITE_A_RETIRAR = 1000;
    private double saldo;
    private LocalDate fecha_apertura;

    public Cuenta(double saldo, LocalDate fecha_apertura) {
        this.saldo = saldo;
        this.fecha_apertura = fecha_apertura;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(double cantidad) {
        this.saldo += cantidad;
    }

    public boolean retirarDinero(double cantidad) {
        boolean operacion = false;
        if (cantidad <= LIMITE_A_RETIRAR && this.tieneSufiente(cantidad)) {
            this.saldo -= cantidad;
            operacion = true;
        }
        return operacion;
    }

    public boolean tieneSufiente(double cantidad) {
        boolean operacion = true;
        if (cantidad > this.saldo) {
            operacion = false;
        }
        return operacion;
    }

}
