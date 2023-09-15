package ejerciciosRecursivos;


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
        S23B_AntonioPD_PRA1_R arr = new S23B_AntonioPD_PRA1_R(5);
        arr.ingresar(65);
        arr.ingresar(65);
        arr.ingresar(65);
        arr.ingresar(66);
        arr.ingresar(67);
        arr.ingresar(66);
        arr.ingresar(66);
        arr.ingresar(66);
        arr.ingresar(66);
        arr.ingresar(67);
        arr.ingresar(67);
        arr.ingresar(67);
        arr.ingresar(67);
        arr.ingresar(67);
        arr.ingresar(67);
        arr.ingresar(67);
        System.out.println(arr.toStringR(0));
        System.out.println(arr.conteoR(0,65));
        System.out.println(arr.maximoR(0));
        System.out.println(arr.minimoR(0));
        System.out.println(arr.buscarR(65, 0));
        System.out.println(arr.sumaR(0));
       System.out.println(arr.promedioR(0));
    }
}
