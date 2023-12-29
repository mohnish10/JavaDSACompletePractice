package practiceprogramsforjavadsa;

import java.util.HashMap;
import java.util.Map;

public class ElementWhichAppearsOnceInASortedArray2
{

    public static int elementWhichAppearsOnceInASortedArray(int[] arr)
    {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++) {

            if (map.containsKey(arr[i])) {

                map.put(arr[i], map.get(arr[i]) + 1);
            } else {

                map.put(arr[i], 1);
            }

        }

            for(Map.Entry<Integer,Integer> m:map.entrySet())
            {

                if(m.getValue()==1)
                {

                    return m.getKey();
                }
            }

            return -1;
    }


    public static void main(String[] args)
    {

        int[] arr = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8, 8};

        System.out.print("Original array is:- ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int result = elementWhichAppearsOnceInASortedArray(arr);

        if(result==-1)
        {

            System.out.println("There is no unique entry in the sorted array");
        }
        else
        {

            System.out.println("The unique entry in the sorted array is:- "+result);
        }
    }
}
