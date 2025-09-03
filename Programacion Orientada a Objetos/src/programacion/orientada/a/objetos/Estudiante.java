package programacion.orientada.a.objetos;

public class Estudiante {
    
    // Atributos del estudiante
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso,double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("-------------------------");
    }

    // Método para subir calificación
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificación aumentada en " + puntos + " puntos.");
    }

    // Método para bajar calificación
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0;
        }
        System.out.println("Calificación reducida en " + puntos + " puntos.");
    }

    // Método main para probar
    public static void main(String[] args) {
        
        // Crear un estudiante
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "Programación", 7.5);

        // Mostrar datos iniciales
        estudiante1.mostrarInfo();

        // Subir calificación
        estudiante1.subirCalificacion(1.5);
        estudiante1.mostrarInfo();

        // Bajar calificación
        estudiante1.bajarCalificacion(2);
        estudiante1.mostrarInfo();
    }
}

