package practiceprogramsforjavadsa;

import java.util.Scanner;

public class BasicArrayExampleAndSubarrayWithGivenSum
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int target;

        System.out.println("Please enter the elements which you want to insert in the array");

        for(int i=0;i<arr.length;i++)
        {

            int num = sc.nextInt();

            arr[i] = num;
        }

        System.out.println("The array is:-");

        for(int a:arr)
        {

            System.out.print(a+" ");
        }

        System.out.println();

        System.out.println("Please enter the element which you want to search as sum of subarray");

        target = sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {

                if(arr[i]+arr[j]==target)
                {

                    System.out.println("Elements adding to the target are present at:- "+i+" , "+j);

                    return;
                }
                }
            }

        System.out.println("Target element not present in any of the subarrays sum");

        }



    }

