/*Дан одномерный массив. Реализовать сортировку выбором для одномерного массива.
Сортировка выбором. Дана последовательность чисел.
Требуется переставить элементы так, чтобы они были расположены по возрастанию.
Для этого в массиве, начиная с первого, выбирается наименьший элемент и ставится на первое место,
а первый – на место наименьшего. Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором.
*/


package alevel.lesson5.homework;

import java.util.Arrays;

public class exercise3 {

    public static void main(String[] args) {

        int[] array = {2, 4, 8, 3, 7, 1, 9, 0, 6, 5};

        for (int i = 0; i < (array.length - 1); i++) {
            int sort = array[i];
            int position = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < sort) {
                    sort = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = sort;
        }

        System.out.println(Arrays.toString(array));
    }
}