package com.courses.spalah.list;

/**
 * Created by Администратор on 20.03.2016.
 */
public class Node<E> {
    private E value;
    private Node<E> next;

    public Node(E value) {
        next = null;
        this.value = value;
    }

    public Node(E value, Node next) {
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}