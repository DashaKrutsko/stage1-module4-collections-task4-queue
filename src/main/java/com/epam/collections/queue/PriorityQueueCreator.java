package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {

    public PriorityQueue<String> createPriorityQueue (List<String> firstList, List<String> secondList) {
        List<String> newList = new ArrayList<>(firstList);
        newList.addAll(secondList);
        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.addAll(newList);
        return queue;
    }
}
