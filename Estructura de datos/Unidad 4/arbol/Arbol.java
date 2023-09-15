/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author Antonio
 */
public class Arbol {

    private Nodo raiz;

   
    public Arbol() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void insertar(Nodo temporal, Nodo raiz) {
        if (raiz == null) {
            this.raiz = temporal;
        } else {
            if (temporal.getValor() <= raiz.getValor()) {
                if (raiz.getNodoizquierdo() == null) {
                    raiz.setNodoizquierdo(temporal);
                } else {
                    insertar(temporal, raiz.getNodoizquierdo());
                }
            } else {               
                if (raiz.getNododerecho() == null) {
                    raiz.setNododerecho(temporal);
                } else {
                    insertar(temporal, raiz.getNododerecho());
                }
            }
        }

    }

    public void mostrar(Nodo raiz) {
        if (raiz != null) {
            mostrar(raiz.getNodoizquierdo());
            System.out.print(raiz.getValor() + " - ");
            mostrar(raiz.getNododerecho());
        }
    }

    

}

class PruebaArbol {

    public static void main(String args[]) {
        Arbol arbol = new Arbol();
        int valor;
        System.out.println("Insertando los siguientes valores: ");       
        for (int i = 1; i <= 10; i++) {
            valor = (int) (Math.random() * 100);
            System.out.print(valor + " ");
            arbol.insertar(new Nodo(valor), arbol.getRaiz());
        }
        System.out.println("IMPRIMIENDO ARBOL");
        arbol.mostrar(arbol.getRaiz());
        

    }
}
