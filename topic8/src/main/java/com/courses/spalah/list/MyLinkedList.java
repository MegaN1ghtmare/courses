package com.courses.spalah.list;

import java.util.Iterator;

/**
 * Created by Администратор on 20.03.2016.
 */
public class MyLinkedList<E> implements MyList<E> {
    private Node<E> first;
    private int size;

    public MyLinkedList() {
        first = new Node<>(null);
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
        Node<E> temp = new Node<>(element);
        Node<E> current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        size += 1;
        return true;
    }

    @Override
    public void add(int index, E element) {
        Node<E> temp = new Node<>(element);
        Node<E> current = first;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        size += 1;
    }

    @Override
    public void remove(int index) {
        if (index < 1 || index > size()) return;
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null) return;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size -= 1;
    }

    @Override
    public E get(int index) {
        if (index <= 0) return null;
        Node<E> current = first.getNext();
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null) return null;
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public E set(int index, E element) {
        Node<E> current = first;
        for (int i = 0; i < index; i++) current = current.getNext();
        current.setValue(element);
        return current.getValue();
    }

    @Override
    public boolean contains(E element) {
        Node<E> current = first;
        while (current.getNext() != null) {
            current = current.getNext();
            if (current.getValue().equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

}
