package proyecto;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Principal {

    static Scanner entrada = new Scanner(System.in);

    // Numero de aeropuertos
    final static int numAeropuertos = 4;
    // Numero de aeropuertos
    static Aeropuerto aeropuertos[] = new Aeropuerto[numAeropuertos];

    public static void main(String[] args) {
        // Insertar datos de los aeropuertos
        insertarDatosAeropuerto(aeropuertos);
        menu();
    }

    public static void insertarDatosAeropuerto(Aeropuerto aeropuertos[]) {
        aeropuertos[0] = new AeropuertoPublico(80000000, "Jose Maria Cordoba", "Rionegro", "Colombia");
        aeropuertos[0].insertarCompanys(new Company("Viva Colombia"));
        aeropuertos[0].insertarCompanys(new Company("LATAM"));
        aeropuertos[0].getCompany("Viva Colombia").insertarVuelo(new Vuelo("IB20", "Rionegro", "Mexico", 150.91, 150));
        aeropuertos[0].getCompany("Viva Colombia").insertarVuelo(new Vuelo("IB21", "Rionegro", "Buenos Aires", 180.99, 120));
        // LATAM
        aeropuertos[0].getCompany("LATAM").insertarVuelo(new Vuelo("LT20", "Rionegro", "Londrez", 500.90, 180));
        // Insertar pasajeros
        aeropuertos[0].getCompany("Viva Colombia").getVuelo("IB20").insertarPasajero(new Pasajero("Julian Morales", "JCMA2022", "Colombiano"));
        aeropuertos[0].getCompany("Viva Colombia").getVuelo("IB20").insertarPasajero(new Pasajero("Gilma Agudelo", "GILAB2022", "Colombiana"));
        aeropuertos[0].getCompany("LATAM").getVuelo("LT20").insertarPasajero(new Pasajero("Yisela Guzman", "YMGMB2022", "Colombiana"));

        aeropuertos[1] = new AeropuertoPrivado("Presiencia de Colombia", "Bogota", "Colombia");
        aeropuertos[1].insertarCompanys(new Company("Avianca"));
        String empresas[] = {"Viva Colombia", "LATAM"};
        ((AeropuertoPrivado) aeropuertos[1]).insertarEmpresas(empresas);
        aeropuertos[1].getCompany("Viva Colombia").insertarVuelo(new Vuelo("PC01", "Bogota", "Cartagena", 0, 50));
        aeropuertos[1].getCompany("Viva Colombia").getVuelo("PC01").insertarPasajero(new Pasajero("Gustavo Petro", "GUPE", "Colombiano"));
    }

    public static void menu() {
        String Nombreaeropuerto, nombrecompany, origen, destino;
        int opcion;
        Aeropuerto aeropuerto;
        Company company;

        do {
            System.out.println("\t.:MENU:.");
            System.out.println("1. ver Aeropuertos gestionados (Publicos o privados).");
            System.out.println("2. ver empresas(Privado) o subvencion(Publico).");
            System.out.println("3. Lista de compañias por aeropuerto.");
            System.out.println("4. Lista de vuelos por compañia.");
            System.out.println("5. Listar posibles vuelos de origen a destino.");
            System.out.println("6. Salir.");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    // Ver aeropuertos gestionados
                    System.out.println("");
                    mostrarDatosAeropuertos(aeropuertos);
                    break;
                case 2:
                    // Ver empressas
                    System.out.println("");
                    mostrarPatrocinio(aeropuertos);
                    break;
                case 3:
                    // Listar compañia por aeropuerto
                    entrada.nextLine();
                    System.out.print("\nDigite nombre del Aeropuerto: ");
                    Nombreaeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(Nombreaeropuerto, aeropuertos);
                    if (aeropuerto == null) {
                        System.out.println("El aeropuerto no existe");
                    } else {
                        mostrarCompañias(aeropuerto);
                    }
                    break;
                case 4:
                    // Listar vuelos por compañia
                    System.out.print("\nDigite nombre del Aeropuerto: ");
                    Nombreaeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(Nombreaeropuerto, aeropuertos);
                    if (aeropuerto == null) {
                        System.out.println("El aeropuerto no existe");
                    } else {
                        System.out.print("\nDigite nombre de la compañia: ");
                        nombrecompany = entrada.nextLine();
                        company = aeropuerto.getCompany(nombrecompany);
                        mostrarVuelos(company);
                    }
                    break;
                case 5:
                    // listar vuelos
                    entrada.nextLine();
                    System.out.print("\nDigite ciudad origen: ");
                    origen = entrada.nextLine();
                    System.out.print("\nDigite ciudad destino: ");
                    destino = entrada.nextLine();
                    mostrarVuelosOrigenDestino(origen, destino, aeropuertos);
                    break;
                case 6:
                    // Salir
                    break;
            }
            System.out.println("");

        } while (opcion != 6);
    }

    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]) {
        for (int i = 0; i < aeropuertos.length; i++) {
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropuerto privado");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
            } else {
                System.out.println("Aeropuerto publico");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
            }
            System.out.println("");
        }
    }

    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]) {

        String empresas[];

        for (int i = 0; i < aeropuertos.length; i++) {
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropuerto Privado: " + aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado) aeropuertos[i]).getListaEmpresas();
                System.out.println("Empresas: ");
                for (int j = 0; j < empresas.length; j++) {
                    System.out.println(empresas[j]);
                }
            } else {
                System.out.println("Aeropuerto Publico: " + aeropuertos[i].getNombre());
                System.out.println("Subvencion: " + ((AeropuertoPublico) aeropuertos[i]).getSubvencion());
            }
            System.out.println("");
        }
    }

    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
        boolean encontrado = false;
        int i = 0;
        Aeropuerto aero = null;
        while ((!encontrado) && (i < aeropuertos.length)) {
            if (nombre.equals(aeropuertos[i].getNombre())) {
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
        return aero;
    }

    public static void mostrarCompañias(Aeropuerto aeropuerto) {
        System.out.println("\n Las compañias del aeropuerto: " + aeropuerto.getNombre());
        for (int i = 0; i < aeropuerto.getNumCompany(); i++) {
            System.out.println(aeropuerto.getCompany(i).getNombre());
        }
    }

    public static void mostrarVuelos(Company company) {
        Vuelo vuelo;
        System.out.println("Los vuelos d ela compañia: " + company.getNombre());
        for (int i = 0; i < company.getNumVuelo(); i++) {
            vuelo = company.getVuelo(i);
            System.out.println("Identificador: " + vuelo.getIdentificador());
            System.out.println("Ciudad Origen: " + vuelo.getCiudadOrigen());
            System.out.println("Ciudad Destino: " + vuelo.getCiudadDestino());
            System.out.println("Precio: " + vuelo.getPrecio());
            System.out.println("");
        }

    }

    public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {

        Vuelo vuelo;

        int contador = 0;

        Vuelo listaVuelos[];

        // Recorrer aeropuertos
        for (int i = 0; i < aeropuertos.length; i++) {
            // Recorrer compañias
            for (int j = 0; j < aeropuertos[i].getNumCompany(); j++) {
                // Recorrer vuelos
                for (int k = 0; k < aeropuertos[i].getCompany(j).getNumVuelo(); k++) {
                    vuelo = aeropuertos[i].getCompany(j).getVuelo(k);
                    if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))) {
                        contador++;
                    }
                }
            }
        }

        listaVuelos = new Vuelo[contador];
        int iteradorFinal = 0;

        for (int i = 0; i < aeropuertos.length; i++) {
            for (int j = 0; j < aeropuertos[i].getNumCompany(); j++) {
                for (int k = 0; k < aeropuertos[i].getCompany(j).getNumVuelo(); k++) {
                    vuelo = aeropuertos[i].getCompany(j).getVuelo(k);
                    if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))) {
                        listaVuelos[iteradorFinal] = vuelo;
                        iteradorFinal++;
                    }
                }
            }
        }
        return listaVuelos;
    }

    public static void mostrarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {
        Vuelo vuelos[];
        vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
        if (vuelos.length == 0) {
            System.out.println("No existen vuelos de esa ciudad origen a destino");
        } else {
            System.out.println("Vuelos encontrados");
            for (int i = 0; i < vuelos.length; i++) {
                System.out.println("Identificador: " + vuelos[i].getIdentificador());
                System.out.println("Identificador: " + vuelos[i].getIdentificador());
                System.out.println("Ciudad Origen: " + vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad Destino: " + vuelos[i].getCiudadDestino());
                System.out.println("Precio: " + vuelos[i].getPrecio());
            }
        }
    }
}
