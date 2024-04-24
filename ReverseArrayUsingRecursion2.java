package practiceprogramsforjavadsa;

import java.util.Arrays;

public class ReverseArrayUsingRecursion2
{

    public static void reverseArray(int[] arr,int l,int r)
    {

        if(l>r) return;

        swap(arr);

        reverseArray(arr,l+1,r-1);

    }

    public static void swap(int[] arr)
    {

        int i=0; int j = arr.length-1;

        while(i<j)
        {

            int temp = arr[i];

            arr[i] = arr[j];

            arr[j] = temp;

            i++; j--;

        }

    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5};

        reverseArray(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
}
