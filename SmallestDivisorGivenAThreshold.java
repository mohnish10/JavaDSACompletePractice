package practiceprogramsforjavadsa;

public class SmallestDivisorGivenAThreshold
{

    public static int smallestDivisor(int[] arr,int limit)
    {

        int n = arr.length;

        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(arr[i],maxi);
        }


        for(int d=1;d<=maxi;d++)
        {

            int sum = 0;

            for(int i=0;i<n;i++)
            {

                sum += (int) Math.ceil((double) arr[i]/(double) d);
            }

            if(sum<=limit) return d;

        }

        return -1;

    }
}
