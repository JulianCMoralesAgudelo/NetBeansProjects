package equipofutbol;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Principal {

    static ArrayList<Persona> persona = new ArrayList<>();

    static Scanner entrada = new Scanner(System.in);

    static Persona futbolista = new Futbolista(9, "Delantero", "Gonzalo", "Higuain", 35);
    static Persona futbolista2 = new Futbolista(21, "Delantero", "Pablo", "Dybala", 30);
    static Persona entrenador = new Entrenador("Defensiva", "Massimiliano", "Alegri", 60);
    static Persona medico = new Medico("Licenciado en fisioterapia", 20, "Armando", "Curas", 50);

    public static void main(String[] args) {
        // Llenar arreglo dinamico
        // UpCasting explicito
        persona.add(futbolista);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);
        
        // Llamar el menu
        menu();
    }

    public static void menu() {

        int opcion;

        do {
            System.out.println("\n\t.:MENU:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Curar lesion");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            System.out.print("\nElija una opcion deseada: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    // Viaje equipo
                    System.out.println("");
                    viajarEquipo();
                    break;
                case 2:
                    // Entrenamiento
                    System.out.println("");
                    entrenarEquipo();
                    break;
                case 3:
                    // Partido de futbol
                    System.out.println("");
                    partidoFutbol();
                    break;
                case 4:
                    // Planificar entrenamiento
                    System.out.println("");
                    planificarEntrenamiento();
                    break;
                case 5:
                    // Entrevista
                    System.out.println("");
                    entrevista();
                    break;
                case 6:
                    // Curar lesion
                    System.out.println("");
                    curarLesion();
                    break;
                case 7:
                    // Salir
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("Opcion erronea.\nIntente nuevamente\n");
                    break;
            }

        } while (opcion != 7);

    }

    // Metodos de clase
    public static void viajarEquipo() {
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + "-> ");
            equipo.viajar();
        }
    }

    public static void entrenarEquipo() {
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + " -> ");
            equipo.entrenamiento();
        }
    }

    public static void partidoFutbol() {
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + " -> ");
            equipo.partidoFutbol();
        }
    }

    public static void planificarEntrenamiento() {
        System.out.print(entrenador.getNombre() + " " + entrenador.getApellidos() + " -> ");
        // DownCasting explicito
        ((Entrenador) entrenador).planificarEntrenamiento();
    }

    public static void entrevista() {
        System.out.print(futbolista.getNombre() + " " + futbolista.getApellidos() + " -> ");
        // DownCasting explicito
        ((Futbolista) futbolista).entrevista();

        System.out.print(futbolista2.getNombre() + " " + futbolista2.getApellidos() + " -> ");
        // DownCasting explicito
        ((Futbolista) futbolista2).entrevista();
    }

    public static void curarLesion() {
        System.out.print(medico.getNombre() + " " + medico.getApellidos() + " -> ");
        // DownCasting explicito
        ((Medico) medico).curarLesion();
    }
}
