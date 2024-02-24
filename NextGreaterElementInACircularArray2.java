package practiceprogramsforjavadsa;

import java.util.Arrays;

public class NextGreaterElementInACircularArray2
{

    public static void nextGreaterElement(int[] arr)
    {

        int[] result = new int[arr.length];


        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length+i;j++)
            {

                if(arr[i]<arr[j%arr.length])
                {

                    result[i] = arr[j%arr.length];

                    break;
                }
                else
                {

                    result[i] = -1;
                }

            }
        }

        System.out.println(Arrays.toString(result));

    }


    public static void main(String[] args)
    {

        int[] arr = {5,5,5,5,5};

        System.out.print("Original array is:- ");

        for(int i:arr) System.out.print(i+" ");

        System.out.println();

        System.out.print("Next greater elements for arr is:- ");

        nextGreaterElement(arr);
    }
}
