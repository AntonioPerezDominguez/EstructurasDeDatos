/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroPractica;

import java.util.Arrays;

/**
 *
 * @author Microcomputadoras-I
 */
public class main {
    public static void main(String[] args) {
        S23B_AntonioPD_PracticaLibro book = new S23B_AntonioPD_PracticaLibro("Padre rico Padre pobre","Robert kiyosaki","mazda",233,2010);
        S23B_AntonioPD_PracticaLibro book1 = new S23B_AntonioPD_PracticaLibro("Los secretos de la mente millonaria","T. harv Eker","toyota",243,2011);
        S23B_AntonioPD_PracticaLibro book2 = new S23B_AntonioPD_PracticaLibro("El millorario de la puerta de a lado","Thomas J. Stanley","nose",501,1800);
        S23B_AntonioPD_PracticaLibro book3 = new S23B_AntonioPD_PracticaLibro("Piense y hagase rico","Napoleon hill","toyota",300,1900);
        S23B_AntonioPD_PracticaLibro book4 = new S23B_AntonioPD_PracticaLibro("Millonarios","desconocido","toyota",126,1901);
        
        
        S23B_AntonioPD_TDALibros libros= new S23B_AntonioPD_TDALibros(10);
        System.out.println("add");
        libros.add(book);
        libros.add(book1);
        libros.add(book2);
        libros.add(book3);
        libros.add(book4);
        
        System.out.println(book);
        System.out.println("empty: "+libros.empty());
        System.out.println("full: "+libros.full());
        System.err.println("max: "+libros.max());
        System.out.println("min: "+libros.min());
        System.out.println("sameEdit:");
        for (S23B_AntonioPD_PracticaLibro x: libros.sameEdit("toyota")){
            System.out.println(x);
        }       
        System.out.println("lastone: "+libros.lastOne());
        System.out.println("firstone: "+libros.firstOne());
        System.out.println("titleLike:");
        for (S23B_AntonioPD_PracticaLibro x: libros.tittleLike("rico")){
            System.out.println(x);
        }
        System.out.println("editotal: "+libros.edito("nose"));
        
        //System.out.println(Arrays.toString(libros.tittleLike("toyota")));
    }
}
