package proyecto;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 *
 * @author julian
 */
public class Vuelo {

    // Atributos
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajeros[];

    // Contructor
    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[numMaxPasajeros];
    }
    
    public void insertarPasajero(Pasajero pasajero) {
        listaPasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }
    
    public String getIdentificador() {
        return identificador;
    }
    
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
    
    public String getCiudadDestino() {
        return ciudadDestino;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }
    
    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }
    
    public Pasajero getPasajero(int posicion) {
        return listaPasajeros[posicion];
    }
    
    public Pasajero getPasajero(String pasaporte) {
        boolean encontrado = false;
        int indice = 0;
        Pasajero pasajero = null;
        while (!encontrado && indice < listaPasajeros.length) {
            if (pasaporte.equals(listaPasajeros[indice].getPasaporte())) {
                encontrado = true;
                pasajero = listaPasajeros[indice];
            }
            indice++;
        }
        return pasajero;
    }
}
