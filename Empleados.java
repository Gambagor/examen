import java.util.ArrayList;
/**
 * La clase {@code Empleados} contiene métodos estáticos para gestionar la lista de empleados.
 */
public class Empleados {
    private ArrayList<Empleado> lista;

    /**
     * Constructor de la clase {@code Empleados}.
     * @param lista La lista de empleados.
     */
    public Empleados(ArrayList<Empleado> lista) {
        this.lista = lista;
    }

    /**
     * Aumenta el salario de todos los empleados en la lista por un porcentaje dado.
     * @param porcentaje El porcentaje de aumento de salario.
     * @param lista La lista de empleados.
     */
    public static void aumentarSalario(double porcentaje, ArrayList<Empleado> lista) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra la lista de empleados en la consola.
     * @param lista La lista de empleados.
     */
    public static void mostrarLista(ArrayList<Empleado> lista) {
        System.out.println(MagicStrings.mostrarListaEmpleadosString);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Da de alta a varios empleados en la lista.
     * @param lista La lista de empleados.
     */
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