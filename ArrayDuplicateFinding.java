package practiceprogramsforjavadsa;

import java.util.Set;
import java.util.HashSet;

public class ArrayDuplicateFinding
{

    public static void findDuplicate(int[] arr)
    {

        Set<Integer> s = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {

                if(arr[i]==arr[j])
                {

                    s.add(arr[i]);
                }
            }
        }

        System.out.println("Duplicates present in the array are:- "+s.toString());

    }

    public static void main(String[] args)
    {

        int[] arr = {10,20,30,40,50,60,10};

        System.out.print("Original array is:-");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        findDuplicate(arr);
    }
}
