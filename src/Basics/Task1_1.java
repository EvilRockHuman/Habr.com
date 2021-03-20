package Basics;

public class Task1_1 {
    /**
     *реализация сортировки методом пузырька
     */
    public static void main(String[] args) {
        int[] array = {1,5,3,8,9,3};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
