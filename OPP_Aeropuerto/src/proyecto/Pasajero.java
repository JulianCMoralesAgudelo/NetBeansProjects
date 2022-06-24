package proyecto;

public class Pasajero {

    //	Atributos
    private String nombre;
    private String pasaporte;
    private String nacionalidad;

    // 	Metodos constructor
    public Pasajero(String nombre, String pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

    //	Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //	Metodo tooStrig para mostrar los datos del pasajero
    @Override
    public String toString() {
        return "Pasajero [nombre= " + nombre + ", pasaporte= " + pasaporte + ", nacionalidad= " + nacionalidad + "]";
    }

}
