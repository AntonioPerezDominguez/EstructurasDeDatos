/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

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
        else extend(b);
        
    }
    public S23B_AntonioPD_Examen_Empleado max(){
        int pos=0;
        if(empty())return null;
        else{
            int max=-1;
            for(int i=0;i<index;i++){
                if(arr[i].getAge()>max){
                    max=arr[i].getAge();
                    pos=i;
                }
            }
            return arr[pos];
        }
    }
    public S23B_AntonioPD_Examen_Empleado min(){
        int pos=0;
        if(empty())return null;
        else{
            int max=100000;
            for(int i=0;i<index;i++){
                if(arr[i].getAge()<max){
                    max=arr[i].getAge();
                    pos=i;
                }
            }
            return arr[pos];
        }
    }
    public S23B_AntonioPD_Examen_Empleado[] mismaCiudad(String city){
        if(empty())return null;
        else{
            int ind=0;
            for(int i=0;i<index;i++){
                if(arr[i].getCity().equals(city)){
                    ind++;
                }
            }
            S23B_AntonioPD_Examen_Empleado [] ci= new S23B_AntonioPD_Examen_Empleado[ind];
            ind=0;
            for(int i=0;i<index;i++){
                if(arr[i].getCity().equals(city)){
                    ci[ind++]=arr[i];
                }
            }
            return ci;
        }
    }
    public S23B_AntonioPD_Examen_Empleado[] mismodepto(String city){
        if(empty())return null;
        else{
            int ind=0;
            for(int i=0;i<index;i++){
                if(arr[i].getDepto().equals(city)){
                    ind++;
                }
            }
            S23B_AntonioPD_Examen_Empleado [] ci= new S23B_AntonioPD_Examen_Empleado[ind];
            ind=0;
            for(int i=0;i<index;i++){
                if(arr[i].getDepto().equals(city)){
                    ci[ind++]=arr[i];
                }
            }
            return ci;
        }
    }
    public S23B_AntonioPD_Examen_Empleado antiguo(){
        int pos=0;
        if(empty())return null;
        else{
            int max=100000;
            for(int i=0;i<index;i++){
                if(arr[i].getYearStart()<max){
                    max=arr[i].getYearStart();
                    pos=i;
                }
            }
            return arr[pos];
        }
    }
    public String buscar(String na){
        if(empty())return "";
        else{
            for(int i=0;i<index;i++){
                if(arr[i].getName().equals(na))return na;
            }
        } 
        return "";
    }
    public S23B_AntonioPD_Examen_Empleado bucar(String na){
        if(empty())return null;
        else{
            for(int i=0;i<index;i++){
                if(arr[i].getName().equals(na))return arr[i];
            }
        }
        return null;
    }
    public void extend(S23B_AntonioPD_Examen_Empleado ob){
        S23B_AntonioPD_Examen_Empleado [] ci= new S23B_AntonioPD_Examen_Empleado[arr.length+2];
        for(int i=0;i<index;i++){
            ci[i]=arr[i];
        }
        ci[index++]=ob;
        this.arr=ci;
    }
    
    
}
