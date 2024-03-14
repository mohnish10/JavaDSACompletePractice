package practiceprogramsforjavadsa;

import java.util.Scanner;

public class ImplementLowerBoundUsingBinarySearch
{

    public static int implementLowerBound(int[] arr,int key)
    {

        int n = arr.length;

        int low = 0;

        int high = n;

        int mid;

        while(low<high)
        {

            mid = (low) + (high-low)/2;

            if(key<=arr[mid])
            {

                high = mid;
            }
            else
            {

                low = mid + 1;
            }


            if(low<n && arr[low]<key)
            {

                low++;
            }

        }

        if(key<arr[0]) return -1;
        else if(key>arr[n-1]) return n;

      return low;

    }


    public static void main(String[] args)
    {

        int[] arr = {4, 6, 10, 12, 18, 18, 20, 20, 30, 45};

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the key for which you want the lower bound");

        int key = sc.nextInt();

        int result = implementLowerBound(arr,key);

        System.out.println(result);






    }
}
