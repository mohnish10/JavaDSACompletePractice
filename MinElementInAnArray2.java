package practiceprogramsforjavadsa;

import java.util.Arrays;

public class MinElementInAnArray2
{

    public static int minElement(int[] arr)
    {

        Arrays.sort(arr);

        return arr[0];
    }


    public static void main(String[] args)
    {

        int[] arr = {10,0,-1,20,5,4,30,6};

        int result = minElement(arr);

        System.out.println("Minimum element in the array is:- "+result);
    }
}
