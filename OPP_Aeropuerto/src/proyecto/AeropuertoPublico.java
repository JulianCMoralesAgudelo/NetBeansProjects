package proyecto;

/**
 *
 * @author julian
 */

public class AeropuertoPublico extends Aeropuerto{
    // Atributos
    private double subvencion;
    
    // Constructor

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais, Company[] empresas) {
        super(nombre, ciudad, pais, empresas);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }
    
    // Getters
    
    public double getSubvencion() {
        return subvencion;
    }
    
}
