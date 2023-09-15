/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author Microcomputadoras-I
 */
public class S23B_AntonioPD_Examen_TDA_Empleado {
    S23B_AntonioPD_Examen_Empleado [] arr;
    private int index;

    public S23B_AntonioPD_Examen_TDA_Empleado(int size) {
        this.arr = new S23B_AntonioPD_Examen_Empleado[size];
        this.index = 0;
    }
    public boolean empty(){
        return index==0;
    }
    public boolean full(){
        return index==arr.length;
    }
    public void add(S23B_AntonioPD_Examen_Empleado b){
        if(index<arr.length)arr[index++]=b;
        else extend(0,b);
        
    }
    int pos,max;
    public S23B_AntonioPD_Examen_Empleado max(int w){// ya
        if(empty())return null;
        else{
            if(w<index){
                if(w==0){
                    pos=0;
                    max=-1;
                }
                if(arr[w].getAge()>max){
                        max=arr[w].getAge();
                        pos=w;
                 }
                max(w+1);
            }
        }
        return arr[pos];
    }
    public S23B_AntonioPD_Examen_Empleado min(int w){// ya
        if(empty())return null;
        else{
            if(w<index){
                if(w==0){
                    pos=0;
                    max=100000;
                }
                if(arr[w].getAge()<max){
                        max=arr[w].getAge();
                        pos=w;
                 }
                min(w+1);
            }
        }
        return arr[pos];
    }
    public int recorrer(int w,String city){
        if(w==0)pos=0;
        if(w<index){
            if(arr[w].getCity().equals(city)){
                    pos++;
            }
            recorrer(w+1,city);
        }
        return pos;
    }
    S23B_AntonioPD_Examen_Empleado [] ci;
    public S23B_AntonioPD_Examen_Empleado[] mismaCiudad(int w,String city){// ya
        if(empty())return null;
        else{
            
            if(w==0){
                ci= new S23B_AntonioPD_Examen_Empleado[recorrer(0,city)];
                pos=0;
            }
            if(w<index){
                if(arr[w].getCity().equals(city)){
                    ci[pos++]=arr[w];
                }
                mismaCiudad(w+1,city);
            }
        }
        return ci;
    }
    // mismodepto
    public int recorre(int w,String city){
        if(w==0)pos=0;
        if(w<index){
            if(arr[w].getDepto().equals(city)){
               pos++;
            }
            recorre(w+1,city);
        }
        return pos;
    }
    public S23B_AntonioPD_Examen_Empleado[] mismodepto(int w,String city){// ya
        if(empty())return null;
        else{
            if(w==0){
                ci= new S23B_AntonioPD_Examen_Empleado[recorre(0,city)];
                pos=0;
            }
            if(w<index){
                if(arr[w].getDepto().equals(city)){
                    ci[pos++]=arr[w];
                }
                mismodepto(w+1,city);
            }
        }
        return ci;
    }
    public S23B_AntonioPD_Examen_Empleado antiguo(int w){// ya
        if(empty())return null;
        else{
            if(w<index){
                if(w==0){
                    pos=0;
                    max=100000;
                }
                if(arr[w].getYearStart()<max){
                        max=arr[w].getYearStart();
                        pos=w;
                 }
                antiguo(w+1);
            }
        }
        return arr[pos];
    }
    public String buscar(int w,String na){// ya
        if(empty())return "";
        else{
            if(w<index){
                if(arr[w].getName().equals(na))return na;
            }
            buscar(w+1,na);
        } 
        return "";
    }
    public S23B_AntonioPD_Examen_Empleado bucar(int w,String na){// ya
        if(empty())return null;
        else{
            if(w<index){
                if(arr[w].getName().equals(na))return arr[w];
            }
            buscar(w+1,na);
        }
        return null;
    }
    public void extend(int w,S23B_AntonioPD_Examen_Empleado ob){// ya
        if(w==0)ci= new S23B_AntonioPD_Examen_Empleado[arr.length+2];
        if(w<index){
            ci[w]=arr[w];
            extend(w+1,ob);
        }
        else{
            ci[index++]=ob;
            this.arr=ci;
        }
    }
    
    
}
