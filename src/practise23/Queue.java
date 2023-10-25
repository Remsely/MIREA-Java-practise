package practise23;

public interface Queue<T> {
    // Добавляет элемент в конец очереди.
    void enqueue(T element);

    // Возвращает первый элемент в очереди.
    T element();

    // Удаляет и возвращает первый элемент в очереди.
    T dequeue();

    // Возвращает текущий размер очереди.
    int size();

    // Проверяет, является ли очередь пустой.
    boolean isEmpty();

    // Удаляет все элементы из очереди.
    void clear();
}
