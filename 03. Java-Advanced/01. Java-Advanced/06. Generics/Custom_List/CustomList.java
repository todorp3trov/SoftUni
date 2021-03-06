package Custom_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CustomList<T extends Comparable<T>> implements Iterable<T>{
    private List<T> customList;

    public CustomList() {
        this.customList = new ArrayList<>();
    }

    public void add(T element) {
        this.customList.add(element);
    }

    public void remove(int index) {
        validateIndex(index);
        this.customList.remove(index);
    }

    public T get(int index) {
        validateIndex(index);
        return this.customList.get(index);
    }

    public boolean contains(T element) {
        return this.customList.contains(element);
    }

    public void swap(int index, int index2) {
        validateIndex(index);
        validateIndex(index2);
        T temp = this.customList.get(index);
        this.customList.set(index, this.customList.get(index2));
        this.customList.set(index2, temp);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T e : this.customList) {
            if (element.compareTo(e) < 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        return customList.stream()
                .max(Comparable::compareTo)
                .orElseThrow(IllegalStateException::new);
    }

    public T getMin() {
        return customList.stream()
                .min(Comparable::compareTo)
                .orElseThrow(IllegalStateException::new);
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= this.customList.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public int size() {
        return this.customList.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < customList.size() && customList.get(currentIndex) != null;
            }

            @Override
            public T next() {
                return customList.get(currentIndex++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : this.customList) {
            sb.append(element).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
