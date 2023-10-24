package practise21;

public class GenericArray<T> {
    private final T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        GenericArray<Integer> intArray = new GenericArray<>(integers);
        System.out.println(intArray.getElement(1));

        String[] strings = {"one", "two", "three"};
        GenericArray<String> stringArray = new GenericArray<>(strings);
        System.out.println(stringArray.getElement(2));
    }

    public T getElement(int index) {
        if (index >= 0 && index < array.length)
            return array[index];
        throw new IndexOutOfBoundsException("Index: " + index + "Size: " + array.length);
    }
}
