package ListyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class ListyIterator implements Iterable<String>{
    private List<String> list;
    private int currentIndex = 0;

    public ListyIterator(String... strings) {
        this.list = Arrays.asList(strings);
    }

    public boolean move() {
        if (this.currentIndex < list.size() - 1) {
            this.currentIndex++;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasNext() {
        return this.currentIndex + 1 < list.size();
    }

    public void print() {
        try {
            System.out.println(list.get(currentIndex));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Invalid Operation!");
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return this.currentIndex < list.size();
            }

            @Override
            public String next() {
                return list.get(this.currentIndex++);
            }
        };
    }
}
