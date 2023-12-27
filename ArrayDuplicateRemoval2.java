package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class ArrayDuplicateRemoval2
{

    public static void arrayDuplicateRemoval(int[] arr)
    {

        System.out.print("Original array elements:- ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {

            if(!list.contains(arr[i]))
            {

                list.add(arr[i]);
            }
        }

        System.out.println("Array without duplicates is:- "+list.toString());
    }


    public static void main(String[] args)
    {

        int[] arr = {1,1,2,2,2};

        arrayDuplicateRemoval(arr);
    }
}
