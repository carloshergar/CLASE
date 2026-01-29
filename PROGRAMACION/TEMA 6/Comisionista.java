public class Comisionista extends Empleado
{
    private double salarioMinimo = 750;
    private double montoCliente;
    private int clientesCaptados;

    public Comisionista(String dni, String nombre, String apellido, int añoIngreso, double montoCliente, int clientesCaptados)
    {
        super(dni, nombre, apellido, añoIngreso);
        this.montoCliente = montoCliente;
        this.clientesCaptados = clientesCaptados;
    }

    public Comisionista()
    {
    }

    public double calcularSalario()
    {
        double salario = montoCliente * clientesCaptados;
    
        double salarioFinal;

        if (salario < salarioMinimo) 
        {
            salarioFinal = salarioMinimo;
        }
        else
        {
            salarioFinal = salario;
        }
        System.out.println("Su salario es: " + salarioFinal);
        return salarioFinal;
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

    public void setMontoCliente(double montoCliente) 
    { 
        this.montoCliente = montoCliente; 
    }

    public void setClientesCaptados(int clientesCaptados) 
    { 
        this.clientesCaptados = clientesCaptados; 
    }
}