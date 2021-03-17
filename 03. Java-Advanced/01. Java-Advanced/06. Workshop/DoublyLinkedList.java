import java.util.function.Consumer;

public class DoublyLinkedList {

    private static class Node {
        private int element;
        private Node next;
        private Node prev;

        private Node(int element) {
            this.element = element;
        }
    }

    private Node head;
    private Node tail;
    private int size;


    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (this.head != null) {
            newNode.next = this.head;
            this.head.prev = newNode;
        }
        this.head = newNode;
        if (this.isEmpty()) {
            this.tail = this.head;
        }
        this.size++;
    }

    public void addLast(int element) {
        if (this.isEmpty()) {
            this.addFirst(element);
            return;
        }

        Node newNode = new Node(element);

        this.tail.next = newNode;
        newNode.prev = this.tail;
        this.tail = newNode;

        this.size++;
    }

    public int get(int index) {
        validateIndex(index);

        Node currentNode = this.head;

        int count = 0;

        while (count < index - 1) {
            currentNode = currentNode.next;
            count++;
        }

        return currentNode.element;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }

        int result = this.head.element;

        this.head = this.head.next;
        if (this.size > 1) {
            this.head.prev = null;
        }
        this.size--;
        if (this.isEmpty()) {
            this.head = this.tail = null;
        }

        return result;
    }

    public int removeLast() {
        if (this.size < 2) {
            return this.removeFirst();
        }

        int result = this.tail.element;

        this.tail = this.tail.prev;
        this.tail.next = null;

        this.size--;

        return result;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = this.head;

        while (currentNode != null) {
            consumer.accept(currentNode.element);
            currentNode = currentNode.next;
        }
    }

    public int[] toArray() {
        int[] arr = new int[this.size];

        Node currentNode = this.head;

        for (int i = 0; i < this.size; i++) {
            arr[i] = currentNode.element;
            currentNode = currentNode.next;
        }

        return arr;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(String.format("Index %d is out of bounds for length %d",
                    index, this.size));
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }
}
