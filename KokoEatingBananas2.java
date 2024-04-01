package practiceprogramsforjavadsa;

public class KokoEatingBananas2
{

    public static int minimumRateToEatBananas(int[] v,int h)
    {

        int maxi = Integer.MIN_VALUE;

        int n = v.length;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,v[i]);
        }

        int low = 1;

        int high = maxi;

        while(low<=high)
        {

            int mid = (low+high)/2;

            int calc = calculateTotalHours(v,mid);

            if(calc<=h)
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


    public static int calculateTotalHours(int[] v,int hourly)
    {

        int totalHours = 0;

        for(int i=0;i<v.length;i++)
        {

            totalHours += (int) Math.ceil((double)(v[i])/(double)(hourly));
        }

        return totalHours;
    }
}
