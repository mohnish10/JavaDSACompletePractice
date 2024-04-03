package practiceprogramsforjavadsa;

import static practiceprogramsforjavadsa.MinimumDaysToMakeMBouquets.possible;

public class MinimumDaysToMakeMBouquets2
{

    public static int roseGarden(int[] arr,int k,int m)
    {

        int n = arr.length;

        if(n<m*k) return -1;

        int minimum = Integer.MAX_VALUE;

        int maximum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {

            minimum = Math.min(minimum,arr[i]);

            maximum = Math.max(maximum,arr[i]);
        }

        int low = minimum;

        int high = maximum;

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(possible(arr,mid,m,k))
            {

                high = mid-1;
            }
            else
            {

                low = mid+1;
            }

        }

        return low;

    }


    public static boolean promise(int[] arr,int day,int m,int k)
    {

        int n = arr.length;

        int count = 0;

        int noOfBouquets = 0;

        for(int i=0;i<n;i++)
        {

            if(arr[i]<=day) count++;
            else
            {

                noOfBouquets += count/k;

                count = 0;
            }
        }

        noOfBouquets += count/k;

        return noOfBouquets>=m;
    }


}
