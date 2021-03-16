import java.util.function.Consumer;

public class SmartArray {
    private int[] elements;
    private int size;

    public SmartArray() {
        this.elements = new int[4];
    }

    public void add(int element) {
        if (this.size == this.elements.length) {
            this.elements = grow();
        }

        this.elements[this.size++] = element;
    }

    private int[] grow() {
        int[] newArray = new int[this.size * 2];
        System.arraycopy(this.elements, 0, newArray, 0, this.size);
        return newArray;
    }

    public int get(int index) {
        validateIndex(index);
        return this.elements[index];
    }

    public int remove(int index) {
        validateIndex(index);

        int element = this.elements[index];

        System.arraycopy(this.elements, index + 1, this.elements, index, this.size - 1 - index);

        this.elements[this.size - 1] = 0;

        this.size--;

        if (this.size > 4 && this.size == this.elements.length / 4) {
            this.elements = shrink();
        }

        return element;
    }

    private int[] shrink() {
        int[] newArray = new int[this.size];
        System.arraycopy(this.elements, 0, newArray, 0, this.size);
        return newArray;
    }

    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void add(int index, int element) {
        validateIndex(index);

        int lastElement = this.elements[this.size - 1];

        System.arraycopy(this.elements, index, this.elements, index + 1, this.size - 1 - index);

        this.elements[index] = element;

        this.add(lastElement);
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.elements[i]);
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + this.size);
        }
    }
}
