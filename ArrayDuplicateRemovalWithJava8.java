package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayDuplicateRemovalWithJava8
{

    public static void main(String[] args)
    {

        int[] arr = {10,20,30,40,50,60,10,20};

        System.out.print("Original array is:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        List<Integer> list = new ArrayList<>();

        for(int i:arr)
        {

            list.add(i);
        }

        list = list.stream().distinct().collect(Collectors.toList());

        Object[] arr1 = list.toArray();

        System.out.println("Array after removal of duplicates:- "+Arrays.toString(arr1));




    }
}
