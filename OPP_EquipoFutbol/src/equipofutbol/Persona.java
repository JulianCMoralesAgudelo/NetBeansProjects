package equipofutbol;

/**
 *
 * @author julian
 */
public abstract class Persona {
    
    // Atributos

    protected String nombre;
    protected String apellido;
    protected int edad;

    // Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    // Metodos
    public void viajar() {
        System.out.println("Viajar");
    }

    // Metodos abstractos
    // aquellos que se pueden heredar mas no implementar en esta la clase padre
    public abstract void partidoFutbol();

    public abstract void entrenamiento();

}
