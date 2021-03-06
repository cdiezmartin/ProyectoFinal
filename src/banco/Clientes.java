package banco;

/**
 * 
 * @author chris
 */

public class Clientes {
    
    /**
     * Declaracion de atributos
     */

    private Cuenta mensualidad;

    private String nombre;
    private String apellidos;
    private String direccion;
    private String nif;
    private int telefono;
    private int edad;

    /**
     * Creación del constructor
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param nif
     * @param telefono
     * @param edad 
     */
    
    public Clientes(String nombre, String apellidos, String direccion, String nif, int telefono, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nif = nif;
        this.telefono = telefono;
        this.edad = edad;

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the nif
     */
    public String getNif() {
        return nif;
    }

    /**
     * @param nif the nif to set
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Metodo para ver el saldo mensual
     * @param cantidad 
     */

    public void saldoMensual(double cantidad) {
        double resultado = this.mensualidad.getSaldo() / 12;
    }

}
