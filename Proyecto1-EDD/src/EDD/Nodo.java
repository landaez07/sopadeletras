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
public class Nodo {
    
    
    private String Letras;
    private Nodo apuntador;
    private ListaInterna listainterna;

    public Nodo(String Letras, Nodo apuntador, ListaInterna listainterna) {
        this.Letras = Letras;
        this.apuntador = null;
        this.listainterna = listainterna;
    
    }

    public Nodo(ListaInterna listainterna) {
        this.listainterna = listainterna;
    }

    public String getLetras() {
        return Letras;
    }

    public void setLetras(String Letras) {
        this.Letras = Letras;
    }

    public Nodo getApuntador() {
        return apuntador;
    }

    public void setApuntador(Nodo apuntador) {
        this.apuntador = apuntador;
    }

    public ListaInterna getListainterna() {
        return listainterna;
    }

    public void setListainterna(ListaInterna listainterna) {
        this.listainterna = listainterna;
    }

    
    
    
    
}
