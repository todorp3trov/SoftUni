package Froggy;

import java.util.Iterator;
import java.util.List;

class Lake implements Iterable<Integer> {
    private List<Integer> lake;

    public Lake(List<Integer> elements) {
        this.lake = elements;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {
        private int currentIndex = 0;
        private final int lastEvenIndex = lake.size() % 2 == 0 ? lake.size() - 2 : lake.size() - 1;

        @Override
        public boolean hasNext() {
            return this.currentIndex < lake.size();
        }

        @Override
        public Integer next() {
            if (this.currentIndex == this.lastEvenIndex) {
                int element = lake.get(this.lastEvenIndex);
                this.currentIndex = 1;
                return element;
            }

            int element = lake.get(this.currentIndex);
            this.currentIndex += 2;
            return element;
        }
    }
}
