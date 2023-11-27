package practiceprogramsforjavadsa;

import java.util.Arrays;

public class Segregate0sand1s
{

    public static void segregate0sAnd1s(int[] arr)
    {

        System.out.print("Original array is:- ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

        int count = 0;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==0)
            {

                count++;
            }

        }

        System.out.println("The count of 0s in the array arr is:- "+count);

        int[] arr1 = new int[arr.length];

        for(int i=0;i<count;i++)
        {

            arr1[i]=0;
        }

        for(int j=count;j<arr1.length;j++)
        {

            arr1[j]=1;
        }



        System.out.println("Segregated 0s and 1s array is:-");

        for(int j=0;j<arr1.length;j++)
        {

            System.out.print(arr1[j]+" ");
        }

    }


    public static void main(String[] args)
    {

        int[] arr = {0,1,0,1,0,0,1,1,1,0};

        segregate0sAnd1s(arr);
    }
}
