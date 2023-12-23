package practiceprogramsforjavadsa;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayDuplicateFinding2 {

    public static ArrayList<Integer> printArrayDuplicates(int[] arr, int n)
    {

        n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {

            if(map.containsKey(arr[i]))
            {

                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {

                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> m: map.entrySet())
        {

            if(m.getValue()>1)
            {

                list.add(m.getKey());
            }

        }

   Collections.sort(list);

    if(list.isEmpty())
    {

        list.add(-1);
    }

    return list;

    }


    public static void main(String[] args)
    {

        int[] arr= {1,2,3,4,5,6};

        System.out.print("The array is:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        ArrayList<Integer> list  = printArrayDuplicates(arr,arr.length);

        System.out.println(list);
    }

}
