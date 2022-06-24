package proyecto;

/**
 *
 * @author julian
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

    public Vuelo getVuelo(int i) {
        return listaVuelos[i];
    }

    public Vuelo getVuelo(String id) {
        boolean encontrado = false;
        int i = 0;
	Vuelo vuelo = null;
        while (!encontrado && i < listaVuelos.length) {
            if (id.equals(listaVuelos[i].getIdentificador())) {
                encontrado = true;
                vuelo = listaVuelos[i];
            }    
            i++;
        }
        return vuelo;
    }
}
