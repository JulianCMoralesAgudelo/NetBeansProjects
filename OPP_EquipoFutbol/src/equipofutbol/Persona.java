package equipofutbol;

/**
 *
 * @author julian
 */
public abstract class Persona {
    
    // Atributos

    protected String nombre;
    protected String apellidos;
    protected int edad;

    // Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    // Metodos
    public void viajar() {
        System.out.println("\tSale de viaje");
    }

    // Metodos abstractos
    // aquellos que se pueden heredar mas no implementar en esta la clase padre
    public abstract void partidoFutbol();

    public abstract void entrenamiento();

}
