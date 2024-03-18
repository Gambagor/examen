/**
 * La clase {@code Empleado} representa a un empleado con nombre, cargo y salario.
 */
public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    /**
     * Constructor de la clase {@code Empleado}.
     * @param nombre El nombre del empleado.
     * @param cargo El cargo del empleado.
     * @param salario El salario del empleado.
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters y setters omitidos por brevedad

    /**
     * Devuelve una representación de cadena del objeto.
     * @return Una cadena que representa al empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}