/*Programar un ejemplo de uso de un método static.
Crear una clase (voy a llamarla A) con un atributo de clase y dos atributos de instancia
Codificar una clase Test donde se creen varios objetos de la clase A. Modificar el atributo static desde alguno de los objetos. Comprobar que todos los objetos son capaces de ver las modificaciones realizadas.
¿Cómo podría llevar la cuenta del número de objetos de la clase A que se han creado? */


public class A
{
    private String nombre;
    private int edad;
    static String especie = "Humano";
    static int contador = 0;

    public A(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        contador++;
    }

    public void mostrarDatos() 
    {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Especie: " + especie);
    }


    public static int getContador() 
    {
        return contador;
    }

}