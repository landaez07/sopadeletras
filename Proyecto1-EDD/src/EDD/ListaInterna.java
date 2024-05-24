/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author pedro
 */
public class ListaInterna {
    
    
    private Arco Cabeza;
    private Arco Ultimo;

    public ListaInterna(Arco Cabeza, Arco Ultimo) {
        this.Cabeza = Cabeza;
        this.Ultimo = Ultimo;
    }

    public Arco getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Arco Cabeza) {
        this.Cabeza = Cabeza;
    }

    public Arco getUltimo() {
        return Ultimo;
    }

    public void setUltimo(Arco Ultimo) {
        this.Ultimo = Ultimo;
    }
    
    
}
