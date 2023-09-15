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
 */
public class TestListaSimple {

    

    public static void main(String args[]) throws Exception {
      
               ListaSimple ls = new ListaSimple();
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto elementos: ");
        int numero = leer.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingresa el elemento");
            ls.insert(leer.nextInt());
        }

        System.out.println("LISTA DE DATOS AGREGADOS:" + ls);

        System.out.println("Cual numero quieres editar");
        int edit = leer.nextInt();
        if (!ls.find(edit)) {
            System.out.println("Numero no encontrado");
        } else {
            ls.editar(edit);
        }
        System.out.println("La lista modificada es: " + ls);
        ls.ordenar(numero);
        System.out.println("La lista ordenada " + ls);

    }
}
