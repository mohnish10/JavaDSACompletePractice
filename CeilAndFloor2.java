package practiceprogramsforjavadsa;

import java.util.Scanner;

public class CeilAndFloor2
{

    public static int ceil(int[] arr,int target)
    {

        int low=0;

        int high=arr.length-1;

        int ans=-1;

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(arr[mid]>=target)
            {

                ans = arr[mid];

                high=mid-1;
            }
            else
            {

                low=mid+1;
            }

        }

        return ans;
    }


    public static int floor(int[] arr,int target)
    {

        int ans=-1;

        int low=0;

        int high=arr.length-1;

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(arr[mid]<=target)
            {

                ans=arr[mid];

                low=mid+1;
            }
            else
            {

                high=mid-1;
            }
        }

        return ans;
    }


    public static void main(String[] args)
    {

        int[] arr = {3, 4, 4, 7, 8, 10};

        System.out.print("Original array ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number for which you are trying to find ceil and floor");

        int target = sc.nextInt();

        int ceilResult = ceil(arr,target);

        int floorResult = floor(arr,target);

        System.out.println("Ceil and the floor of the sorted array are:- "+ceilResult+" and "+floorResult+" respectively");



//        if(ceilResult==-1)
//        {
//
//            System.out.println("Ceil does not exist for the mentioned target in the array");
//        }

//            if(floorResult==-1)
//            {
//
//                System.out.println("Floor does not exist for the mentioned target in the array");
//            }




        }

}
