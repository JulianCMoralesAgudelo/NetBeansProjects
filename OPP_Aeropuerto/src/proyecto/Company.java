package proyecto;

/**
 *
 * @author julia
 */
public class Company {

    private String nombre;
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numVuelo = 0;

    public Company(String nombre) {
        this.nombre = nombre;
    }

    public Company(String nombre, Vuelo vuelos[]) {
        this.nombre = nombre;
        listaVuelos = vuelos;
        numVuelo = vuelos.length;
    }

    public void insertarVuelo(Vuelo vuelo) {
        listaVuelos[numVuelo] = vuelo;
        numVuelo++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public Vuelo getVuelo(int indice) {
        return listaVuelos[indice];
    }

    public Vuelo getVuelo(String id) {
        Vuelo vuelo = null;
        boolean encontrado = false;
        int iterador = 0;
        while (!encontrado && iterador < listaVuelos.length) {
            if (id.equals(listaVuelos[iterador].getIdentificador())) {
                encontrado = true;
                iterador++;
            }            
        }
        return vuelo;
    }
}
