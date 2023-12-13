package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class ElementWhichAppearsOnceInASortedArray
{

    public static int elementWhichAppearsOnceInASortedArray(int[] arr)
    {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {

            list.add(arr[i]);
        }

        for(int i=0;i<list.size();i++)
        {

            if(list.indexOf(list.get(i))==list.lastIndexOf(list.get(i)))
            {

                return list.get(i);
            }
        }

        return -1;

    }


    public static void main(String[] args)
    {

        int[] arr = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8, 8};

        System.out.print("Original array ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int res = elementWhichAppearsOnceInASortedArray(arr);

        if(res==-1)
        {

            System.out.println("No element is oresent only once in the sorted array");
        }
        else
        {

            System.out.println("Unique element in the sorted array is "+res);
        }
    }
}
