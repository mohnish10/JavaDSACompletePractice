package practiceprogramsforjavadsa;

import java.util.Arrays;

public class ArrayReverse
{
    public static void main(String[] args)
    {

        int[] arr = {10,20,30,40,50,60};

        System.out.println("Original Array is:- "+Arrays.toString(arr));

        System.out.println("Array in reverse is:- ");

        for(int i=arr.length-1;i>=0;i--)
        {

            System.out.print(arr[i]+" ");
        }

    }
}
