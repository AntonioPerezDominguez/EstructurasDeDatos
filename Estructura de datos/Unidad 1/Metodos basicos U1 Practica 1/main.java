/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class main {
    public static void main(String[] args) {
        S23B_AntonioPD_PRA1 arr = new S23B_AntonioPD_PRA1(5);
        arr.ingresar(65);
        arr.ingresar(65);
        arr.ingresar(65);
        arr.ingresar(66);
        arr.ingresar(66);
        arr.ingresar(67);
        System.out.println(arr.toString());
        System.out.println(arr.conteo(65));
        System.out.println(arr.buscarV(66));
        System.out.println(arr.buscarV(66));
        System.out.println(arr.buscarV(3));
        System.out.println(arr.maximo());
        System.out.println(arr.minimo());
        System.out.println(arr.sumar());
        System.out.println(arr.promedio());
        System.out.println(arr.concatenacion());
    }
}
