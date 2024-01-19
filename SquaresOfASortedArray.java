package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class SquaresOfASortedArray
{

    public static int[] squaresOfASortedArray(int[] arr)
    {

        int[] arr1 = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {

            arr1[i] = (arr[i]*arr[i]);
        }

        Arrays.sort(arr1);

        return arr1;

    }


    public static void main(String[] args)
    {

        int[] arr = {-4,-1,0,3,10};

        squaresOfASortedArray(arr);
    }
}
