package practise23;

public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int head = 0;

    public static boolean isEmpty() {
        return size == 0;
    }

    public static int size() {
        return size;
    }

    public static Object element() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return elements[head];
    }

    public static void enqueue(Object element) {
        ensureCapacity();
        elements[(head + size) % elements.length] = element;
        size++;
    }

    public static Object dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        Object element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    public static void clear() {
        elements = new Object[10];
        size = 0;
        head = 0;
    }

    private static void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < size; i++)
                newElements[i] = elements[(head + i) % elements.length];
            elements = newElements;
            head = 0;
        }
    }
}
