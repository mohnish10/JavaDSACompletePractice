package practiceprogramsforjavadsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber3
{

    public static int findDuplicate(int[] arr)
    {

        HashMap<Integer,Integer> map = new HashMap<>();

        int duplicateNumber = -1;

        for(int i=0;i<arr.length;i++)
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

        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {

            if(m.getValue()>1)
            {

                duplicateNumber = m.getKey();
            }
        }


        return duplicateNumber;
    }


    public static void main(String[] args)
    {

        int[] arr = {3,1,3,4,2};

        System.out.print("Original array- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        int duplicateNumber = findDuplicate(arr);

        System.out.println("Duplicate number present in the array is:- "+duplicateNumber);
    }
}
