package com.courses.spalah.list;

/**
 * Created by Администратор on 20.03.2016.
 */
public class MyLinkedList<E> implements MyList<E> {
    private int size;
    private int index;
    private Node<E> first;
    private Node<E> last;
    private Node<E> current;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean add(E element) {
        Node<E> newNode = new Node<>(element, null);
        last.setNext(newNode);
        last = newNode;
        size++;
        return true;
    }

    @Override
    public void add(int index, E element) {
        Node<E> newNode = new Node<>(element, null);
        Node<E> current = first;
        for(int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
    }
}
