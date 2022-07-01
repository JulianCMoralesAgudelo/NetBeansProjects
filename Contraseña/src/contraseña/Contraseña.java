package contraseña;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Contraseña {

    static String mensaje = "\nUna contraseña es fuerte si tiene una mayuscula, una minuscula y mas de cinco numeros.";
    static String error = "Debe de ingresar un numero entero entre 1 y 4";
    static Scanner entrada = new Scanner(System.in);

    String nombre;
    String clave;
    int longitud;

    Contraseña(int longitud, String clave) {
        this.longitud = 8;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    //----------------------------------------------------------------   
    public static String Banco_caracteres() {

        String Banco = "";
        for (char car = 'a'; car <= 'z'; car++) {
            Banco += car;
        }
        for (char car2 = 'A'; car2 <= 'Z'; car2++) {
            Banco += car2;
        }
        for (int car3 = 0; car3 <= 9; car3++) {
            Banco += car3;
        }
        return Banco;
    }
    //----------------------------------------------------------------  

    public static String cadenaAleatoria() {
        // El banco de caracteres
        String banco = Banco_caracteres();
        // La cadena en donde iremos agregando un carácter aleatorio
        String cadena = "";
        int longitud = 8;
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = ThreadLocalRandom.current().nextInt(0, banco.length());
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }
    //----------------------------------------------------------------  

    public static boolean esFuerte(String clave) {

        int minus = 0;
        int mayus = 0;
        int num = 0;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            // Verificar cacteres
            if (Character.isUpperCase(c)) {
                mayus++;
            } else if (Character.isLowerCase(c)) {
                minus++;
            } else if (Character.isDigit(c)) {
                num++;
            }
        }
        if (minus >= 1 && mayus >= 1 && num >= 4) {
            return true;
        }
        System.out.println("\n");
        return false;
    }

    // Metodo para verificar numero
    public static int esNumero() {
        String opcion = "";
        boolean esNumerico = false;
        do {
            System.out.print("\nElija una opcion entre 1 y 4: ");
            opcion = entrada.nextLine();
            for (int i = 0; i < opcion.length(); i++) {
                if (Character.isDigit(opcion.charAt(i))) {
                    esNumerico = true;
                }
            }
        } while (!esNumerico);
        return Integer.parseInt(opcion);
    }

    @Override
    public String toString() {
        return "Los datos del usuario son:\n" + "\nNombre: " + nombre + "\nClave: " + clave;
    }

    //----------------------------------------------------------------  
    public static void main(String[] args) {
        // Delcraracion de variables        
        Contraseña contraseña = new Contraseña(8, cadenaAleatoria());
        String password = contraseña.clave;

        // Presentacion e ingreso de datos
        System.out.println("\nBienvenido");
        System.out.print("\nPor favor ingrese su nombre: ");
        contraseña.setNombre(entrada.nextLine());
        System.out.println("\nEl sistema genera una contraseña inicial para comenzar el programa.");
        System.out.println("\nSu contraseña inicial es: " + password);
        System.out.print(esFuerte(password) ? "\nLa contraseña es fuerte." : "\nLa contraseña no es fuerte.");

        do {
            System.out.println("\n\t:MENU:\n");
            System.out.println("1. Desea modificar la contraseña actual:");
            System.out.println("2. Desea verificar la contraseña actual:");
            System.out.println("3. Desea verificar la informacion actual:");
            System.out.println("4. Desea retirarse y finalzar el programa:");
            switch (esNumero()) {
                case 1:
                    // Modificar contraseña
                    System.out.println(contraseña.mensaje);
                    System.out.print("\nPor favor ingrese una nueva contraseña de ocho caracteres:");                    
                    while (true) {
                        // Validacion cantidad de caracteres nueva contraseña
                        password = entrada.nextLine();
                        if (password.length() != 8) {
                            System.out.print("\nSu contraseña debe de poseer 8 caracteres: ");
                        } else {
                            contraseña.setClave(password);
                            break;
                        }
                    }
                    break;
                case 2:
                    // Verificar contraseña actual
                    System.out.println(esFuerte(password) ? "La contraseña es fuerte." : "La contraseña no es fuerte.");
                    break;
                case 3:
                    // Verificar imformacion actual
                    System.out.println("\n" + contraseña.toString());
                    ;
                    break;
                case 4:
                    // Salir
                    System.out.println("\nHasta pronto\n");
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
