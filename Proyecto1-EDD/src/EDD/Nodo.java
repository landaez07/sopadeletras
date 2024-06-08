/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 * La clase {@code Nodo} representa un nodo en una estructura de datos. Cada
 * nodo contiene una cadena de letras, un apuntador a otro nodo y una lista
 * interna de arcos.
 *
 * @autor Pedro
 */
public class Nodo {

    /**
     * La cadena de letras del nodo.
     */
    private String Letras;

    /**
     * El apuntador a otro nodo.
     */
    private Nodo apuntador;

    /**
     * La lista interna de arcos del nodo.
     */
    private ListaInterna listainterna;

    /**
     * Crea un nuevo {@code Nodo} con la cadena de letras especificada.
     *
     * @param Letras la cadena de letras del nodo
     */
    public Nodo(String Letras) {
        this.Letras = Letras;
        this.apuntador = null;
        this.listainterna = new ListaInterna();
    }

    /**
     * Crea un nuevo {@code Nodo} con la lista interna especificada.
     *
     * @param listainterna la lista interna de arcos del nodo
     */
    public Nodo(ListaInterna listainterna) {
        this.listainterna = listainterna;
    }

    /**
     * Obtiene la cadena de letras del nodo.
     *
     * @return la cadena de letras del nodo
     */
    public String getLetras() {
        return Letras;
    }

    /**
     * Establece la cadena de letras del nodo.
     *
     * @param Letras la nueva cadena de letras del nodo
     */
    public void setLetras(String Letras) {
        this.Letras = Letras;
    }

    /**
     * Obtiene el apuntador a otro nodo.
     *
     * @return el apuntador a otro nodo
     */
    public Nodo getApuntador() {
        return apuntador;
    }

    /**
     * Establece el apuntador a otro nodo.
     *
     * @param apuntador el nuevo apuntador a otro nodo
     */
    public void setApuntador(Nodo apuntador) {
        this.apuntador = apuntador;
    }

    /**
     * Obtiene la lista interna de arcos del nodo.
     *
     * @return la lista interna de arcos del nodo
     */
    public ListaInterna getListainterna() {
        return listainterna;
    }

    /**
     * Establece la lista interna de arcos del nodo.
     *
     * @param listainterna la nueva lista interna de arcos del nodo
     */
    public void setListainterna(ListaInterna listainterna) {
        this.listainterna = listainterna;
    }
}
