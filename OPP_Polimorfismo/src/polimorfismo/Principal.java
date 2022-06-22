/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author julian
 */
public class Principal {

    public static void main(String[] args) {

        /*Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GH67", "FERRARY", "A89");
        misVehiculos[1] = new VehiculoTurismo(4, "78HJ", "AUDI", "P14");
        misVehiculos[2] = new VehiculoDeportivo(500, "45GH", "TOYOTA", "KJ8");
        misVehiculos[3] = new VehiculoFurgoneta(2000, "JI8", "TOYOTA", "JJ9");

        System.out.println("\nPolimorfismo\n");
        for (Vehiculo vehiculos : misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }*/
        // Upcasting
        /*Vehiculo vehiculo = new VehiculoTurismo(4, "GH67", "TOYOTA", "KJ9");
        System.out.println("\n" + vehiculo + "\n");

        VehiculoTurismo nuevoVehiculo = (VehiculoTurismo) vehiculo;
        
        System.out.println("\n" + nuevoVehiculo + "\n");*/
        Vehiculo vehiculo = new VehiculoDeportivo(500, "GH67", "AUDI", "KJ9");

        VehiculoDeportivo nuevoVehiculo = (VehiculoDeportivo) vehiculo;

        System.out.println(nuevoVehiculo);

    }

}
