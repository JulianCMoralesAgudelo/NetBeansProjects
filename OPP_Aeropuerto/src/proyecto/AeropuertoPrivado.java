package proyecto;

public class AeropuertoPrivado extends Aeropuerto {

    //	Atributos
    private String listaEmpresas[] = new String[10];
    private int numEmpresas;

    //	 Metodos Constructor
    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compania[] listaCompania, String[] listaEmpresas) {
        super(nombre, ciudad, pais, listaCompania);
        this.listaEmpresas = listaEmpresas;
        this.numEmpresas = listaEmpresas.length;
    }

    //	Metodo para insertar empresas
    public void insertarEmpresas(String empresa[]) {
        this.listaEmpresas = empresa;
        this.numEmpresas = empresa.length;
    }

    //	Metodo para insertar empresa una a una
    public void insertarEmpresa(String empresa) {
        listaEmpresas[numEmpresas] = empresa;
        numEmpresas++;
    }

    //	Getters
    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresas() {
        return numEmpresas;
    }

}
