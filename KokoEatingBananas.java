package practiceprogramsforjavadsa;

public class KokoEatingBananas
{

    public static int minimumRateToEatBananas(int[] v,int h)
    {

        int maxi = Integer.MIN_VALUE;

        int n = v.length;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,v[i]);
        }


        for(int i=1;i<=maxi;i++)
        {

            int totalHours = calculateTotalHours(v,i);

            if(totalHours<=h)  { return i; }

        }


    return maxi;

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
