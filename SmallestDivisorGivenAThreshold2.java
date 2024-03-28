package practiceprogramsforjavadsa;

public class SmallestDivisorGivenAThreshold2
{

    public static int smallestDivisor(int[] arr,int limit)
    {

        int n = arr.length;

        if(n>limit) return -1;

        int low = 1;

        int high = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {

            high = Math.max(arr[i],high);
        }

        int mid;

        while(low<=high)
        {

            mid = (low+high)/2;

            int result = sumByD(arr,mid);

            if(result<=limit) high = mid-1;
            else low = mid+1;
        }


     return low;

    }



    public static int sumByD(int[] arr,int div)
    {

        int n = arr.length;

        int sum = 0;

        for(int i=0;i<n;i++)
        {

            sum += (int) Math.ceil((double) arr[i]/(double) div);
        }

       return sum;

    }
}
