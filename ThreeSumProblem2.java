package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumProblem2
{

    public static boolean threeSum(int[] arr,int target)
    {

        int l,r;

        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i++)
        {

            l = i+1;

            r = arr.length-1;

            while(l<r)
            {

                if(arr[i]+arr[l]+arr[r]==target)
                {

                    System.out.println("Target sum is the addition of "+arr[i]+" "+arr[l]+" "+arr[r]);

                    return true;


                }
                else if(arr[i]+arr[l]+arr[r]<target)
                {

                    l++;
                }
                else
                {

                    r--;
                }

            }

        }


        return false;

    }


    public static void main(String[] args)
    {

        int[] arr = {12, 3, 4, 1, 6, 9};

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the target which you are looking for in the array as threeSum");

        int target = sc.nextInt();

        if(!threeSum(arr,target))
        {

            System.out.println("The target is not present in the array");
        }


    }
}
