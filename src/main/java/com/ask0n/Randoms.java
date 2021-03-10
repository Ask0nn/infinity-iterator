package com.ask0n;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    private IntStream random;

    public Randoms(int min, int max) {
        random = new Random().ints(min, max + 1);
    }

    /**
     * Если я поавильно понимаю, то hasNext в данном случае всегда будет true.
     * Так как Random будет выдавать числа всегда.
     */
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.findFirst().getAsInt();
            }
        };
    }
}
