/*
 * Clase no ejecutable donde estan todos los atributos 
 * y funciones de la clase persona.
 *
 * @author Rafael Serrano Luna
 */
package clases;

/**
 *
 * @author Rafael Serrano Luna <serralun.rf@gmail.com>
 */
public class Persona {

    private String nombre;
    private String apel1;
    private String apel2;
    private int numeroDni;
    private String direccion;
    private int telefono;
    private int edad;
    private int estatura;
    private static int numPersonas = 0;

    /**
     *
     * @param nombre
     * @param apel1
     * @param apel2
     * @param dni
     * @param direccion
     */
    public Persona(String nombre, String apel1, String apel2, int dni, String direccion) {
        this.nombre = nombre;
        this.apel1 = apel1;
        this.apel2 = apel2;
        this.numeroDni = dni;
        this.direccion = direccion;
        numPersonas++;
    }

    public Persona(String nombre, String apel1, String apel2, int numeroDni, String direccion, int telefono, int edad, int estatura) {
        this.nombre = nombre;
        this.apel1 = apel1;
        this.apel2 = apel2;
        this.numeroDni = numeroDni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.estatura = estatura;
    }
    
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApel1() {
        return apel1;
    }

    public void setApel1(String apel1) {
        this.apel1 = apel1;
    }

    public String getApel2() {
        return apel2;
    }

    public void setApel2(String apel2) {
        this.apel2 = apel2;
    }

    public int getDni() {
        return numeroDni;
    }

    public void setDni(int dni) {
        this.numeroDni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public static int getNumPersonas() {
        return numPersonas;
    }

    public static void setNumPersonas(int numPersonas) {
        Persona.numPersonas = numPersonas;
    }

    private final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private char calculoLetraDNI() {
        int resto;
        resto = numeroDni % 23;
        return letras[resto];
    }

    private void imprimirDNI() {
        System.out.println("DNI COMPLETO: " + numeroDni + calculoLetraDNI());
    }

    private String crearNIF() {
        return Integer.toString(numeroDni) + "-" + calculoLetraDNI();

    }

    private void conversorMetCent() {
        estatura = estatura*100;
    }
    
    public void mostrarNumPersonas() {
        System.out.println("Esta es la cantidad total de personas: "+ numPersonas);
    }
}
