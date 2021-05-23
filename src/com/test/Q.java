package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            q.offer(i);
        }
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
/*

offer() - вставляет элемент в конец очереди, или возвращает false
peek() - возвращает первый элемент в очереди без извлечения, если очередь пустая, то возвращает null
element() - возвращает первый элемент в очереди без извлечения, если очередь пустая, то выдает NoSuchElementException
poll() - извлекает и возвращает первый элемент в очереди, если очередь пустая, то возвращает null
remove - извлекает и возвращает первый элемент в очереди, если очередь пустая, NoSuchElementException


    */
