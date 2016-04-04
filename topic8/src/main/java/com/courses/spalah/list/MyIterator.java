package com.courses.spalah.list;

import java.util.Iterator;

/**
 * Created by Администратор on 24.03.2016.
 */
public class MyIterator<E> implements Iterator<E> {
    private Node<E> next;
    private Node<E> first;

    public MyIterator() {
        next = first;
    }

    @Override
    public E next() {
        E result = next.getValue();
        next = next.getNext();
        return result;
    }

    @Override
    public boolean hasNext() {
       return next.getNext() != null;
    }

}
