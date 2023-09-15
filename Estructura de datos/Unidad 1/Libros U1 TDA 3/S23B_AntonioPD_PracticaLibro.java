/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroPractica;

/**
 *
 * @author Antonio
 */
public class S23B_AntonioPD_PracticaLibro {
    private String titulo;
    private String isbn;
    private String autor;
    private String editorial;
    private int pag;
    private int year;

    public S23B_AntonioPD_PracticaLibro(String titulo, String autor, String editorial, int pag, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.pag = pag;
        this.year = year;
        this.isbn = generaISBN();
    }

    

    public S23B_AntonioPD_PracticaLibro() {
    }

    @Override
    public String toString() {
        return "S23B_AntonioPD_PracticaLibro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + ", pag=" + pag + ", year=" + year + '}';
    }
    

    
    
    public String generaISBN(){
        String isbN="";
        for(int i=0;i<13;i++){
            int x=(int) (Math.random()*9);
            isbN+=(x+"");
        }
        return isbN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
