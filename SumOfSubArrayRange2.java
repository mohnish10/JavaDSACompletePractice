package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.Stack;

public class SumOfSubArrayRange2
{

    public static long sumOfSubArrayRange(int[] nums)
    {

        int n = nums.length;

        long sum = 0;

        int[] minPrev = new int[n];

        int[] minNext = new int[n];

        int[] maxPrev = new int[n];

        int[] maxNext = new int[n];

        Arrays.fill(minPrev,-1);

        Arrays.fill(minNext,n);

        Arrays.fill(maxPrev,-1);

        Arrays.fill(maxNext,n);

        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<n;i++)
        {

            while(!stk.isEmpty() && nums[stk.peek()]>=nums[i])
            {

                stk.pop();
            }

            if(!stk.isEmpty())
            {

                minPrev[i] = stk.peek();
            }

            stk.push(i);
        }


        stk = new Stack<>();

        for(int i=0;i<n;i++)
        {

            while(!stk.isEmpty() && nums[stk.peek()]<=nums[i])
            {

                stk.pop();
            }

            if(!stk.isEmpty())
            {

                maxPrev[i] = stk.peek();
            }


            stk.push(i);
        }


        stk = new Stack<>();

        for(int i=n-1;i>=0;i--)
        {

            while(!stk.isEmpty() && nums[stk.peek()]>nums[i])
            {

                stk.pop();
            }

            if(!stk.isEmpty())
            {

                minNext[i] = stk.peek();
            }


            stk.push(i);
        }


        stk = new Stack<>();

        for(int i=n-1;i>=0;i--)
        {

            while(!stk.isEmpty() && nums[stk.peek()]<nums[i])
            {

                stk.pop();
            }


            if(!stk.isEmpty())
            {

                maxNext[i] = stk.peek();
            }

            stk.push(i);

        }

        for(int i=0;i<n;i++)
        {

            long leftMin = i - minPrev[i];
            long rightMin = minNext[i] - i;
            long leftMax = i - maxPrev[i];
            long rightMax = maxNext[i] - i;

            sum += (leftMax*rightMax-leftMin*rightMin)*nums[i];
        }

        return sum;

    }
}
