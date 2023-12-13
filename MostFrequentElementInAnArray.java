package practiceprogramsforjavadsa;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class MostFrequentElementInAnArray
{

    public static void mostFrequentElementInAnArray(Integer[] arr)
    {

        Map<Integer,Integer> map = new HashMap<>();

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

        int maxFrequency = 0;

        for(int i=1;i<map.size();i++)
        {

            if(maxFrequency<map.get(i))
            {

                maxFrequency = map.get(i);
            }

        }

        System.out.println("Most frequent element is:- "+maxFrequency);


    }

    public static void main(String[] args)
    {

        Integer[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6};

        mostFrequentElementInAnArray(arr);
    }
}
