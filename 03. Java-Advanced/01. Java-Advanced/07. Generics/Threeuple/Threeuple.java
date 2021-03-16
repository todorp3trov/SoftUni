package Threeuple;

class Threeuple<E, R, T> {
    private E item1;
    private R item2;
    private T item3;

    public Threeuple(E item1, R item2, T item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", item1, item2, item3);
    }
}
