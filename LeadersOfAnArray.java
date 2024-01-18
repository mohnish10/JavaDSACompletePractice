package practiceprogramsforjavadsa;

import java.util.List;

public class LeadersOfAnArray
{

    public static void leadersOfAnArray(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            int j;

            for(j=i+1;j<arr.length;j++)
            {

                if(arr[i]<=arr[j])
                    break;

            }

            if(j==arr.length)
                System.out.print(arr[i]+" ");

        }

    }


    public static void main(String[] args)
    {

        int[] arr = {16, 17, 4, 3, 5, 2};

        System.out.print("Original array elements are:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        System.out.print("The leaders of the array are:- ");

        leadersOfAnArray(arr);
    }
}
