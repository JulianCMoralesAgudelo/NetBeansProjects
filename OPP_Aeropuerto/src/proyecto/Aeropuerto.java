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

    public Aeropuerto(String nombre, String ciudad, String pais, Company[] companys) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompanys = companys;
        this.numCompany = companys.length;
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

    public Company getCompany(int i) {
        return listaCompanys[i];
    }

    public Company getCompany(String nombre) {
        boolean encontrado = false;
        int i = 0;
        Company company = null;
        while ((!encontrado) && (i < listaCompanys.length)) {
            if (nombre.equals(listaCompanys[i].getNombre())) {
                encontrado = true;
                company = listaCompanys[i];
            }
            i++;
        }
        return company;
    }
}
