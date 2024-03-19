package practiceprogramsforjavadsa;

import java.util.Scanner;

public class TransposeOfAMatrix2 {

    public static int[][] transpose(int[][] matrix, int r, int c) {

        r = matrix.length;

        c = matrix[0].length;

        for (int i = 0; i < r; i++)

        {
            for (int j = i+1; j < c; j++) {

                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];

                matrix[j][i] = temp;

            }

    }

        return matrix;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the rows of the original matrix");

        int rows = sc.nextInt();

        System.out.println("Please enter the columns of the original matrix");

        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing the original contents of the matrix");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Transpose of the original matrix is:- ");

        matrix = transpose(matrix, rows, cols);

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

    }

}