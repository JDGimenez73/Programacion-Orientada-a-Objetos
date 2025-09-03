package programacion.orientada.a.objetos;
/**
 *
 * @author dario
 */
public class Mascota {
    // Atributos de la mascota
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("-------------------------");
    }

    // Método para cumplir años
    public void cumplirAnios() {
        edad++;
        System.out.println( nombre + " cumplió un año más. Ahora tiene " + edad + " años.");
    }

    // Método main para probar
    public static void main(String[] args) {
        // Crear mascota
        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);

        // Mostrar datos iniciales
        mascota1.mostrarInfo();

        // Simular el paso del tiempo (cumple 1 año)
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();

        // Cumple otro año más
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
    }
}
