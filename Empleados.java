import java.util.ArrayList;

public class Empleados {
    private ArrayList<Empleado> lista;

    public Empleados(ArrayList<Empleado> lista) {
        this.lista = lista;
    }

    public static void aumentarSalario(double porcentaje, ArrayList<Empleado> lista) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public static void mostrarLista(ArrayList<Empleado> lista) {
        System.out.println(MagicStrings.mostrarListaEmpleadosString);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    public static void darDeAltaEmpleado(ArrayList<Empleado> lista) {
        Empleados e = new Empleados(lista);

        Empleado e1 = new Empleado("Juan", "Desarrollador", 50000);
        Empleado e2 = new Empleado("María", "Diseñadora", 45000);
        Empleado e3 = new Empleado("Pedro", "Gerente", 60000);

        e.lista.add(e1);
        e.lista.add(e2);
        e.lista.add(e3);
    }
}