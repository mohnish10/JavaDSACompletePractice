package practiceprogramsforjavadsa;

import java.util.LinkedHashSet;
import java.util.Arrays;

public class UnionOf2Arrays2
{

    public static void unionOf2Arrays(Integer[] arr,Integer[] arr1)
    {

        Arrays.sort(arr);

        Arrays.sort(arr1);

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i=0;i<arr.length;i++)
        {

            set.add(arr[i]);
        }

        for(int j=0;j<arr1.length;j++)
        {

            set.add(arr1[j]);
        }

        System.out.println("Union of 2 arrays is:- "+set.toString());

    }


    public static void main(String[] args)
    {

        Integer[] arr = {7, 1, 5, 2, 3, 6};

        Integer[] arr1 = {3, 8, 6, 20, 7};

        unionOf2Arrays(arr,arr1);
    }
}
