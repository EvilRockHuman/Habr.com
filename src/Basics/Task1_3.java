package Basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1_3 {
    /**
     *Дан массив целых чисел и ещё одно целое число.
     *Удалите все вхождения этого числа из массива
     *(пропусков быть не должно).
     */
    public static void main(String[] args) {
        Integer[] array2 = {5, 4, 2, 5, 7, 3, 5};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(array2));
        list.removeAll(Arrays.asList(Integer.valueOf(5)));
        array2=list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array2));
    }
}
