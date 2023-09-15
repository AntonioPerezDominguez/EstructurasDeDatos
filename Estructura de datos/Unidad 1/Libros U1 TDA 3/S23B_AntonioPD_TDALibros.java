/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroPractica;

import java.util.Random;

/**
 *
 * @author Antonio
 */
public class S23B_AntonioPD_TDALibros {
    private S23B_AntonioPD_PracticaLibro[] arr;
    private int index;

    public S23B_AntonioPD_TDALibros(int size) {
        this.index = 0;
        this.arr= new S23B_AntonioPD_PracticaLibro[size];
    }
    public void add(S23B_AntonioPD_PracticaLibro b){
        if(index<arr.length)arr[index++]=b;
    }
    public boolean empty(){
        return index==0;
    }
    public boolean full(){
        return index==arr.length;
    }
    public S23B_AntonioPD_PracticaLibro max(){
        int max=-1,pos=0;
        for(int i=0;i<index;i++){
            if(arr[i].getPag()>max){
                pos=i;
                max=arr[i].getPag();
            }
        }
        return arr[pos];
    }
    public S23B_AntonioPD_PracticaLibro min(){
        int min=1000000,pos=0;
        for(int i=0;i<index;i++){
            if(arr[i].getPag()<min){
                pos=i;
                min=arr[i].getPag();
            }
        }
        return arr[pos];
    }
    public S23B_AntonioPD_PracticaLibro[] sameEdit(String edit){
        int ind=0;
        for(int i=0;i<index;i++){
            if(arr[i].getEditorial().equals(edit))ind++;
        }
        S23B_AntonioPD_PracticaLibro[] x = new S23B_AntonioPD_PracticaLibro[ind];
        ind=0;
        for(int i=0;i<index;i++){
            if(arr[i].getEditorial().equals(edit))x[ind++]=arr[i];
        }    
        return x;
    }
    public S23B_AntonioPD_PracticaLibro lastOne(){
        int d=-1,pos=0;
        for(int i=0;i<index;i++){
            if(arr[i].getYear()>d){
                d=arr[i].getYear();
                pos=i;
            }
        }
        return arr[pos];
    }
    public S23B_AntonioPD_PracticaLibro firstOne(){
        int d=100000,pos=0;
        for(int i=0;i<index;i++){
            if(arr[i].getYear()<d){
                d=arr[i].getYear();
                pos=i;
            }
        }
        return arr[pos];
    }

    public S23B_AntonioPD_PracticaLibro[] getArr() {
        return arr;
    }

    public void setArr(S23B_AntonioPD_PracticaLibro[] arr) {
        this.arr = arr;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public S23B_AntonioPD_PracticaLibro[] tittleLike(String x){
        int ind=0;
        for(int i=0;i<index;i++){
            if(arr[i].getTitulo().contains(x))ind++;
        }
        S23B_AntonioPD_PracticaLibro[] b = new S23B_AntonioPD_PracticaLibro[ind];
        ind=0;
        for(int i=0;i<index;i++){
            if(arr[i].getTitulo().contains(x))b[ind++]=arr[i];
        }
        return b;
    }
    public S23B_AntonioPD_PracticaLibro edito(String x){
        int pos=-1;
        for(int i=0;i<index;i++){
            if(arr[i].getEditorial().equals(x)){
                pos=i;
                break;
            }
        }
        if(pos>=0)return arr[pos];
        return null;
    }
    
    
    
}
