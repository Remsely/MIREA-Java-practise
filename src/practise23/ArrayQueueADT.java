package practise23;

public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int head = 0;

    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue, queue.size + 1);
        queue.elements[(queue.head + queue.size) % queue.elements.length] = element;
        queue.size++;
    }

    public static Object element(ArrayQueueADT queue) {
        if (queue.size == 0) throw new IllegalStateException("Queue is empty");
        return queue.elements[queue.head];
    }

    public static Object dequeue(ArrayQueueADT queue) {
        if (queue.size == 0) throw new IllegalStateException("Queue is empty");
        Object element = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return element;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.size; i++) {
            queue.elements[(queue.head + i) % queue.elements.length] = null;
        }
        queue.size = 0;
        queue.head = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            int newCapacity = Math.max(2 * queue.elements.length, capacity);
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < queue.size; i++) {
                newElements[i] = queue.elements[(queue.head + i) % queue.elements.length];
            }
            queue.elements = newElements;
            queue.head = 0;
        }
    }
}
