package proyecto;

public class Compania {

    //	Atributos
    private String nombre;
    private int numVuelo = 0;
    private Vuelo listaVuelo[] = new Vuelo[10];

    //	Metodos contructores
    public Compania(String nombre) {
        this.nombre = nombre;
    }

    public Compania(String nombre, Vuelo vuelo[]) {
        this.nombre = nombre;
        listaVuelo = vuelo;
        numVuelo = vuelo.length;
    }

    //	Getters
    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public Vuelo[] getListaVuelo() {
        return listaVuelo;
    }

    //	Metodo para instertar vuelo
    public void insertarVuelo(Vuelo vuelo) {
        listaVuelo[numVuelo] = vuelo;
        numVuelo++;
    }

    // 	Metodo para obtener vuelo pos su indice en la lista 
    public Vuelo getVuelo(int i) {
        return listaVuelo[i];
    }

    //	Sobrecarga de metodo para obtener vuelo por indice en la lista
    public Vuelo getvuelo(String id) {
        Vuelo vuelo = null;
        boolean flag = false;
        int i = 0; // inicializo una variable de iteracion 

        while (i < listaVuelo.length && !flag) { // comparo la variable con el largo del arreglo y que la bandera sea falsa
            if (id.equals(listaVuelo[i].getIdentificador())) { // comparo el dato pasado por parametro con la iteracion del arreglo
                flag = true; // cambio la bandera a true
                vuelo = listaVuelo[i]; // se guarda el pasajero en la posicion del iterador i
            }
            i++;//aunmento en 1 la variable de iteracion en cada vuelta
        }
        return vuelo;
    }
}
