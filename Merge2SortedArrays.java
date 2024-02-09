package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Merge2SortedArrays
{

    public static List mergeSortedArrays(int[] arr,int[] arr1)
    {

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {

            list.add(arr[i]);
        }

        for(int i=0;i<arr1.length;i++)
        {

            list.add(arr1[i]);
        }

        Collections.sort(list);

        return list;

    }


    public static void main(String[] args)
    {

        int[] arr = {1, 3, 4, 5};

        System.out.print("Original arr- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        int[] arr1 = {2, 4, 6, 8};

        System.out.print("Original arr1- ");

        for(int i:arr1)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        List<Integer> list = mergeSortedArrays(arr,arr1);

        System.out.print("List of the sorted arrays is:- ");

        for(int i:list)
        {

            System.out.print(i+" ");
        }


    }
}
