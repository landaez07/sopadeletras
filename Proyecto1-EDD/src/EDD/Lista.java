/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author Pedro
 */
public class Lista {
    
    
    
    private Nodo Cabeza;
    private Nodo Ultimo;
    private int Size;

    public Lista(Nodo Cabeza, Nodo Ultimo, int Size) {
        this.Cabeza = null;
        this.Ultimo = null;
        this.Size = 0;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }

    public Nodo getUltimo() {
        return Ultimo;
    }

    public void setUltimo(Nodo Ultimo) {
        this.Ultimo = Ultimo;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }
    
    
    
    
    
}
