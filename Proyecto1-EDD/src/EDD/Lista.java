/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 * La clase {@code Lista} representa una lista enlazada con nodos. Proporciona
 * métodos para obtener y establecer la cabeza, el último nodo y el tamaño de la
 * lista.
 *
 * @autor pedro
 */
public class Lista {

    /**
     * El nodo cabeza de la lista.
     */
    private Nodo Cabeza;

    /**
     * El último nodo de la lista.
     */
    private Nodo Ultimo;

    /**
     * El tamaño de la lista.
     */
    private int Size;

    /**
     * Crea una nueva {@code Lista} con la cabeza, el último nodo y el tamaño
     * especificados.
     *
     * @param Cabeza el nodo cabeza de la lista
     * @param Ultimo el último nodo de la lista
     * @param Size el tamaño de la lista
     */
    public Lista(Nodo Cabeza, Nodo Ultimo, int Size) {
        this.Cabeza = null;
        this.Ultimo = null;
        this.Size = 0;
    }

    /**
     * Obtiene el nodo cabeza de la lista.
     *
     * @return el nodo cabeza de la lista
     */
    public Nodo getCabeza() {
        return Cabeza;
    }

    /**
     * Establece el nodo cabeza de la lista.
     *
     * @param Cabeza el nodo cabeza de la lista
     */
    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }

    /**
     * Obtiene el último nodo de la lista.
     *
     * @return el último nodo de la lista
     */
    public Nodo getUltimo() {
        return Ultimo;
    }

    /**
     * Establece el último nodo de la lista.
     *
     * @param Ultimo el último nodo de la lista
     */
    public void setUltimo(Nodo Ultimo) {
        this.Ultimo = Ultimo;
    }

    /**
     * Obtiene el tamaño de la lista.
     *
     * @return el tamaño de la lista
     */
    public int getSize() {
        return Size;
    }

    /**
     * Establece el tamaño de la lista.
     *
     * @param Size el tamaño de la lista
     */
    public void setSize(int Size) {
        this.Size = Size;
    }
}
