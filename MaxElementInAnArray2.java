package practiceprogramsforjavadsa;

import java.util.Arrays;

public class MaxElementInAnArray2
{

    public static int maxElementInAnArray(int[] arr)
    {

        Arrays.sort(arr);

        return arr[arr.length-1];

    }


    public static void main(String[] args)
    {

        int[] arr = {120,20,55,30,40,45,100};

        int result = maxElementInAnArray(arr);

        System.out.println("Max element in array is:- "+result);
    }
}
