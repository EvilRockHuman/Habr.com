package Basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_0 {
    /**
     * Заполните массив случайным числами и выведете
     * максимальное, минимальное и среднее значение.
     * Для генерации случайного числа используйте
     * метод Math.random(), который возвращает
     * значение в промежутке [0, 1].
     */
    public static void main(String[] args) {
        int n = 5;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0]; // Массив не должен быть пустым
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
