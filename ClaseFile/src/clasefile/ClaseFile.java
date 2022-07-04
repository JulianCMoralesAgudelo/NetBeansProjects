package clasefile;

import java.io.File;

public class ClaseFile {

    public static void main(String[] args) {
        String pathname = "/home/julian/NetBeansProjects/ClaseFile/src/clasefile/prueba.txt";
        File archivo = new File(pathname);
        if (archivo.exists()) {
            System.out.println("El archivo existe\n");
            System.out.println("Ruta absoluta\n" + archivo.getAbsolutePath() + "\n");
            System.out.println("Es archivo\n" + archivo.isFile());
            System.out.println("Es Directorio\n" + archivo.isDirectory());
        } else {
            System.out.println("El archivo no existe\n");
        }
    }
}
