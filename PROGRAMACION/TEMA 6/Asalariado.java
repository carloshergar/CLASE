import java.time.LocalDate;

public class Asalariado extends Empleado
{
    private double salarioFijo;

    public Asalariado(String dni, String nombre, String apellido, int añoIngreso, double salarioFijo)
    {
        super(dni, nombre, apellido, añoIngreso);
        this.salarioFijo = salarioFijo;
    }

    public Asalariado()
    {
    }

    public double calcularSalario()
    {
        LocalDate fechaActual = LocalDate.now();

        int antiguedad = fechaActual.getYear() - this.añoIngreso;

        double salario = 0;

        if (antiguedad < 2) 
            {
                salario = salarioFijo;
            } 
        else if (antiguedad >= 2 && antiguedad <= 3) 
            {
                salario = salarioFijo + (salarioFijo * 0.05);
            } 
        else if (antiguedad >= 4 && antiguedad <= 7) 
            {
                salario = salarioFijo + (salarioFijo * 0.10);
            }   
        else if (antiguedad >= 8 && antiguedad <= 15) 
            {
                salario = salarioFijo + (salarioFijo * 0.15);
            } 
        else if (antiguedad >= 15) 
            {
                salario = salarioFijo + (salarioFijo * 0.20);
            }

        System.out.println("Su salario es: " + salario);
        return salario; 
    }

    public void setDni(String dni) 
    { 
        this.dni = dni; 
    }

    public void setNombre(String nombre) 
    { 
        this.nombre = nombre; 
    }

    public void setApellido(String apellido) 
    { 
        this.apellido = apellido; 
    }

    public void setAñoIngreso(int añoIngreso) 
    { 
        this.añoIngreso = añoIngreso; 
    }

    public void setSalarioFijo(double salarioFijo) 
    { 
        this.salarioFijo = salarioFijo; 
    }
}