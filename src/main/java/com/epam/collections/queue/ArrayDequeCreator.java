package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public static void main(String[] args) {
        createArrayDeque(new LinkedList<>(List.of(1, 3, 5, 4, 7, 9)), new LinkedList<>(List.of(4, 2, 8, 5, 8, 3)));
    }

    public static void addElements(ArrayDeque<Integer> arrayDeque, Queue<Integer> queue, int count) {
        for (int i = 0; i < count; i++) {
            arrayDeque.add(queue.poll());
        }
    }

    public static void addAndRemoveElements(ArrayDeque<Integer> arrayDeque, Queue<Integer> queue) {
        queue.add(arrayDeque.pollLast());
        addElements(arrayDeque, queue, 2);
    }

    public static ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        addElements(arrayDeque, firstQueue, 2);
        addElements(arrayDeque, secondQueue, 2);
        while (firstQueue.size() > 0 && secondQueue.size() > 0) {
            addAndRemoveElements(arrayDeque, firstQueue);
            addAndRemoveElements(arrayDeque, secondQueue);
        }
        System.out.println(arrayDeque);
        return arrayDeque;
    }
}
