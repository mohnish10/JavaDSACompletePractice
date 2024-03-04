package practiceprogramsforjavadsa;

import java.util.Stack;

public class SumOfSubArrayRanges2
{

    public long sumOfSubArrayRanges(int[] nums)
{

    int n = nums.length;

    int[] leftMin = new int[n];

    int[] leftMax = new int[n];

    int[] rightMin = new int[n];

    int[] rightMax = new int[n];

    for(int i=0;i<n;i++)
    {
        leftMin[i] = -1;
        leftMax[i] = -1;
        rightMin[i] = -1;
        rightMax[i] = -1;

    }

    Stack<Integer> lmin = new Stack<>();

    Stack<Integer> rmin = new Stack<>();

    Stack<Integer> lmax = new Stack<>();

    Stack<Integer> rmax = new Stack<>();

    for(int i=0;i<n;i++)
    {

        while(!lmin.isEmpty() && nums[lmin.peek()]>nums[i])
        {

            lmin.pop();
        }

        if(!lmin.isEmpty())
        {

            leftMin[i] = lmin.peek();
        }


        lmin.push(i);

    }


    for(int i=0;i<n;i++)
    {

        while(!lmax.isEmpty() && nums[i]>nums[lmax.peek()])
        {

            lmax.pop();
        }


        if(!lmax.isEmpty())
        {

            leftMax[i] = lmax.peek();
        }

        lmax.push(i);
    }


    for(int i=n-1;i>=0;i--)
    {

        while(!rmin.isEmpty() && nums[i]<=nums[rmin.peek()])
        {

            rmin.pop();
        }


        if(!rmin.isEmpty())
        {

            rightMin[i] = rmin.peek();
        }

        rmin.push(i);
    }


    for(int i=n-1;i>=0;i--)
    {

        while(!rmax.isEmpty() && nums[i]>=nums[rmax.peek()])
        {

            rmax.pop();
        }

        if(!rmax.isEmpty())
        {

            rightMax[i] = rmax.peek();
        }

        rmax.push(i);
    }


    long ans = 0;

    for(int i=0;i<n;i++)
    {

        long lmins = leftMin[i] == -1 ? -1 : leftMin[i];
        long rmins = rightMin[i] == -1 ? n : rightMin[i];
        long lmaxs = leftMax[i] == -1 ? -1 : leftMax[i];
        long rmaxs = rightMax[i] == -1 ? n : rightMax[i];


        long lminDiff = i - lmins;

        long lmaxDiff = i - lmaxs;

        long rminDiff = rmins - i;

        long rmaxDiff = rmaxs - i;


        ans += (lmaxDiff*rmaxDiff)- (lminDiff * rminDiff) * (nums[i]);

    }


    return ans;

}

}
