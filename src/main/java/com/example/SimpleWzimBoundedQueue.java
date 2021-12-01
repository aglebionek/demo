package com.example;

import java.util.Arrays;
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
        return true;
    }

    @Override
    public E remove() {
        if(currentIndex == 0) throw new NoSuchElementException();
        E toReturn = (E) queue[0];
        System.arraycopy(queue, 1, queue, 0, queue.length);
        return toReturn;
    }

    @Override
    public E poll() {
        if(currentIndex == 0) return null;

        else{
            System.arraycopy(queue, 1, queue, 0, queue.length);
            return (E) queue[0];
        } 
    }

    @Override
    public E element() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E peek() {
        return (E) queue[0];
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
