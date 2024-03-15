package practiceprogramsforjavadsa;

import java.util.Scanner;

public class NumberOfOccurences
{

    public static int numberOfOccurrences(int[] arr,int n,int x)
    {

        int firstOccurrence = lowerBound(arr,n,x);

        int lastOccurrence = upperBound(arr,n,x);

        return lastOccurrence-firstOccurrence;

    }


    public static int lowerBound(int[] arr,int n,int x)
    {

        n = arr.length;

        int low = 0;

        int high = n;

        int mid;

        while(low<high)
        {

            mid = low + (high-low)/2;

            if(x<=arr[mid])
            {

                high = mid;

            }
            else
            {

                low = mid+1;
            }

        }

        if(low<n && arr[low]<x)
        {

            low++;
        }

        if(x<arr[0]) return -1;
        else if(x>arr[n-1]) return n;

    return low;

    }



    public static int upperBound(int[] arr,int n,int x)
    {

        n = arr.length;

        int low = 0;

        int high = n;

        int mid;

        while(low<high)
        {

            mid = low + (high-low)/2;

            if(x>=arr[mid])
            {

                low = mid+1;
            }
            else
            {

                high = mid;

            }

       if(high<n && x>arr[high])
       {

           return -1;
       }

        }

         return low;

    }


    public static void main(String[] args)
    {

        int[] arr = {1, 1, 1, 2, 2, 3, 3};

        int n = arr.length;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the key which you want to search for");

        int key = sc.nextInt();

        int result = numberOfOccurrences(arr,n,key);

        System.out.println(result);



    }




}
