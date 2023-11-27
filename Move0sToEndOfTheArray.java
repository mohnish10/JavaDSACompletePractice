package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Move0sToEndOfTheArray
{

    public static void move0sToEnd(int[] arr)
    {

        System.out.print("Original array:- ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

        List<Integer> list = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]!=0)
            {

                list.add(arr[i]);
            }
            else
            {

                list1.add(arr[i]);
            }
        }

        list.addAll(list1);

       Integer[] finalArray = (Integer[]) list.toArray(new Integer[list.size()]);

       System.out.println();

       System.out.print("Array with 0s printed at the end are:- ");

       for(int k=0;k<finalArray.length;k++)
       {

           System.out.print(finalArray[k]+" ");
       }

    }

    public static void main(String[] args)
    {

        int[] arr = {1, 2, 0, 0, 0, 3, 6};

        move0sToEnd(arr);
    }
}
