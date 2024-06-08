/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase {@code Arco} representa una conexión entre dos nodos en un grafo.
 * Cada arco tiene un nodo de origen y un nodo de destino, así como una
 * referencia al siguiente arco en una lista.
 *
 * @author pedro
 */
public class Arco {

    /**
     * El nodo de origen del arco.
     */
    public Nodo nLetra;

    /**
     * El nodo de destino del arco.
     */
    public Nodo nLetra2;

    /**
     * El siguiente arco en la lista de arcos.
     */
    public Arco siguiente;

    /**
     * Crea un nuevo {@code Arco} con los nodos especificados.
     *
     * @param Letra el nodo de origen
     * @param Puntero el nodo de destino
     */
    public Arco(Nodo Letra, Nodo Puntero) {
        this.nLetra = Letra;
        this.nLetra2 = Puntero;
        this.siguiente = null;
    }
}
