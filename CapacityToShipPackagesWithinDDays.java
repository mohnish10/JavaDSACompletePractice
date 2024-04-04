package practiceprogramsforjavadsa;

public class CapacityToShipPackagesWithinDDays
{
    public static int findDays(int[] weights,int cap)
    {

        int days = 1; int load = 0;

        for(int i=0;i<weights.length;i++)
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

        int n = weights.length;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,weights[i]);
        }

        int summation = 0;

        for(int i=0;i<n;i++)
        {

            summation += weights[i];
        }

        for(int j=maxi;j<=summation;j++)
        {

            int result = findDays(weights,j);

            if(result<=d) return j;
        }

        return -1;

    }

}
