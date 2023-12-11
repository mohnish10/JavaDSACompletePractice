package practiceprogramsforjavadsa;

import java.util.Arrays;

public class CeilTheFloor
{

    public static void ceil(int[] arr,int target)
    {

        System.out.print("Original array is:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        Arrays.sort(arr);

        for(int i=1;i<arr.length;i++)
        {

            if(arr[i]==target)
            {

                System.out.println("Ceiling of the target is:- "+arr[i]);
            }


            if(arr[i-1]<target && arr[i]>=target)
            {


                System.out.println("Ceiling of the target is:- "+arr[i]);
            }
        }

        if(target<=arr[0])
        {

            System.out.println("Ceiling of the target is:- "+arr[0]);
        }

        if(target>arr[arr.length-1])
        {

            System.out.println("Ceiling doesn't exist in the array");
        }

    }


    public static void main(String[] args)
    {

        int[] arr = {1,20,50,100,110};

        ceil(arr,40);
    }
}
