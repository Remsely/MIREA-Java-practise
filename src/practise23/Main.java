package practise23;

public class Main {
    public static void main(String[] args) {
        // Тест для ArrayQueueModule
        testArrayQueueModule();
        System.out.println("------------------------");
        // Тест для ArrayQueueADT
        testArrayQueueADT();
        System.out.println("------------------------");
        // Тест для ArrayQueue
        testArrayQueue();
        System.out.println("------------------------");
        // Тест для LinkedQueue
        testLinkedQueue();
    }

    public static void testArrayQueueModule() {
        ArrayQueueModule.enqueue("A");
        ArrayQueueModule.enqueue("B");
        ArrayQueueModule.enqueue("C");

        System.out.println("First element: " + ArrayQueueModule.element());
        System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
        System.out.println("Is empty? " + ArrayQueueModule.isEmpty());
        System.out.println("Queue size: " + ArrayQueueModule.size());

        ArrayQueueModule.clear();
        System.out.println("Is empty after clear? " + ArrayQueueModule.isEmpty());
    }

    public static void testArrayQueueADT() {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queue, "A");
        ArrayQueueADT.enqueue(queue, "B");
        ArrayQueueADT.enqueue(queue, "C");

        System.out.println("First element: " + ArrayQueueADT.element(queue));
        System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue));
        System.out.println("Is empty? " + ArrayQueueADT.isEmpty(queue));
        System.out.println("Queue size: " + ArrayQueueADT.size(queue));

        ArrayQueueADT.clear(queue);
        System.out.println("Is empty after clear? " + ArrayQueueADT.isEmpty(queue));
    }

    public static void testArrayQueue() {
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println("First element: " + queue.element());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Is empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());

        queue.clear();
        System.out.println("Is empty after clear? " + queue.isEmpty());
    }

    public static void testLinkedQueue() {
        LinkedQueue<String> queue = new LinkedQueue<>();

        // Тестирование операций очереди
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println("First element: " + queue.element());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Is empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());

        queue.clear();
        System.out.println("Is empty after clear? " + queue.isEmpty());
    }
}