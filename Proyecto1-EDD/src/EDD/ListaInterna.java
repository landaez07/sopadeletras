/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase {@code ListaInterna} representa una lista enlazada interna de arcos.
 * Proporciona métodos para agregar arcos, buscar nodos y mostrar la lista.
 *
 * @autor Pedro
 */
public class ListaInterna {

    /**
     * El arco cabeza de la lista.
     */
    private Arco Cabeza;

    /**
     * El último arco de la lista.
     */
    private Arco Ultimo;

    /**
     * Crea una nueva {@code ListaInterna} vacía.
     */
    public ListaInterna() {
        this.Cabeza = null;
        this.Ultimo = null;
    }

    /**
     * Obtiene el arco cabeza de la lista.
     *
     * @return el arco cabeza de la lista
     */
    public Arco getCabeza() {
        return Cabeza;
    }

    /**
     * Establece el arco cabeza de la lista.
     *
     * @param Cabeza el arco cabeza de la lista
     */
    public void setCabeza(Arco Cabeza) {
        this.Cabeza = Cabeza;
    }

    /**
     * Obtiene el último arco de la lista.
     *
     * @return el último arco de la lista
     */
    public Arco getUltimo() {
        return Ultimo;
    }

    /**
     * Establece el último arco de la lista.
     *
     * @param Ultimo el último arco de la lista
     */
    public void setUltimo(Arco Ultimo) {
        this.Ultimo = Ultimo;
    }

    /**
     * Comprueba si la lista está vacía.
     *
     * @return {@code true} si la lista está vacía; {@code false} en caso
     * contrario
     */
    public boolean isEmpty() {
        return Cabeza == null;
    }

    /**
     * Agrega un nuevo arco a la lista.
     *
     * @param n1 el primer nodo del arco
     * @param n2 el segundo nodo del arco
     */
    public void Agg(Nodo n1, Nodo n2) {
        Arco nuevoArco = new Arco(n1, n2);
        if (this.isEmpty()) {
            this.setUltimo(nuevoArco);
            this.setCabeza(nuevoArco);
        } else {
            this.Ultimo.siguiente = nuevoArco;
            this.setUltimo(nuevoArco);
        }
    }

    /**
     * Busca un nodo en la lista.
     *
     * @param uno el nodo a buscar
     * @return {@code true} si el nodo se encuentra en la lista; {@code false}
     * en caso contrario
     */
    public boolean Buscar(Nodo uno) {
        Arco aux = Cabeza;
        while (aux != null && (aux.nLetra != uno && aux.nLetra2 != uno)) {
            aux = aux.siguiente;
        }
        return aux != null;
    }

    /**
     * Imprime la lista de arcos.
     */
    public void Imprimir() {
        Arco aux = Cabeza;
        if (aux != null) {
            System.out.print(aux.nLetra.getLetras());
            while (aux != null) {
                System.out.print("-" + aux.nLetra2.getLetras());
                aux = aux.siguiente;
            }
            System.out.println("");
        }
    }
}
