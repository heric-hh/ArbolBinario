package com.mycompany.arbolbinario;

/**
 *
 * @author hheri
 */
public class ArbolBinario {
    Node root = null;
    
    public void add( int valor ) {
        if ( this.root == null )
            this.root = new Node(valor);
        else
            add(this.root, valor);
    }
    
    public void add( Node nodo, int valor ) {
        if ( valor > (Integer) nodo.getValue() ) {
            if ( nodo.getRight() == null ) {
                nodo.setRight(new Node<>(valor));
            } else {
                if ( nodo.getLeft() == null ) {
                    nodo.setLeft( ( new Node<> (valor) ) );
                } else {
                    this.add( nodo.getLeft(), valor );
                }
            }
        }
    }
}
