package practiceprogramsforjavadsa;

// Floor of x is the largest element which is smaller than or equal to x
// Ceil of x is the smallest element which is greater than or equal to x

//arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
//x = 7
//Floor = 6
//Ceiling = 8

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FloorInASortedArray2
{

    public static int floorInASortedArray(int[] arr,int target)
    {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]<=target)
            {

                list.add(arr[i]);
            }
        }

        int floor = Collections.max(list);

        if(list.isEmpty() || target<arr[0])
        {

            floor = -1;
        }


       return floor;

    }


    public static void main(String[] args)
    {

        int[] arr = {1, 2, 8, 10, 10, 12, 19};

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the target which you want to check");

        int target = sc.nextInt();

        int result = floorInASortedArray(arr,target);

        if(result==-1)
        {

            System.out.println("Floor doesn't exist in the array");
        }
        else
        {

            System.out.println("Floor of the sorted array is:- "+result);
        }


    }
}
