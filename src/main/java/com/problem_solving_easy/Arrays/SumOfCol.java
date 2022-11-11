package com.problem_solving_easy.Arrays;

import java.util.Scanner;

public class SumOfCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        //reading matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        //calculating sum of rows
        for (int j = 0; j < cols; j++) {
            int sumOfRows = 0;
            for (int i = 0; i < rows; i++) {
                sumOfRows = sumOfRows + mat[i][j];
            }
            System.out.println(sumOfRows);
        }
    }
}
