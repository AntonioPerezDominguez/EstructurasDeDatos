/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Antonio
 */
public class main {
    public static void main(String[] args) {
        S23B_AntonioPD_PRA2 arr = new S23B_AntonioPD_PRA2(20);
        arr.ingresar('a');
        arr.ingresar('b');
        arr.ingresar('c');
        arr.ingresar('d');
        arr.ingresar('e');
        arr.ingresar('e');
        arr.ingresar('u');
        arr.ingresar('e');
        System.out.println(arr.toString());
        System.out.println(arr.espacios());
        arr.consonantes("aeizol");// abcdeeuezl
        System.out.println(arr.toString());
        System.out.println(arr.insertarConsonantes('k'));
        System.out.println(arr.elementos());//11
        System.out.println(arr.espaciosDisponibles());//9
        arr.remplazar('b', 'Z');
        System.out.println(arr.toString());
        System.out.println((char)arr.buscar(2));
        System.out.println((char)arr.buscar(30));
        System.out.println(arr.buscarCoincidencias('e'));
        System.out.println(arr.indexDelCaracter('u'));
        System.out.println(arr.indexDelCaracter('X'));
        System.out.println(arr.toString());
    }
}
