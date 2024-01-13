package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.ArrayList;

public class Move0sToEndOfTheArray2
{

    public static void move0sToEndOfTheArray(int[] arr)
    {

        int count = 0;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]!=0)
            {

                arr[count]=(arr[i]);

                count++;
            }
        }


        for(int i=count;i<arr.length;i++)
        {

            arr[i]=0;
        }


        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args)
    {

        int[] arr = {1, 2, 0, 0, 0, 3, 6};

        move0sToEndOfTheArray(arr);

    }
}
