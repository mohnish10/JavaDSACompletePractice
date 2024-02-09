package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Merge2SortedArrays1
{

    public static int[] mergeSortedArrays(int[] arr,int[] arr1)
    {

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {

            list.add(arr[i]);
        }

        for(int j=0;j<arr1.length;j++)
        {

            list.add(arr1[j]);
        }


        int[] arr2 = new int[list.size()];

        for(int i=0;i<list.size();i++)
        {

            arr2[i] = list.get(i);
        }

        for(int i=0;i<arr2.length;i++)
        {

            for(int j=i+1;j<arr2.length;j++)
            {

                if(arr2[i]>arr2[j])
                {

                    int temp = arr2[i];

                    arr2[i] = arr2[j];

                    arr2[j] = temp;

                }
            }
        }

        return arr2;

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

        int[] arr2 = mergeSortedArrays(arr,arr1);

        System.out.print("List of the sorted arrays is:- "+Arrays.toString(arr2));

    }
}
