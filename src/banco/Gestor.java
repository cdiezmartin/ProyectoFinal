package banco;

import java.util.ArrayList;

public class Gestor {

    private ArrayList<Cuenta> CUENTAS;

    /**
     * @return the CUENTAS
     */
    public ArrayList<Cuenta> getCUENTAS() {
        return CUENTAS;
    }

    public void añadirCuenta(Cuenta nuevaCuenta) {
        this.CUENTAS.add(nuevaCuenta);
    }

    public boolean eliminarCuenta(int numeroCuenta) {

        boolean eliminada = false;

        this.CUENTAS.remove(numeroCuenta);
        eliminada = true;
        return eliminada;

    }

}
