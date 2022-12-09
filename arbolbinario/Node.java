package com.mycompany.arbolbinario;

/**
 *
 * @author hheri
 * @param <T>
 */
public class Node<T> {
    private T value;
    Node left;
    Node right;
    
    public Node ( T v ) {
        this.value = v;
        this.left = null;
        this.right = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    
    
}
