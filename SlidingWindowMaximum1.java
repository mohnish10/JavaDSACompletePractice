package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMaximum1
{

    public static int[] slidingWindowMaximum(int[] nums,int k)
    {

        int n = nums.length;

        Stack<Integer> stk = new Stack<>();

        int[] nge = new int[n];

        stk.push(nums.length-1);

        nge[nums.length-1] = nums.length;

        for(int i=nums.length-2;i>=0;i--)
        {

            while(!stk.isEmpty() && nums[i]>=nums[stk.peek()])
            {

                stk.pop();
            }

            if(stk.isEmpty())
            {

                nge[i] = nums.length;
            }
            else
            {

                nge[i] = stk.peek();
            }


            stk.push(i);

        }

        int[] result = new int[n-k+1];

        int j = 0;

        for(int i=0;i<=nums.length-k;++i)
        {

            if(j<i) j = i;

            while(nge[j]<i+k) j = nge[j];

            result[i] = nums[j];

        }

    return result;

    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int n = arr.length;

        System.out.print("Original array");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("Please enter the window size");

        int k = sc.nextInt();

        int[] result = slidingWindowMaximum(arr,k);

        System.out.print("Sliding window maximum");

        for(int i:result)
        {

            System.out.print(i+" ");
        }








    }
}
