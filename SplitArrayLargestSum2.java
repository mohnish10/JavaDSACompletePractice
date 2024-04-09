package practiceprogramsforjavadsa;

public class SplitArrayLargestSum2
{

    public static int countPartitions(int[] a,int maxSum)
    {

        int partitions = 1; int subArraySum = 0;

        int n = a.length;

        for(int i=0;i<n;i++)
        {

            if(subArraySum+a[i]<=maxSum) subArraySum += a[i];
            else
            {

                partitions++;

                subArraySum = a[i];
            }
        }

        return partitions;

    }


    public static int largestSubArraySumMinimized(int[] a, int k)
    {

        int n = a.length;

        int maxi = Integer.MIN_VALUE;

        int sum = 0;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,a[i]);

            sum += a[i];
        }

        int low = maxi; int high = sum;

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(countPartitions(a,mid)>k) low = mid+1;
            else high = mid-1;
        }

     return low;

    }
}
