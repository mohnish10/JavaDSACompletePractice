package practiceprogramsforjavadsa;

import java.util.Set;
import java.util.TreeSet;

public class UnionOf2Arrays
{
    public static void arrayUnion(Integer[] arr,Integer[] arr1)
    {

        Set<Integer> set = new TreeSet<>();

        for(int i=0;i<arr.length;i++)
        {

            set.add(arr[i]);
        }

        for(int j=0;j<arr1.length;j++)
        {

            set.add(arr1[j]);
        }

        System.out.println("The union of the 2 arrays is:- "+set.toString());

    }


    public static void main(String[] args)
    {

        Integer[] arr = {12, 13, 5, 16, 9, 19};

        Integer[] arr1 = {16, 2, 60, 9, 8, 5};

        arrayUnion(arr,arr1);

    }


}
