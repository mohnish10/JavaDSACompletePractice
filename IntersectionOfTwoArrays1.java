package practiceprogramsforjavadsa;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class IntersectionOfTwoArrays1 {

    public static boolean intersection(Integer[] arr, Integer[] arr1)
    {

        Set<Integer> set = new HashSet<>(Arrays.asList(arr));

        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr1));

        set.retainAll(set2);

        Integer[] arrNew = set.toArray(new Integer[set.size()]);


        for(int i=0;i<arrNew.length;i++)
        {

            System.out.print("Common elements are:- "+arrNew[i]+" ");

            return true;

        }

        return false;

    }




    public static void main(String[] args) {

        Integer[] arr = {2, 5, 6};

        Integer[] arr1 = {4, 8, 10, 6};

        if (!intersection(arr, arr1)) {

            System.out.println("There are no common elements present in both the arrays");
        }

    }


}




