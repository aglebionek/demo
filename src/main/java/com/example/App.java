package com.example;

public class App {
    public static void main(String[] args) {
        SimpleWzimBoundedQueue<String> queue = new SimpleWzimBoundedQueue<String>(10);
        //queue.element();
        queue.add("Hello");
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }
}
