package practiceprogramsforjavadsa;

import java.util.Scanner;

public class TransposeOfAMatrix
{

    public static int[][] transpose(int[][]matrix,int r,int c)
    {

        r = matrix.length;

        c = matrix[0].length;

        int[][] result = new int[r][c];

        for(int i=0;i<r;i++)
        {

            for(int j=0;j<c;j++)
            {

                result[i][j] = matrix[j][i];
            }


        }

        return result;

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the rows of the original matrix");

        int rows = sc.nextInt();

        System.out.println("Please enter the columns of the original matrix");

        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i=0;i<rows;i++)
        {

            for(int j=0;j<cols;j++)
            {

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing the original contents of the matrix");

        for(int i=0;i<rows;i++)
        {

            for(int j=0;j<cols;j++)
            {

                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }

        int[][] result = transpose(matrix,rows,cols);

        System.out.println("Transpose of the original matrix is:- ");

        for(int i=0;i<rows;i++)
        {

            for(int j=0;j<cols;j++)
            {

                System.out.print(result[i][j]+" ");
            }

            System.out.println();
        }




    }
}
