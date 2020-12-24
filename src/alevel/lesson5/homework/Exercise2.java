/*Дан двумерный массив NxN(количество строк = количество столбцов),
написать программу которая поменяет местами столбцы и строки.
*/


package alevel.lesson5.homework;

import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args) {

        int N = 4;
        int[][] firstArray = {
                {1, 2, 3, 4},
                {5, 6, 7 ,8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] lastArray = new int[N][N];

        for (int i = 0; i < N; i ++){
            for(int j = 0; j < N; j++){
                lastArray[i][j] = firstArray[j][i];
            }
        }

        for (int i = 0; i < N; i++)
            System.out.println(Arrays.toString(lastArray[i]));
    }

}
