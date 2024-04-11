package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class PaintersPartitionProblem2
{

    public static int countPainters(ArrayList<Integer>arr,int time)
    {

        int painters = 1;

        long boardPainters = 0;

        int n = arr.size();

        for(int i=0;i<n;i++)
        {

            if(boardPainters+arr.get(i)<=time) boardPainters += arr.get(i);
            else
            {

                painters++;

                boardPainters = arr.get(i);
            }

        }

        return painters;

    }


    public static int findLargestMinDistance(ArrayList<Integer> arr,int k)
    {

        int n = arr.size();

        int maxi = Integer.MIN_VALUE;

        int sum = 0;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,arr.get(i));

            sum += arr.get(i);
        }

        int low = maxi; int high = sum;

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(countPainters(arr,mid)>k) low = mid+1;
            else high = mid-1;

        }

        return low;
    }
}
