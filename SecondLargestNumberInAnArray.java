package practiceprogramsforjavadsa;

import java.util.Arrays;

public class SecondLargestNumberInAnArray
{
    public static void sortArrayInDescendingOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }
            }
        }

//        System.out.print("Sorted Array:- ");
//
//        for(int i:arr)
//        {
//
//            System.out.print(i+" ");
//        }
//
    }

    public static int secondLargestElement(int[] arr)
    {

        sortArrayInDescendingOrder(arr);

        return arr[1];
    }


    public static int secondSmallestElement(int[] arr)
    {

        sortArrayInDescendingOrder(arr);

        return arr[arr.length-2];
    }


    public static void main(String[] args)
    {

        int[] arr = {10,30,20,50,40,70,60};

        System.out.print("Original array is:- "+Arrays.toString(arr));

        int secondLargestElement = secondLargestElement(arr);

        System.out.println();

        System.out.println("The second Largest element in array is:- "+secondLargestElement);

        int secondSmallestElement = secondSmallestElement(arr);

        System.out.println("The second smallest element in array is:- "+secondSmallestElement);

    }
}
