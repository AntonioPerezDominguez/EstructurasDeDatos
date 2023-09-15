package ejerciciosRecursivos;

import java.util.Scanner;



public class Pila {
    
    int pila[],aux[];
    int index;
    
    public Pila(int n){
        pila= new int[n];
        index=0;
    }
    
    public boolean empty(){
        return index==0;
    }
    
    public boolean full(){
        return index==pila.length;
    }
    
    public void push(int x){//Ingresa Valores
        if(!full())
            pila[index++]=x;
        else extend(x);
        print(0);
        System.out.println("Disponible: "+available());
    }
    
    public void extend(int x){
        aux=new int[pila.length+5];
        pasarDatos(0);
        aux[index++]=x;
        this.pila=aux;
    }
    public void pasarDatos(int w){
        if(w<index){
            aux[w]=pila[w];
            pasarDatos(w+1);
        }
    }
    public int pop(){  //eliminar el УКltimo de la pila
        if(empty()){
            System.out.println("NADA");
            return -1;
        }else{
            int aux=pila[index-1];
            index--;
            print(0);
            System.out.println("DISPONIBLE: "+available());
            return aux;
        }
        
    }
    
    public int peek(){ // mostrar el  último
        int b =-1;
        if(!empty())
        b=pila[index-1];
        return b;
    }
    
    public void print(int w){ //convertir a toString
        if(w<index){
            print(w+1);
            System.out.println(pila[w]);
        }
    }
    int ind=-1;
    public int getIndex(int b,int w){
        if(w<index){
            getIndex(b,w+1);
            if(pila[w]==b)ind=w;
        }
        return ind;
        
    }
   
    public int available(){ //posiciones disponibles
        return pila.length-index;
    }
    
    
    public void evaluate(int num){ //Evalua si la condición se cumple para ingresar los npumeros a la pila           
        if(empty()){
           push(num);
        }else if(pila[this.index-1]<num){                  
           push(num);   
        }
    }

    public int[] getPila() {
        return pila;
    }

    public void setPila(int[] pila) {
        this.pila = pila;
    }

    public int[] getAux() {
        return aux;
    }

    public void setAux(int[] aux) {
        this.aux = aux;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Pila(int[] pila, int[] aux, int index) {
        this.pila = pila;
        this.aux = aux;
        this.index = index;
    }
    
}



