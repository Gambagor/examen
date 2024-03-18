import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        ArrayList<Empleado> lista1 = new ArrayList<>();

        Empleados.darDeAltaEmpleado(lista1);

        Scanner scanner = new Scanner(System.in);
        System.out.print(MagicStrings.pedirNumPorcentajeString);
        double porcentaje = scanner.nextDouble();

        Empleados.aumentarSalario(porcentaje, lista1);
        
        Empleados.mostrarLista(lista1);

        scanner.close();
    }
}
