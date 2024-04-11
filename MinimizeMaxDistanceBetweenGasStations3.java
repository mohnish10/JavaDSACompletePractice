package practiceprogramsforjavadsa;

public class MinimizeMaxDistanceBetweenGasStations3
{

    public static int numberOfRequiredGasStations(double dist,int[] arr)
    {

        int n = arr.length;

        int cnt = 0;

        for(int i=1;i<n;i++)
        {

            int noOfStations = arr[i]-arr[i-1];

            int noInBetween = (int) (noOfStations/dist);

            if(noOfStations==dist*noInBetween) noOfStations = noOfStations -1;

            cnt += noOfStations;

        }

        return cnt;

    }


    public static double minimizeMaxDistance(int[] arr,int k)
    {

        int n = arr.length;

        double low = 0;

        double high = 0;

        for(int i=0;i<n-1;i++)
        {

            high = Math.max(high,(double) arr[i+1]-arr[i]);
        }

        double diff = 1e-6;

        while(high-low>diff)
        {

            double mid = (low+high)/2.0;

            if(numberOfRequiredGasStations(mid,arr)>k) low=mid;
            else high = mid;

        }


        return high;

    }
}
