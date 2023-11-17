package practiceprogramsforjavadsa;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class ArrayDuplicateRemovalWithoutJava8
{

    public static void duplicateRemoval(int[] arr)
    {

        Set<Integer> set = new LinkedHashSet<>();

        for(int i:arr)
        {

            set.add(i);
        }

        System.out.println(set.toString());

    }

    public static void main(String[] args)
    {

        int[] arr = {10,20,30,40,50,60,10,20,30,70};

        System.out.println("Original array:- "+Arrays.toString(arr));

        System.out.print("Array after the removal of duplicates:- ");

        duplicateRemoval(arr);
    }
}
