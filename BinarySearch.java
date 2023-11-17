package practiceprogramsforjavadsa;

import java.util.Scanner;

public class BinarySearch
{

    public static void binarySearchOfElements(int[] arr,int target)
    {

        int low=0;

        int high = arr.length-1;

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(arr[mid]<target)
            {

                low = mid+1;
            }
            else if(arr[mid]>target)
            {

                high = mid-1;
            }
            else
            {

                System.out.println("Element " +target+" is found");

                return;
            }

        }

        System.out.println("Element "+target+" is not present");

    }


    public static void main(String[] args)
    {

        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        binarySearchOfElements(arr,100);
    }


}



