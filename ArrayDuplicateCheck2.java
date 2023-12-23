package practiceprogramsforjavadsa;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayDuplicateCheck2
{

    public static boolean arrayDuplicateCheck(int[] arr)
    {

        HashMap<Integer,Integer> map = new HashMap<>();

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

        for(int i=0;i<arr.length;i++)
        {

            if(map.get(arr[i])!=1)
            {

                return false;
            }
        }

        return true;
    }


    public static void main(String[] args)
    {

       int[] arr = {0,1,2,3,4,5,6};

       boolean result = arrayDuplicateCheck(arr);

       if(result)
       {

           System.out.println("Array does not contain duplicates");
       }
       else
       {

           System.out.println("Array contains duplicates");
       }



    }


}
