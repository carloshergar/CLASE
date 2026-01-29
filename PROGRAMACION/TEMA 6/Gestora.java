public class Gestora 
{
    public static void main(String[] args) 
    {
        Empleado[] e = new Empleado[4];

        e[0] = new Asalariado("12345678A", "Javier", "Gomez", 2008, 1225.0);
        e[1] = new Comisionista("12345678B", "Eva", "Nieto", 2010, 8.10, 179);
        
        Comisionista c = new Comisionista();
        c.setDni("12345678C");
        c.setNombre("José");
        c.setApellido("Ruiz");
        c.setAñoIngreso(2012);
        c.setMontoCliente(7.50);
        c.setClientesCaptados(81);
        e[2] = c;

        Asalariado c2 = new Asalariado();
        c2.setDni("12345678D");
        c2.setNombre("Maria");
        c2.setApellido("Núñez");
        c2.setAñoIngreso(2013);
        c2.setSalarioFijo(1155.0);
        e[3] = c2;

        for (int i = 0; i < e.length; i++) 
        {
            System.out.println(e[i].toString());
            e[i].calcularSalario();
            System.out.println();
        }

}
