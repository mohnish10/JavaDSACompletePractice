package practiceprogramsforjavadsa;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class MajorityElement
{

    public static int majorityElement(int[] arr)
    {

        int n = arr.length;

        int finalResult = n/2;

        int majorityElement = -1;

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

        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {

            if(m.getValue()>finalResult)
            {

                list.add(m.getKey());
            }
        }

        majorityElement = Collections.max(list);

        return majorityElement;

    }


    public static void main(String[] args)
    {

        int[] arr = {2,2,1,1,1,2,2};

        int majorityElement = majorityElement(arr);

        System.out.println("Majority element is:- "+majorityElement);
    }
}
