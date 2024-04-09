package practiceprogramsforjavadsa;

public class SplitArrayLargestSum
{

    public static int countPartitions(int[] a,int maxSum)
    {

        int n = a.length;

        int partitions = 1;

        int subArraySum = 0;

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


    public static int largestsubArraySumMinimized(int[] a,int k)
    {

        int n = a.length;

        int maxi = Integer.MIN_VALUE;

        int sum = 0;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,a[i]);

            sum += a[i];
        }

        for(int j=maxi;j<=sum;j++)
        {

            if(countPartitions(a,j)==k) return j;
        }

        return a[0];
    }
}
