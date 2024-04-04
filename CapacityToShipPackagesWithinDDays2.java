package practiceprogramsforjavadsa;

public class CapacityToShipPackagesWithinDDays2
{
    public static int findNumberOfDays(int[] weights,int cap)
    {

        int days = 1; int load = 0;

        int n = weights.length;

        for(int i=0;i<n;i++)
        {

            if(load+weights[i]>cap)
            {

                days = days+1;

                load = weights[i];
            }
            else
            {

                load += weights[i];
            }
        }


        return days;

    }


    public static int leastWeightCapacity(int[] weights,int d)
    {

        int maxi = Integer.MIN_VALUE;

        int sum = 0;

        int n = weights.length;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,weights[i]);

            sum += weights[i];
        }

        int low = maxi; int high = sum;

        while(low<=high)
        {

            int mid = (low+high)/2;

            int result = findNumberOfDays(weights,mid);

            if(result<=d)
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
}
