/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosRecursivos;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class mainPila {
    public static void main(String[] args) {
        Pila pila= new Pila(6);
        Scanner cin=new Scanner(System.in);
        String numeros[]=cin.nextLine().split(" ");
        for(int i=0;i<numeros.length;i++){
            pila.evaluate(Integer.parseInt(numeros[i]));
        }
        System.out.println(pila.getIndex(7,0));
    }
}
