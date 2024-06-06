/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author Chris
 */
public class Grafo {
    public int max_nodos;
    public int nodos_actuales;
    public Nodo[] vertices;
    
    public Grafo(int max_nodos, String letras){
        this.max_nodos = max_nodos;
        this.nodos_actuales = 0;
        this.vertices = new Nodo[max_nodos];
        for (int i = 0; i < max_nodos; i++) {
            this.vertices[i] = new Nodo(String.valueOf(letras.charAt(i)));
        }
    }
   
    
    public void crearArista(int i, int j){
        if(0 <= i && i < 16 && 0 <= j && j < 16){
            this.vertices[i].getListainterna().Agg(this.vertices[i], this.vertices[j]);
//            this.vertices[j].getListainterna().Agg(this.vertices[i], this.vertices[j]);

        }
    }
    
    public void crearGrafo(){
        for (int x = 0; x < 16; x++) {
            if( x == 0 || x== 4 || x== 8 || x==12){
                this.crearArista(x, x+1);
                if (x-4 >=0){
                    this.crearArista(x, x-3);
                    this.crearArista(x, x-4);
                }
                if (x+4 <16){
                    this.crearArista(x, x+4);
                    this.crearArista(x, x+5);
                    
                }
            }else if(x == 3 || x == 7 || x == 11 || x == 15){
                this.crearArista(x, x-1);
                if (x-4 >=0){
                    this.crearArista(x, x-5);
                    this.crearArista(x, x-4);
                }
                if (x+4 <= 16){
                    this.crearArista(x, x+3);
                    this.crearArista(x, x+4);
                }
            }
            else{
                this.crearArista(x, x+1);
                this.crearArista(x, x-1);
                if (x-4 >= 0){
                    this.crearArista(x, x-5);
                    this.crearArista(x, x-4);
                    this.crearArista(x, x-3);
                }
                if (x+4 <= 16){
                    this.crearArista(x, x+3);
                    this.crearArista(x, x+4);
                    this.crearArista(x, x+5);
                }
            }
        }
            
        
    }
    
           
}
