package proyecto;

public class Vuelo {

    //	Atributos
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int munMaxPasajeros;
    private int munActualPasajeros;
    private Pasajero listaPasajero[];

    //	Metodos constructor
    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio,
            int munMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.munMaxPasajeros = munMaxPasajeros;
        this.munActualPasajeros = 0;
        this.listaPasajero = new Pasajero[munMaxPasajeros];
    }

    //	Metodos para insertar pasajero
    public void insertarPasajero(Pasajero pasajero) {
        listaPasajero[munActualPasajeros] = pasajero; // UTILIZAMOS VARIABLE AUXILIAR COMO ITERADOR PARA CREAN UN NUEVO OBJETO EN EL ARREGLO
        munActualPasajeros++; // AUMENTAMOS EL VALOR DE LA VARIABLE AUX A MEDIDA QUE SE GUARDAN MAS OBJETOS
    }

    //	Getters and Setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMunMaxPasajeros() {
        return munMaxPasajeros;
    }

    public void setMunMaxPasajeros(int munMaxPasajeros) {
        this.munMaxPasajeros = munMaxPasajeros;
    }

    public int getMunActualPasajeros() {
        return munActualPasajeros;
    }

    public void setMunActualPasajeros(int munActualPasajeros) {
        this.munActualPasajeros = munActualPasajeros;
    }

    // 	Metodo para obtener pasajero por su indice en la lista
    public Pasajero getPasajero(int i) {
        return listaPasajero[i];
    }

    //	Sobrecarga para obtener pasajero por su pasaporte
    public Pasajero getPasajero(String pasaporte) {
        Pasajero pasajero = null;
        boolean flag = false;
        int i = 0; // inicializo una variable de iteracion 

        while (i < listaPasajero.length && !flag) { // comparo la variable con el largo del arreglo y que la bandera sea falsa
            if (pasaporte.equals(listaPasajero[i].getPasaporte())) { // comparo el dato pasado por parametro con la iteracion del arreglo
                flag = true; // cambio la bandera a true
                pasajero = listaPasajero[i]; // se guarda el pasajero en la posicion del iterador i
            }
            i++;//aunmento en 1 la variable de iteracion en cada vuelta
        }
        return pasajero;
    }

}
