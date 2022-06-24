package proyecto;

public class AeropuertoPublico extends Aeropuerto {

    // Atributos
    private double subvencion;

    // Metodos Constructores
    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(String nombre, String ciudad, String pais, Compania[] listaCompania, double subvencion) {
        super(nombre, ciudad, pais, listaCompania);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencion) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    //	Getter
    public double getSubvencion() {
        return subvencion;
    }

}
