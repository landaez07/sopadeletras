/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author pedro
 */
public class Arco {
    
    
    private String Letra;
    private Arco Puntero;

    public Arco(String Letra, Arco Puntero) {
        this.Letra = Letra;
        this.Puntero = Puntero;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    public Arco getPuntero() {
        return Puntero;
    }

    public void setPuntero(Arco Puntero) {
        this.Puntero = Puntero;
    }
    
    
}
