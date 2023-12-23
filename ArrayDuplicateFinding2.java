package practiceprogramsforjavadsa;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayDuplicateFinding2 {

    public static ArrayList<Integer> printArrayDuplicates(int[] arr, int n)
    {

        n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)
        {

            if(map.containsKey(arr[i]))
            {

                map.put(arr[i],map.get(arr[i])+1);

                set.add(arr[i]);
            }
            else
            {

                map.put(arr[i],1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        return list;

    }


    public static void main(String[] args)
    {

        int[] arr= {13,3,4,12,3,12,3,4,4,12,7,11,6,5};

        System.out.print("The array is:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        printArrayDuplicates(arr,arr.length);
    }

}
