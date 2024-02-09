package practiceprogramsforjavadsa;

import java.util.Arrays;

public class Merge2Sorted2
{

    public static int[] merge2SortedArrays(int[] arr1,int[] arr2)
    {

        int i=0,j=0,k=0;

        int n1 = arr1.length;

        int n2 = arr2.length;

        int[] arr3 = new int[n1+n2];

        while(i<n1 && j<n2)
        {

            if (arr1[i]<arr2[j]) arr3[k++] = arr1[i++];
            else arr3[k++] = arr2[j++];

        }


        while(i<n1) arr3[k++] = arr1[i++];

        while(j<n2) arr3[k++] = arr2[j++];


        return arr3;
    }


    public static void main(String[] args)
    {

        int[] arr1 = {1, 3, 4, 5};

        System.out.print("Original arr1- ");

        for(int i:arr1)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        int[] arr2 = {2, 4, 6, 8};

        System.out.print("Original arr2- ");

        for(int i:arr2)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        int[] arr3 = merge2SortedArrays(arr1,arr2);

        System.out.print("List of the sorted arrays is:- "+ Arrays.toString(arr3));

    }
}
