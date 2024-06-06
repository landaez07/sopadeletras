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

    public Grafo(int max_nodos, String letras) {
        this.max_nodos = max_nodos;
        this.nodos_actuales = 0;
        this.vertices = new Nodo[max_nodos];
        for (int i = 0; i < max_nodos; i++) {
            this.vertices[i] = new Nodo(String.valueOf(letras.charAt(i)));
        }
    }

    public void crearArista(int i, int j) {
        if (0 <= i && i < 16 && 0 <= j && j < 16) {
            this.vertices[i].getListainterna().Agg(this.vertices[i], this.vertices[j]);
//            this.vertices[j].getListainterna().Agg(this.vertices[i], this.vertices[j]);

        }
    }

    public void crearGrafo() {
        for (int x = 0; x < 16; x++) {
            if (x == 0 || x == 4 || x == 8 || x == 12) {
                this.crearArista(x, x + 1);
                if (x - 4 >= 0) {
                    this.crearArista(x, x - 3);
                    this.crearArista(x, x - 4);
                }
                if (x + 4 < 16) {
                    this.crearArista(x, x + 4);
                    this.crearArista(x, x + 5);

                }
            } else if (x == 3 || x == 7 || x == 11 || x == 15) {
                this.crearArista(x, x - 1);
                if (x - 4 >= 0) {
                    this.crearArista(x, x - 5);
                    this.crearArista(x, x - 4);
                }
                if (x + 4 <= 16) {
                    this.crearArista(x, x + 3);
                    this.crearArista(x, x + 4);
                }
            } else {
                this.crearArista(x, x + 1);
                this.crearArista(x, x - 1);
                if (x - 4 >= 0) {
                    this.crearArista(x, x - 5);
                    this.crearArista(x, x - 4);
                    this.crearArista(x, x - 3);
                }
                if (x + 4 <= 16) {
                    this.crearArista(x, x + 3);
                    this.crearArista(x, x + 4);
                    this.crearArista(x, x + 5);
                }
            }
        }

    }

    public void mostrar() {
        for (int i = 0; i < 16; i++) {
            this.vertices[i].getListainterna().Imprimir();
        }
    }

    //procedimiento recursivo 
    public boolean recorrerProfundidad(int v, boolean[] visitados, String palabra, int contador) {
        //se marca el vértice v como visitado 
        visitados[v] = true;
        boolean b = false;
//        System.out.println(this.vertices[v].getLetras());
        //el tratamiento del vértice consiste únicamente en imprimirlo en pantalla 

        //se examinan los vértices adyacentes a v para continuar el recorrido 
        if (contador != palabra.length()) {
            for (int i = 0; i < this.max_nodos; i++) {
//                System.out.println(this.vertices[i].getLetras()+ "-" + palabra.charAt(contador) + "  " + this.vertices[i].getLetras().equals(String.valueOf(palabra.charAt(contador))) );
                if ((v != i) && (!visitados[i]) && this.vertices[v].getListainterna().Buscar(this.vertices[i]) && (this.vertices[i].getLetras().equals(String.valueOf(palabra.charAt(contador))))) {
//                    System.out.println(this.vertices[i].getLetras());
                    int c = contador + 1;
                    b = recorrerProfundidad(i, visitados, palabra, c);
//                    System.out.println("----");
                    if (b) {
                        return b;
                    }
                }
            }
            return b;
        } else {
            return true;
//            System.out.println("terminado");
        }
    }
//procedimiento no recursivo 

    public boolean profundidad(String palabra) {
        boolean visitados[] = new boolean[this.max_nodos];
        boolean b = false;
        for (int i = 0; i < this.max_nodos; i++) {  //inicializar vector con campos false 
            visitados[i] = false;
        }
        for (int i = 0; i < this.max_nodos; i++) {  //Relanza el recorrido en cada  
            if (!visitados[i] && this.vertices[i].getLetras().equals(String.valueOf(palabra.charAt(0)))) {    //vértice visitado 
                visitados[i] = true;
                b = recorrerProfundidad(i, visitados, palabra, 1);
            }
        }
        return b;
    }

    public static void amplitud(Grafo g) {
        Cola cola = new Cola();
        boolean visitados[] = new boolean[g.obtenerNumVertices()];
        int v; //vértice actual
//Se inicializa el vector visitados [] a false
        for (int i = 0; i < g.obtenerNumVertices(); i++) {
            visitados[i] = false;
        }
//El recorrido en amplitud se inicia en cada vértice no visitado
        for (int i = 0; i < g.obtenerNumVertices(); i++) {
//se pone en la cola el vértide de partida y se marca como visitado
            if (!visitados[i]) {
                cola.encolar(i);
                visitados[i] = true;
                while (!cola.estaVacia()) {
                    v = cola.desencolar(); //desencolar y tratar el vértice
                    System.out.println(v);
//y encolo los nodos adyacentes a v.
                    for (int j = 0; j < g.obtenerNumVertices(); j++) {
                        if ((v != j) && (g.existeArista(v, j) && (!visitados[j]))  {
                            cola.encolar(j);
                            visitados[j] = true;
                        }
                    }
                }
            }
        }
    }

}
