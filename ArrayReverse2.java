package practiceprogramsforjavadsa;

import java.util.Arrays;

public class ArrayReverse2
{
    public static void arrayReverse(int[] arr)
    {

        int start = 0;

        int end = arr.length-1;

        while(start<=end)
        {

            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;

            end--;
        }


        System.out.println("Array in reverse is:- "+Arrays.toString(arr));
    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5};

        arrayReverse(arr);
    }
}
