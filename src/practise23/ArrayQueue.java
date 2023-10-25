package practise23;

import java.util.Queue;

public class ArrayQueue<T> extends AbstractQueue<T> {
    private Object[] elements = new Object[10];
    private int head = 0;

    public void enqueue(Object element) {
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
        size++;
    }

    public T element() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return (T) elements[head];
    }

    public T dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        Object element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return (T) element;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            int newCapacity = Math.max(2 * elements.length, capacity);
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
        }
    }
}
