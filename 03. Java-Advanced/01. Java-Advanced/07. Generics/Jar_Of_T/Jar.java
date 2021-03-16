package Jar_Of_T;

import java.util.ArrayDeque;

class Jar<T> {
    private ArrayDeque<T> items;

    public Jar() {
        this.items = new ArrayDeque<>();
    }

    public void add(T element) {
        this.items.push(element);
    }

    public T remove() {
        return this.items.pop();
    }
}
