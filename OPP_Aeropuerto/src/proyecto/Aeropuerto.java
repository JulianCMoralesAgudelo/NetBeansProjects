package proyecto;

public abstract class Aeropuerto {

    //	Atributos
    private String nombre;
    private String ciudad;
    private String pais;
    private Compania listaCompania[] = new Compania[10];
    private int numCompania;

    //	Metodo constructor generico
    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompania = 0;
    }

    //	Metodo constructor con todos los campos
    public Aeropuerto(String nombre, String ciudad, String pais, Compania[] listaCompania) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompania = 0;
        this.listaCompania = listaCompania;
    }

    //	Metodo para insertar compañias
    public void insertarCompania(Compania compania) {
        listaCompania[numCompania] = compania;
        numCompania++;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    // Getters para el objeto compañia
    public Compania[] getListaCompania() {
        return listaCompania;
    }

    public int getNumCompania() {
        return numCompania;
    }

    // Metodo para obtener compañia por su iterador
    public Compania getCompania(int i) {
        return listaCompania[i];
    }

    // Sobrecarga del metodo para obtener compañia por el nombre
    public Compania getCompania(String nom) {
        Compania nombre = null;
        boolean flag = false;
        int i = 0; // inicializo una variable de iteracion 

        while (i < listaCompania.length && !flag) { // comparo la variable con el largo del arreglo y que la bandera sea falsa
            if (nom.equals(listaCompania[i].getNombre())) { // comparo el dato pasado por parametro con la iteracion del arreglo
                flag = true; // cambio la bandera a true
                nombre = listaCompania[i]; // se guarda el pasajero en la posicion del iterador i
            }
            i++;//aunmento en 1 la variable de iteracion en cada vuelta
        }
        return nombre;
    }
}
