package com.example;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class SimpleWzimBoundedQueue<E> implements WzimBoundedQueue<E> {
    Object[] queue;
    int currentIndex = 0;

    // .
    public SimpleWzimBoundedQueue(final int maxCapacity) {
        queue = new Object[maxCapacity];
    }

    @Override
    public boolean add(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean offer(E e) {
        if (e==null) throw new NullPointerException();
        currentIndex++;
        if (currentIndex > queue.length) return false;
        else queue[currentIndex] = (E) e;
    }

    @Override
    public E remove() {
        if(currentIndex == 0) throw new NoSuchElementException();
        E toReturn = (E) queue[0];
        
    }

    @Override
    public E poll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E element() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int capacity() {
        // TODO Auto-generated method stub
        return 0;
    }


}
