package proyecto;

/**
 *
 * @author julian
 */
public class Aeropuerto {

    // Atributos
    private String nombre;
    private String ciudad;
    private String pais;
    private Company listaCompanys[] = new Company[10];
    private int numCompany;

    // Constructor
    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompany = 0;
    }

    public Aeropuerto(String nombre, String ciudad, String pais, Company empresas[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompanys = empresas;
        this.numCompany = empresas.length;
    }

    public void insertarCompanys(Company company) {
        listaCompanys[numCompany] = company;
        numCompany++;
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

    public Company[] getListaCompanys() {
        return listaCompanys;
    }

    public int getNumCompany() {
        return numCompany;
    }

    public Company getCompany(int indice) {
        return listaCompanys[indice];
    }

    public Company getCompany(String nombre) {
        boolean encontrado = false;
        int iterador = 0;
        Company empresa = null;
        while (!encontrado && iterador < listaCompanys.length) {
            if (nombre.equals(listaCompanys[iterador].getNombre())) {
                encontrado = true;
                empresa = listaCompanys[iterador];
            }
            iterador++;
        }
        return empresa;
    }
}
