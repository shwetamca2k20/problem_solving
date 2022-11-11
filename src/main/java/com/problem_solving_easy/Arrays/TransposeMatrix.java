package com.problem_solving_easy.Arrays;

import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int count = 0;
        int[][] mat = new int[rows][cols];
        //reading matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
                if(mat[i][j] == 0)
                    count++;
            }
        }
        if((rows * cols) -count == count)
            System.out.println("yes, matrix is transpose matrix");


    }
}
