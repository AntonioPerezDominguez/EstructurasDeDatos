/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosRecursivos;

import LibroPractica.*;
import java.util.Random;

/**
 *
 * @author Antonio
 */
public class S23B_AntonioPD_TDALibros {
    private S23B_AntonioPD_PracticaLibro[] arr;
    private int index;
    int max,pos,ind=0;

    public S23B_AntonioPD_TDALibros(int size) {
        this.index = 0;
        this.arr= new S23B_AntonioPD_PracticaLibro[size];
    }
    public void add(S23B_AntonioPD_PracticaLibro b){
        if(index<arr.length)arr[index++]=b;
        else extend(b,0);
    }
    public boolean empty(){
        return index==0;
    }
    public boolean full(){
        return index==arr.length;
    }
    public S23B_AntonioPD_PracticaLibro max(int w){
        if(w==0){
            max=-1;
            pos=0;
        }
        if(w<index){
            if(arr[w].getPag()>max){
                pos=w;
                max=arr[w].getPag();
            }
            max(w+1);
        }
        return arr[pos];
        
    }
    public S23B_AntonioPD_PracticaLibro min(int w){
        if(w==0){
            max=1000000;
            pos=0;
        }
        if(w<index){
            if(arr[w].getPag()<max){
                pos=w;
                max=arr[w].getPag();
            }
            min(w+1);
        }
        return arr[pos];
    }
    public S23B_AntonioPD_PracticaLibro[] sameEdit(String edit, int w){
        if(w==0){
            if(w<index){
                if(arr[w].getEditorial().equals(edit))ind++;
                sameEdit(edit,w+1);
            }
            w=0;
        }
        S23B_AntonioPD_PracticaLibro[] x = new S23B_AntonioPD_PracticaLibro[ind];
        ind=0;
        if(w<index){
            if(arr[w].getEditorial().equals(edit))x[ind++]=arr[w];
            sameEdit(edit,w+1);
        }   
        return x;
    }
    public S23B_AntonioPD_PracticaLibro lastOne(int w){// max=-1
        if(w==0){
            max=-1;
            pos=0;
        }
        if(w<index){
            if(arr[w].getYear()>max){
                max=arr[w].getYear();
                pos=w;
            }
            lastOne(w+1);
        }   
        return arr[pos];
    }
    public S23B_AntonioPD_PracticaLibro firstOne(int w){// max=10000
        if(w==0){
            max=1000000;
            pos=0;
        }
        if(w<index){
            if(arr[w].getYear()<max){
                max=arr[w].getYear();
                pos=w;
            }
            firstOne(w+1);
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
    public S23B_AntonioPD_PracticaLibro[] tittleLike(String x){// péndiente
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
    public S23B_AntonioPD_PracticaLibro edito(String x,int w){// max-1
        if(w==0){
            max=100000;
        }
        if(w<index){
            if(arr[w].getEditorial().equals(x)&&w<max){
                max=w;
            }
            edito(x,w+1);
        }
        if(max>=0)return arr[max];
        return null;
    }
    S23B_AntonioPD_PracticaLibro[] x;
    /// 
    public void extend(S23B_AntonioPD_PracticaLibro ob,int w){
        if(w==0){
            x=new S23B_AntonioPD_PracticaLibro[arr.length+2];
        }
        if(w<index){
            x[w]=arr[w];
            extend(ob,w+1);
        }
        else{
            x[index++]=ob;
            this.arr=x;
        }
    }
    
    
    
}
