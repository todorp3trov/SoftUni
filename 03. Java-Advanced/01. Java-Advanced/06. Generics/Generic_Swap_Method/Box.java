package Generic_Swap_Method;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public void swap(int i, int j) {
        T temp = this.elements.get(i);
        this.elements.set(i, this.elements.get(j));
        this.elements.set(j, temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T element : this.elements) {
            sb.append(String.format("%s: %s\n", element.getClass().getName(), element));
        }

        return sb.toString();
    }
}
