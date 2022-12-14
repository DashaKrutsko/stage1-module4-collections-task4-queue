package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {

    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> listOfDishes = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int i = 1;
        while (queue.size() != 0) {
            Iterator<Integer> it = queue.iterator();
            while (it.hasNext()) {
                boolean selected = (i % everyDishNumberToEat == 0);
                Integer elem = it.next();
                if (selected) {
                    listOfDishes.add(elem);
                    it.remove();
                }
                i++;
            }
        }
        return listOfDishes;
    }
}
