package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class PaintersPartitionProblem
{
    public static int countPainters(ArrayList<Integer>arr,int time)
    {

        int n = arr.size();

        int painters = 1;

        long boardsPainter = 0;

        for(int i=0;i<n;i++)
        {

            if(boardsPainter+arr.get(i)<=time) boardsPainter += arr.get(i);
            else
            {

                painters++;

                boardsPainter = arr.get(i);
            }

        }

        return painters;
    }


    public static int findLargestMinDistance(ArrayList<Integer>arr,int k)
    {

        int n = arr.size();

        int maxi = Integer.MIN_VALUE;

        int sum = 0;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,arr.get(i));

            sum += arr.get(i);
        }

        for(int time=maxi;time<sum;time++)
        {

            if(countPainters(arr,time)<=k) return time;
        }


        return maxi;

    }
}
