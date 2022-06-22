package proyecto;

/**
 *
 * @author julian
 */
public class Aeropuertoprivado extends Aeropuerto {
    // Atributos

    private String listaEmpresas[] = new String[10];
    private int numeEmpresa;

    public Aeropuertoprivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public Aeropuertoprivado(String nombre, String ciudad, String pais, Company[] companies, String empresas[]) {
        super(nombre, ciudad, pais, companies);
        this.listaEmpresas = empresas;
        numeEmpresa = empresas.length;
    }

    public void insertarEmpresas(String pymes[]) {
        this.listaEmpresas = pymes;
        this.numeEmpresa = pymes.length;
    }

    public void insertarEmpresa(String empresa) {
        this.listaEmpresas[numeEmpresa] = empresa;
        numeEmpresa++;
    }
    
    // Getters    

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumeEmpresa() {
        return numeEmpresa;
    }
}
