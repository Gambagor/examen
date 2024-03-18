import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase {@code SistemaGestionEmpleados} es la clase principal del programa que gestiona los empleados.
 * Permite dar de alta empleados, aumentar sus salarios y mostrar la lista de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * El método principal de la aplicación.
     * @param args Argumentos de línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        ArrayList<Empleado> lista1 = new ArrayList<>();

        // Dar de alta empleados
        Empleados.darDeAltaEmpleado(lista1);

        Scanner scanner = new Scanner(System.in);
        System.out.print(MagicStrings.pedirNumPorcentajeString);
        double porcentaje = scanner.nextDouble();

        // Aumentar los salarios de los empleados
        Empleados.aumentarSalario(porcentaje, lista1);
        
        // Mostrar la lista de empleados
        Empleados.mostrarLista(lista1);

        scanner.close();
    }
}
