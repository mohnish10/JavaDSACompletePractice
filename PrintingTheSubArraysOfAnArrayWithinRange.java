package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class PrintingTheSubArraysOfAnArrayWithinRange
{

    public static void printSubArraysWithinRange(int[] arr,int k)
    {

        for(int i=0;i<arr.length-(k-1);i++)
        {

            for(int j=i;j<i+k;j++)
            {

                System.out.print(arr[j]+" ");

            }

            System.out.println();

        }

    }


    public static void main(String[] args)
    {

        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the range for the subarray");

        int k = sc.nextInt();

        if(k<=arr.length) {
            printSubArraysWithinRange(arr, k);
        }
        else
        {

            System.out.println("Please enter valid input as index entered is out of bounds");
        }
    }

}
