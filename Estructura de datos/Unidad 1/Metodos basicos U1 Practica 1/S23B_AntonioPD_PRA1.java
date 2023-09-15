/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class S23B_AntonioPD_PRA1 {
    private int[]tda1;//codigo para insertar
    private int index;
    
    // constructor sobrecargado
    public S23B_AntonioPD_PRA1(int size){
        this.tda1=new int[10];
        this.index=0;
    }
    // metod ingresar
    public void ingresar(int v){
        if(index<10)tda1[index++]=v;
        else System.out.println("Limite exedido");
    }
    public String toString(){
        String x="";
        for(int i=0; i<index; i++)
            x += (char)tda1[i] + ", ";
        return x;
    }
    public boolean buscar(int ind){
        if(ind<index&&ind>=0)return true;
        return false;
    }
    public int conteo(int a){
        int cont=0;
        for(int i=0;i<index;i++){
            if(tda1[i]==a)cont++;
        }
        return cont;
    }
    public int maximo(){
        int a=-1;
        for(int i=0;i<index;i++){
            if(tda1[i]>a)a=tda1[i];
        }
        return a;
    }
    public int minimo(){
        int a=100000;
        for(int i=0;i<index;i++){
            if(tda1[i]<a)a=tda1[i];
        }
        return a;
    }
    public int buscarV(int x){
        if(x>=0&&x<index){
            for(int i=0;i<index;i++){
                if(tda1[x]!=0)return tda1[x];
            }
        }
        return -999;
    }
    public int sumar(){
        int a=0;
        for(int i=0;i<index;i++)a+=tda1[i];
        return a;
    }
    public double promedio(){
        return sumar()/(double)index;
    }
    public String concatenacion(){
        String a="";
        for(int i=0;i<index;i++)a+=(char)tda1[i];
        return a;
    }
    public int size(){
        return index;
    }

    public int[] getTda1() {
        return tda1;
    }

    public void setTda1(int[] tda1) {
        this.tda1 = tda1;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
