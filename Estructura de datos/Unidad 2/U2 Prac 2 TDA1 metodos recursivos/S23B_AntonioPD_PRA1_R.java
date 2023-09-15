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
public class S23B_AntonioPD_PRA1_R {
    private int[]tda1;//codigo para insertar
    private int index;
    double sum;
    String x;
    int cont,m;
    boolean f;
    private int[]exT;
    
    // constructor sobrecargado
    public S23B_AntonioPD_PRA1_R(int size){
        this.tda1=new int[10];
        this.index=0;
    }
    public boolean full(){
        return index==tda1.length;
    }
    // metod ingresar
    public void ingresar(int v){
        if(index<tda1.length)tda1[index++]=v;
        else {
            f=false;
            extend(v,0);
        }
    }
    // toostring recursivo
    public String toStringR(int a){
        if(a==0)x="";
        if(a<index){
            x += (char)tda1[a] + ", ";
            toStringR(a+1);
        }           
        return x;
    }
   
    public boolean buscarR(int ind,int b){
        return(ind<index&&ind>=0&&tda1[ind]!=0);
    }
    // conteo recursivo
    public int conteoR(int a,int b){
        if(a==0)cont=0;
        if(a<index){
           if(tda1[a]==b)cont++;
        }
        return cont;
    }
    // maximo recursivos
    public int maximoR(int b){
        if(b==0)m=-1;
        if(b<index){
            if(tda1[b]>m)m=tda1[b];
            maximoR(b+1);
        }
        return m;
    }
    // minimo recursivo
    public int minimoR(int b){
        if(b==0)m=100000;
        if(b<index){
            if(tda1[b]<m)m=tda1[b];
            minimoR(b+1);
        }
        return m;
    }
    // suma recursivo
    
    public double sumaR(int b){
        if(b==0)sum=0;
        if(b<index){
            sum+=(tda1[b]);
            sumaR(b+1);
        }
        return sum;
    }
    // promedioR
    public double promedioR(int b){
        if(b==0)sum=0;
        if(b<index){
            sum+=(tda1[b]);
            sumaR(b+1);
        }
        return sum/index;
    }
    /*
    public void extend(S23B_AntonioPD_Examen_Empleado ob){
        S23B_AntonioPD_Examen_Empleado [] ci= new S23B_AntonioPD_Examen_Empleado[arr.length+2];
        for(int i=0;i<index;i++){
            ci[i]=arr[i];
        }
        ci[index++]=ob;
        this.arr=ci;
    }
    */
    public void extend(int n, int b){
        if(!f){
            exT=new int[tda1.length+2];
            f=true;
        }
        if(b<index){
            exT[b]=tda1[b];
            extend(n,b+1);
        }
        else {
            exT[index++]=n; 
            this.tda1=exT;
        }
        
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
// extend, lleno, hay valor en un index
/*
public int buscarV(int x){
        if(x>=0&&x<index){
            for(int i=0;i<index;i++){
                if(tda1[x]!=0)return tda1[x];
            }
        }
        return -999;
    }
*/
