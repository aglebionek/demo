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
        return offer(e);
    }

    @Override
    public boolean offer(E e) {
        if (e==null) throw new NullPointerException();
        
        if (currentIndex+1 > queue.length) return false;
        queue[currentIndex] = (E) e;
        currentIndex++;
        return true;
    }

    @Override
    public E remove() {
        if(currentIndex == 0) throw new NoSuchElementException();
        E toReturn = (E) queue[0];
        queue = Arrays.copyOfRange(queue, 1, queue.length);
        return toReturn;
    }

    @Override
    public E poll() {
        if(currentIndex == 0) return null;

        else{
            queue = Arrays.copyOfRange(queue, 1, queue.length);
            return (E) queue[0];
        } 
    }

    @Override
    public E element() {
        if(currentIndex == 0) throw new NoSuchElementException();
        return (E) queue[0];
    }

    @Override
    public E peek() {
        return currentIndex == 0 ? null : (E) queue[0];
    }

    @Override
    public int size() {
        return currentIndex;
    }

    @Override
    public int capacity() {
        return queue.length;
    }


}
