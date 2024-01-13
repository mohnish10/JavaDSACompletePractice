package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class NumberOfOccurrences
{

    public static void sortArray(Integer[] arr)
    {

        for(int i=0;i<arr.length;i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }

            }

        }

        System.out.println("The sorted array is:- ");

        for(int i : arr)
        {

            System.out.print(i+" ");

        }

        List<Integer> list = List.of(arr);

        System.out.println();

        System.out.println("Frequency of elements in the array is:- ");

        Set<Integer> set = new HashSet<>(list);

        for(Integer k:set)
        {

            System.out.println(k+" "+Collections.frequency(list,k));
        }

    }


    public static void main(String[] args)
    {

        Integer[] arr = {1, 1, 2, 2, 2, 2, 3,};

        System.out.println("Original array is:- "+Arrays.toString(arr));

        sortArray(arr);

    }
}
