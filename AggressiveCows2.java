package practiceprogramsforjavadsa;

import java.util.Arrays;

public class AggressiveCows2
{

    public static boolean canWePlace(int[] stalls,int dist,int k)
    {

        int last = stalls[0];

        int cntCows = 1;

        for(int i=1;i<stalls.length;i++)
        {

            if(stalls[i]-last>=dist)
            {

                cntCows = cntCows + 1;

                last = stalls[i];
            }


            if(cntCows>=k) return true;

        }

        return false;

    }


    public static int aggressiveCows(int[] stalls,int k)
    {

        Arrays.sort(stalls);

        int low = 1;

        int high = stalls[stalls.length-1]-stalls[0];

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(canWePlace(stalls,mid,k)) low = mid+1;
            else high = mid-1;

        }

        return high;
    }
}
