package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumProblem2
{
    public static boolean twoSum(int[] arr,int target)
    {

        Arrays.sort(arr);

        int low = 0;

        int high = arr.length-1;

        while(low<high)
        {

            if(arr[low]+arr[high]==target)
            {

                return true;

            }
            else if(arr[low]+arr[high]<target)
            {

                low++;
            }
            else
            {

                high--;
            }
        }

        return false;

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the target sum which you are looking for in the array");

        int target = sc.nextInt();

        int[] arr = {1,2,3,4,5,6};

        if(twoSum(arr,target))
        {

            System.out.println("Target sum can be obtained in the array");
        }
        else
        {

            System.out.println("Target sum cannot be obtained in the array");
        }


    }
}
