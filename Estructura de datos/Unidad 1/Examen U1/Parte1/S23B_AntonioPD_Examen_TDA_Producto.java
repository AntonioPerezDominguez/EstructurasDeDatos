/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author Antonio
 */
public class S23B_AntonioPD_Examen_TDA_Producto {
    private S23B_AntonioPD_Examen_Producto [] arr;
    private int index;

    public S23B_AntonioPD_Examen_TDA_Producto(int size) {
        this.arr= new S23B_AntonioPD_Examen_Producto[size];
        this.index=0;
    }
    public void add(S23B_AntonioPD_Examen_Producto b){
   
    }
    public boolean empty(){
        return index==0;
    }
    public boolean full(){
        return index==arr.length;
    }
    public S23B_AntonioPD_Examen_Producto[] buscaXCateg(String x){
        return arr;
    }
    public S23B_AntonioPD_Examen_Producto max(){
        return null;
    }
    public String buscarXnombre(String n){
        return "";
    }
    public String buscarXclave(String n){
        return "";
    }
    public S23B_AntonioPD_Examen_Producto min(){
        return null;
    }
    public double promedioPrecio(){
        return 0.0;
    }

    public S23B_AntonioPD_Examen_Producto[] getArr() {
        return arr;
    }

    public void setArr(S23B_AntonioPD_Examen_Producto[] arr) {
        this.arr = arr;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public void extend(S23B_AntonioPD_Examen_TDA_Producto ob){
        
    }
    
    
    
    
    
    
    
    
}
