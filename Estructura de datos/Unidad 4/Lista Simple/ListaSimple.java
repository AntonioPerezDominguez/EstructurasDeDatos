/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LstSimple;

import java.util.Scanner;

/**
 *
 * @author Antonio
 * 
 */
public class ListaSimple {

    public Nodo listaInterna, inicio;
    
    
    public void editar(int reemplazo ){
        Scanner leer = new Scanner(System.in);
        Nodo aux = inicio;
        int nuevo;
        while (aux != null) {
            if (aux.getDato() == reemplazo) {
                System.out.println("Nuevo valor: ");
                nuevo=leer.nextInt();
                aux.setDato(nuevo);;
                break;
            } else {                
                aux = aux.getNext();
            }             
        }                
    }
    
    public void ordenar(int num){
        for (int i = 0; i < num; i++) {
          Nodo aux = inicio;
          int temporal;
        while (aux.getNext() != null) {
            if (aux.getDato()<aux.getNext().getDato()){
                temporal=aux.getDato();
               aux.setDato(aux.getNext().getDato());
               aux.getNext().setDato(temporal);
            } else {
                aux = aux.getNext();
            }
        }            
        }
    }
    

    public void insert(int dato) {
        if (listaInterna == null) {
            listaInterna = new Nodo(dato);
//            System.out.println("obj lista: "+lista);
            inicio = listaInterna;
//            System.out.println("obj inicio: "+inicio);
        } else {
            Nodo aux = new Nodo(dato);
//            System.out.println("dato de lista:   " + lista.dato);
//            System.out.println("dato de lista.next: "+lista.next.dato);
            listaInterna.setNext(aux);
//            System.out.println("dato de next:    " + lista.next.dato);
            listaInterna = aux;
        }
    }
    
    /*
    BOTON DE MODIFICAR
    PEDIR EL DATO
    MANDAR BUSCAR EL DATO
    SI LO ENCUENTRA PEDIR EL DATO NUEVO
    SI LO ENCUANTRA MOSTRAR MSG
    
    */

    public boolean find(int dato) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getDato()!= dato) {
                aux = aux.getNext();
            } else {
                return true;
            }
        }
        return false;
    }

    int tamano() {
        int n = 0;
        while (inicio != null) {
            n++;
            inicio = inicio.getNext();
        }
        return n;
    }

    public boolean isEmpty() {
        return listaInterna == null;
    }

    public boolean remove(int dato) throws Exception {
        if (isEmpty()) {
            throw new Exception("LISTA VACIA");
        }
        if (listaInterna == inicio && inicio.getDato() == dato) {
            listaInterna = null;
            inicio = null;
            return true;
        }
        if (inicio == listaInterna && inicio.getDato() == dato) {
            inicio = null;
            return true;        }
        boolean result = false;
        Nodo aux = inicio;
        while (aux != null) {
            if (inicio == aux && inicio.getDato() == dato) {
                inicio = aux.getNext();
                result = true;
                break;
            } else if (aux.getNext() == listaInterna && listaInterna.getDato() == dato) {
                listaInterna = aux;
                listaInterna.setNext(null);;
                result = true;
                break;
            } else if (aux.getNext() != null && aux.getNext().getDato() == dato) {
                aux.setNext(aux.getNext().getNext());
                result = true;
                break;            }
            aux = aux.getNext();        }
        return false;
    }

    public String toString() {
        String result = "";
        Nodo aux = inicio;

        while (aux != null) {
            result += aux;
            aux = aux.getNext();
        }
        return result;

    }

}
