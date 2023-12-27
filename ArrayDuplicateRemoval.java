package practiceprogramsforjavadsa;

import java.util.Arrays;

public class ArrayDuplicateRemoval
{

    public static int arrayDuplicateRemoval(int[] arr)
    {

        int n = arr.length;

        int i=0;

        for(int j=1;j<n;j++)
        {

            if(arr[i]!=arr[j])
            {

                i++;

                arr[i]=arr[j];
            }

        }

        System.out.println();

        return i+1;

    }


    public static void main(String[] args)
    {

        int[] arr = {1,1,2,2,2,3,3};

        System.out.print("Original array:- ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

        int duplicateFreeArray = arrayDuplicateRemoval(arr);

        System.out.print("The array after removing duplicate elements is:- ");

        for(int i=0;i<duplicateFreeArray;i++)
        {

            System.out.print(arr[i]+" ");
        }
    }
}
