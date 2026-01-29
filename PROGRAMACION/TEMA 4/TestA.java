public class TestA 
{
    public static void main(String[] args) {

        A a1 = new A("Juan", 18);
        A a2 = new A("Ana", 25);
        A a3 = new A("Luis", 30);

        a1.mostrarDatos();
        a2.mostrarDatos();
        a3.mostrarDatos();

        System.out.println("Objetos creados: " + A.getContador());
    }
}
