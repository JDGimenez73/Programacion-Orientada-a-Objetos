/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author dario
 */
public class NaveEspacial {
    
    // Atributos
    private String nombre;
    private int combustible;        // cantidad actual
    private final int maxCombustible = 100; // capacidad máxima del tanque

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= maxCombustible) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = maxCombustible; // no se permite más del máximo
        }
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10; // despegar gasta 10 unidades
            System.out.println( nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(" No hay suficiente combustible para despegar.");
        }
    }

    // Método para avanzar
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // cada unidad de distancia consume 2 de combustible
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println( nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > maxCombustible) {
            combustible = maxCombustible;
            System.out.println("Tanque lleno al máximo (" + maxCombustible + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + maxCombustible);
        System.out.println("-------------------------");
    }

    // Método main para probar
    public static void main(String[] args) {
        
        // Crear una nave con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial("Apolo", 50);

        // Mostrar estado inicial
        nave1.mostrarEstado();

        // Intentar avanzar sin recargar
        nave1.avanzar(30); // necesita 60 de combustible, pero solo hay 50
        System.out.println("");
        
        // Recargar combustible
        nave1.recargarCombustible(40);
        System.out.println("");
        
        // Despegar y avanzar correctamente
        nave1.despegar();
        System.out.println("");
        
        nave1.avanzar(20);
        System.out.println("");
        
        // Mostrar estado final
        nave1.mostrarEstado();
    }
}
