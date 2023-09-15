package arbol;

/**
 *
 * @author Antonio
 */
public class Nodo {

    private Nodo nodoizquierdo;
    private Nodo nododerecho;
    private int valor;

   
    public Nodo(int dato) {
        valor = dato;
        nodoizquierdo = null;
        nododerecho = null; 
    }

    public Nodo getNodoizquierdo() {
        return nodoizquierdo;
    }

    public void setNodoizquierdo(Nodo nodoizquierdo) {
        this.nodoizquierdo = nodoizquierdo;
    }

    public Nodo getNododerecho() {
        return nododerecho;
    }

    public void setNododerecho(Nodo nododerecho) {
        this.nododerecho = nododerecho;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    

    
    

} 


//programa para probar la clase arbol



