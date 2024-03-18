package practiceprogramsforjavadsa;

public class MinimumInSortedRotatedArray2
{

    public static int getMinimum(int[] arr)
    {

        int n = arr.length;

        int low = 0;

        int high = n-1;

        int mid;

        int ans = Integer.MAX_VALUE;

        while(low<=high)
        {

            mid = low + (high-low)/2;

            if(arr[low]<=arr[mid])
            {

                ans = Math.min(ans,arr[low]);

                low = mid+1;
            }
            else
            {

                ans = Math.min(ans,arr[mid]);

                high = mid-1;
            }

        }

        return ans;
    }
}
