/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Antonio
 */
public class S23B_AntonioPD_PRA2 {
    private char[]arr;
    private int index;

    public S23B_AntonioPD_PRA2(int z) {
        this.arr = new char[z];
        this.index=0;
    }
    public void ingresar(int v){
        if(index<50)arr[index++]=(char)v;
        else System.out.println("Limite exedido");
    }
    public String toString(){
        String x="";
        for(int i=0; i<index; i++){
             x += arr[i] + ", ";
        }
        return x;
    }
    public boolean espacios(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)return true;
        }
        return false;
    }
    public boolean consonantes(String x){//aeizol
        boolean flag=false;
        String s=x.toLowerCase();
        for(int i=0;i<s.length();i++){
            String c=s.charAt(i)+"";
            if(c.matches("[bcdfghjklmnpqrstvwxyz]")){
                if(espacios()){
                    for(int j=0;j<arr.length;j++){
                        if(arr[j]==0){
                            arr[j]=x.charAt(i);
                            index++;
                            break;
                        }
                    }
                    flag=true;
                }
            }
        }
        return flag;
    }
    public boolean insertarConsonantes(char c){
        return consonantes(c+"");
    }
    public int elementos(){
        return index;
    }
    public int espaciosDisponibles(){
        return arr.length-index;
    }
    public String vocal(char c){
        String s=c+"";
        if(s.matches("[aeiou]")){
            String sal="";
            for(int i=0;i<index;i++){
                String con=arr[i]+"";
                if(con.matches("[bcdfghjklmnpqrstvwxyz]"))sal+=(con+s)+"\n";
            }
            return sal;
        }
        return "no es vocal\n";
    }
    public void remplazar(char x, char y){
        for(int i=0;i<index;i++){
            if(arr[i]==x){
                arr[i]=y;
                return;
            }
        }
    }
    public int buscar(int ind){
        if(ind>=0&&ind<arr.length)return (char)arr[ind];
        return -1;
    }
    public int buscarCoincidencias(char c){
        int cont=0;
        for(int i=0;i<index;i++){
            if(arr[i]==c)cont++;
        }
        return cont;
    }
    public int indexDelCaracter(char c){
        for(int i=0;i<index;i++){
            if(arr[i]==c)return i;
        }
        return -3;
    }

    public char[] getArr() {
        return arr;
    }

    public void setArr(char[] arr) {
        this.arr = arr;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
