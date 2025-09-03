package programacion.orientada.a.objetos;
/**
 *
 * @author dario
 */
public class Gallina {
    
    // Atributos
    private int idGallina;
    private int edad;          // en años
    private int huevosPuestos; // cantidad total de huevos

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // inicia en 0
    }

    // Método para simular que pone un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("🥚La gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    // Método para simular que envejece
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " ahora tiene " + edad + " años.");
    }

    // Método para mostrar el estado de la gallina
    public void mostrarEstado() {
        System.out.println("🐔Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("-------------------------");
    }

    // Método main para probar
    public static void main(String[] args) {
        
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 1);

        // Acciones de la gallina1
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        
        System.out.println("-----------------------------------");
        
        // Acciones de la gallina2
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        
        System.out.println("-----------------------------------");

        // Mostrar estados finales
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
