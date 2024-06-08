/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase {@code Cola} implementa una cola (estructura de datos FIFO)
 * utilizando nodos. La cola tiene un nodo primero (cabeza) y un nodo último
 * (cola).
 *
 * @author pedro
 */
public class Cola {

    /**
     * El primer nodo en la cola.
     */
    public Nodo primero;

    /**
     * El último nodo en la cola.
     */
    public Nodo ultimo;

    /**
     * Crea una nueva cola vacía.
     */
    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }

    /**
     * Verifica si la cola está vacía.
     *
     * @return {@code true} si la cola está vacía, {@code false} en caso
     * contrario.
     */
    public boolean isEmpty() {
        return primero == null;
    }

    /**
     * Añade un nodo al final de la cola.
     *
     * @param n el nodo a añadir a la cola
     */
    public void encolar(Nodo n) {
        if (this.isEmpty()) {
            this.primero = n;
            this.ultimo = n;
        } else {
            this.ultimo.setApuntador(n);
            this.ultimo = n;
        }
    }

    /**
     * Elimina y devuelve el primer nodo de la cola.
     *
     * @return el nodo que fue eliminado de la cola, o {@code null} si la cola
     * está vacía.
     */
    public Nodo desencolar() {
        if (!this.isEmpty()) {
            Nodo Aux = primero;
            primero = primero.getApuntador();
            return Aux;
        }
        return null;
    }
}
