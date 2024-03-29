package practiceprogramsforjavadsa;

public class KthMissingPositiveNumber2
{

    public static int kthMissingPositiveNumber(int[] arr,int n,int k)
    {

        n = arr.length;

        if(n>k) return -1;

        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,arr[i]);
        }

        int low = 1;

        int high = maxi;

        while(low<=high)
        {

            int mid = (low+high)/2;

            int result = sumByD(arr,mid);

            if(result<=k) high = mid-1;
            else low = mid+1;

        }


       return low;

    }


    public static int sumByD(int[] arr, int div)
    {

        int n = arr.length;

        int sum = 0;

        for(int i=0;i<n;i++)
        {


            sum += (int) Math.ceil((double) arr[i]/ (double) div);

        }

   return sum;

    }
}
