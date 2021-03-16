package Stack_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CustomStack implements Iterable<Integer> {
    private List<Integer> stack;

    public CustomStack() {
        this.stack = new ArrayList<>();
    }

    public void push(int element) {
        this.stack.add(element);
    }

    public void pop() {
        if (this.stack.size() == 0) {
            System.out.println("No elements");
        } else {
            int element = this.stack.get(this.stack.size() - 1);
            this.stack.remove(this.stack.size() - 1);
        }
    }

    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int currentIndex = stack.size() - 1;
            @Override
            public boolean hasNext() {
                return this.currentIndex >= 0;
            }

            @Override
            public Integer next() {
                return stack.get(currentIndex--);
            }
        };
    }
}
