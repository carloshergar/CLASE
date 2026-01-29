public abstract class Empleado
{
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected int añoIngreso;

    protected Empleado(String dni, String nombre, String apellido, int añoIngreso)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoIngreso = añoIngreso;
    }

    protected Empleado()
    {
    }

    public abstract double calcularSalario();

    public String toString()
    {
        return "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", añoIngreso=" + añoIngreso;
    }
}