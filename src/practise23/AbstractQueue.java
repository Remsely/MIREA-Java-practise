package practise23;


/*Инвариант структуры данных "очередь" в данной реализации заключается в следующем:

- size (размер очереди) всегда неотрицательное число.
- elements (массив элементов) содержит элементы, причем они хранятся в порядке, соответствующем порядку добавления в
очередь.
- head (индекс головы очереди) указывает на начало очереди и находится в диапазоне от 0 (включительно) до
elements.length (исключительно).*/

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        while (!isEmpty())
            dequeue();
    }
}
