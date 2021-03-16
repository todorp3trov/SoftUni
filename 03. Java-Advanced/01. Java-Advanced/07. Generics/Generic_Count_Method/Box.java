package Generic_Count_Method;

import java.util.ArrayList;
import java.util.List;

class Box<T extends Comparable<T>> {
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public int countGreater(T element) {
        int count = 0;
        for (T el : this.elements) {
            if (element.compareTo(el) < 0) {
                count++;
            }
        }
        return count;
    }
}
