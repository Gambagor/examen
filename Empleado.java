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

    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getCargo() {
        return cargo;
    }



    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    public double getSalario() {
        return salario;
    }



    public void setSalario(double salario) {
        this.salario = salario;
    }



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