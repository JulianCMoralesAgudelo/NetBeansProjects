

/**
 *
 * @author julian
 */

 public class AeropuertoPrivado extends Aeropuerto {
    // Atributos

    private String listaEmpresas[] = new String[10];
    private int numEmpresa;

    // Constructor
    
    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Company[] companys, String empresas[]) {
        super(nombre, ciudad, pais, companys);
        this.listaEmpresas = empresas;
        numEmpresa = empresas.length;
    }
    
    // Metodos

    public void insertarEmpresas(String empresas[]) {
        this.listaEmpresas = empresas;
        this.numEmpresa = empresas.length;
    }

    public void insertarEmpresa(String empresa) {
        this.listaEmpresas[numEmpresa] = empresa;
        numEmpresa++;
    }
    
    // Getters    

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }
}
