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
public class S23B_AntonioPD_Examen_Producto {
    private String clave;
    private String nombre;
    private double precio;
    private String categoria;
    
    
    public String genClave(){
        return "";
    }

    @Override
    public String toString() {
        return "Producto{" + "clave=" + clave + ", nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + '}';
    }

    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
