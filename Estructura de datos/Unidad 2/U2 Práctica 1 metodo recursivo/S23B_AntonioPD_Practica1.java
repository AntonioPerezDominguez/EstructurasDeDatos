package Unidad2;

import java.util.Scanner;

/**
 *
 * @author doc_sistemas_2
 */
public class S23B_AntonioPD_Practica1 {
    String []nombres= new String[10];
     Scanner lector= new Scanner(System.in);   
         int valor=0;
         int val=1;
    
    public void llenar(){//pedir nombres y llenar arreglo
        String name;       
        for (int i = 0; i < nombres.length; i++) {//INSTRUCCI?N ITERATIVA
            name=lector.nextLine();
            nombres[i]=name;
        }//variable de control =  i    manipulaci?n/cambio --> sumando 1
    }//condici?n/l?mite = i<length
    
    public void llenar2(int x){//RECURSIVO
        if(x<5){
           nombres[x++]=lector.nextLine();
           llenar2(x);//Se mnada llamar a s? mismo
        }                
    }
    
    public void imprimir(){
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]+" | ");            
        } 
        System.out.println("");
    }
    
    public void imprimir2(int x){//RECURSIVO
        if(x<5){
            System.out.println(nombres[x++]);
           imprimir2(x);
        }   
    }
    public void busqueda(String x,int pos){//RECURSIVO
        if(pos<nombres.length){
            if(x.equals(nombres[pos])){
                System.out.println("encontrado");
                pos=20;
                return;
            }
            busqueda(x,pos+1);
        }
        else{
            if(pos!=20)System.out.println("no encontrado");
        }
    }
    public void genere(int lim, int cont){
        if(cont<lim){
            System.out.println(val+",");
            if(cont%2==0)val+=2;
            else val--;
            genere(lim,cont+1);
            
        }
    }

    
    /*   TAREA DEL D?A 18 DE FEBRERO
    CREAR  UN M?TODO REC URSIVO QUE REALICE 
    LA BUSQUEDA DE UN NOMBRE EN EL ARREGLO
    IMPRIMIR MENSAJE CONEL ERSULTADO DE LA B?SQUEDA
      */
            
     /*     PR?CTICA DEL D?A 21 DE FEBRERO
            CREAR UN M?TODO RECURSIVO QUE RECIBA UN ENTERO (n)
            Y GENERE n N?MEROS DE UNA SERIE NUM?RICA CON EL 
            PATR?N : 1,3,2,4,3,5,4,6,5,7,6 .....             */ 
    
    
   
            
    public static void main(String[] args) {
        S23B_AntonioPD_Practica1 obj = new S23B_AntonioPD_Practica1();
        //obj.llenar();
        //obj.imprimir();
        obj.llenar2(0);
        obj.imprimir2(0);
        obj.busqueda("antonio", 0);
        obj.genere(10, 0);
        
    }

}