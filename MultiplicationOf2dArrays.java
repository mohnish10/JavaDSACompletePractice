package practiceprogramsforjavadsa;

import java.util.Scanner;

public class MultiplicationOf2dArrays
{

    public static void multiplicationOf2dArrays(int[][]matrix1,int r1,int c1,int[][]matrix2,int r2,int c2)
    {

        int[][] result = new int[r1][c2];

        if(c1!=r2) return;

        r1 = matrix1.length;

        c1 = matrix1[0].length;

        r2 = matrix2.length;

        c2 = matrix2[0].length;

        for(int i=0;i<r1;i++)
        {

            for(int j=0;j<c2;j++)
            {

                for(int k=0;k<c2;k++)


                    result[i][j] += matrix1[i][k]*matrix2[k][j];
            }

        }

        for(int i=0;i<r1;i++)
        {

            for(int j=0;j<c2;j++)
            {

                System.out.print(result[i][j]+" ");
            }

            System.out.println();
        }

    }


    public static void main(String[] args)
    {

        int[][]matrix1 = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the elements of the first matrix");

        for(int i=0;i<2;i++)
        {

            for(int j=0;j<2;j++)
            {

                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix1 is:- ");

        for(int i=0;i<2;i++)
        {

            for(int j=0;j<2;j++)
            {

                System.out.print(matrix1[i][j]+" ");
            }

            System.out.println();
        }

        int[][]matrix2 = new int[2][2];

        System.out.println("Please enter the elements of the second matrix");

        for(int i=0;i<2;i++)
        {

            for(int j=0;j<2;j++)
            {

                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix2 is:- ");

        for(int i=0;i<2;i++)
        {

            for(int j=0;j<2;j++)
            {

                System.out.print(matrix2[i][j]+" ");
            }

            System.out.println();
        }

        System.out.println("Multiplication result of 2 matrices:- ");

        multiplicationOf2dArrays(matrix1,2,2,matrix2,2,2);

    }
}
