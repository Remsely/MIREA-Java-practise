package practise21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToListConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    public static void main(String[] args) {
        String[] stringArr = {"Element 1", "Element 2", "Element 3"};
        Integer[] integerArr = {1, 2, 3};

        List<String> stringList = convertArrayToList(stringArr);
        List<Integer> integerList = convertArrayToList(integerArr);

        System.out.println(stringList);
        System.out.println(integerList);
    }
}
