package practiceprogramsforjavadsa;

import java.util.*;

public class SumOfSubarraysMinimum
{

    public static int sumOfMinimumSubArrays(int[] arr)
    {

         int sum = 0;

         for(int i=0;i<arr.length;i++)
         {

             int minEle = arr[i];

             for(int j=i;j<arr.length;j++)
             {

                 minEle = Math.min(minEle,arr[j]);

                 sum += minEle;
             }

         }

         return sum;

    }


//    public static int sum(int[] arr)
//    {
//
//        int sum = 0;
//
//        int sum1 = 0;
//
//        int sum2 = 0;
//
//        int sum3 = 0;
//
//        if(arr.length==1) sum1 = arr[0];
//
//        if(arr.length==2)
//        {
//            sum2 =  Math.min(arr[0],arr[1]);
//        }
//
//        if(arr.length>=3)
//        {
//
//            List<Integer> list = new ArrayList<>();
//
//            for(int i=0;i<arr.length;i++)
//            {
//
//                list.add(arr[i]);
//            }
//
//            sum3 = Collections.min(list);
//        }
//
//        sum = sum1 + sum2 + sum3;
//
//        return sum;
//    }


    public static void main(String[] args)
    {

        int[] arr = {3,2,1,4};

        System.out.print("Original array:- ");


        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();


        System.out.print("Sum of minimum elements of subarray is :- ");

        int sum = sumOfMinimumSubArrays(arr);

        System.out.print(sum);


        
    }



}
