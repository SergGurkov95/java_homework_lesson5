/*Дан одномерный массив чисел в котором присутствуют одинаковые значения.
Найти в нем число которое повторяется наибольшее количество раз,
если несколько чисел повторяются одинаковое наибольшее количество раз - выбрать наименьшее из них.*/


package alevel.lesson5.homework;

public class exercise1 {

    public static void main(String[] args) {

        int[] array = {2, 2, 1, 3, 6, 1, 3, 7, 7, 6};
        int[] arrayWithoutrepitedElements = new int[5];
        int[] repetitionCounter = new int[5];
        int sort;

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 9; i++) {
                if (array[i] > array[i + 1]) {
                    sort = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = sort;
                }
            }
        }

        int k;
        int j = 0;

        for (int i = 0; i < 5; i++) {
            for (k = 1; (j + k) <= 9; ) {
                if (array[j] == array[j + k]) {
                    arrayWithoutrepitedElements[i] = array[j];
                    repetitionCounter[i]++;
                    k++;
                } else break;
            }
            j += k;
        }

        for (int l = 0; l < 3; l++) {
            for (int i = 0; i < 4; i++)
                if (repetitionCounter[i] < repetitionCounter[i + 1]) {
                    sort = repetitionCounter[i + 1];
                    repetitionCounter[i + 1] = repetitionCounter[i];
                    repetitionCounter[i] = sort;
                    sort = arrayWithoutrepitedElements[i + 1];
                    arrayWithoutrepitedElements[i + 1] = arrayWithoutrepitedElements[i];
                    arrayWithoutrepitedElements[i] = sort;
                }
        }

        System.out.println(arrayWithoutrepitedElements[0]);

    }


}
