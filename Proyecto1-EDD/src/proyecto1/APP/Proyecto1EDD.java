/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.APP;

import EDD.Grafo;
import EDD.Nodo;
import Interfaces.Bienvenida;

/**
 *
 * @author Chris
 */
public class Proyecto1EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Grafo g = new Grafo(16, "CHAOXATMPRRAAORO");
//        System.out.println(g.amplitud2("RATA"));
        Bienvenida b = new Bienvenida();
//        Nodo[] a = g.amplitud2("RATA");
//        for (int i = 0; i < 16; i++) {
//            System.out.println(a[i].getLetras());
//        }
        b.setVisible(true);
    }
    
}
