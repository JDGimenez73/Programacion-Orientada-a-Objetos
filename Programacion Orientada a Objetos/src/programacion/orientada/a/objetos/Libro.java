package programacion.orientada.a.objetos;
/**
 *
 * @author dario
 */
public class Libro {
    
    // Atributos privados (encapsulados)
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // usamos el setter para validar
    }

    // Getters (solo lectura externa)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter con validación
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año de publicación inválido: " + anioPublicacion);
        }
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("📖Libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("-------------------------");
    }

    // Método main para probar
    public static void main(String[] args) {
        // Crear un libro
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);

        // Mostrar info inicial
        libro1.mostrarInfo();

        // Intentar poner un año inválido
        libro1.setAnioPublicacion(-50);

        // Poner un año válido
        libro1.setAnioPublicacion(1970);

        // Mostrar info final
        libro1.mostrarInfo();
    }
}

