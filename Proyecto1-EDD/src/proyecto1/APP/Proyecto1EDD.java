/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.APP;

import EDD.Grafo;
import Interfaces.Cargar;

/**
 *
 * @author Chris
 */
public class Proyecto1EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grafo g = new Grafo(16, "CHAOXATMPRRAAORO");
        g.crearGrafo();
        System.out.println(g.amplitud("XRRAMO"));
//        g.mostrar();
        Cargar c = new Cargar();
        
        c.setVisible(true);
    }
    
}
