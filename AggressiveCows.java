package practiceprogramsforjavadsa;

import java.util.Arrays;

public class AggressiveCows
{
    public static boolean canWePlace(int[] stalls,int dist,int k)
    {

        int last = stalls[0];

        int cntCows = 1;

        for(int i=1;i<stalls.length;i++)
        {

            if(stalls[i]-last>=dist)
            {

                cntCows = cntCows+1;

                last = stalls[i];

            }

            if(cntCows>=k) return true;
        }

        return false;
    }


    public static int aggressiveCows(int[] stalls,int k)
    {

        Arrays.sort(stalls);

        int min = stalls[0];

        int max = stalls[stalls.length-1];

        for(int i=1;i<=max-min;i++)
        {

            if(!canWePlace(stalls, i, k)) return i-1;

        }

        return max-min;
    }
}
