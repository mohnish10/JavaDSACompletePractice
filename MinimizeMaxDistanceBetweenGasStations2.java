package practiceprogramsforjavadsa;

import java.util.PriorityQueue;

public class MinimizeMaxDistanceBetweenGasStations2
{
    public static class Pair
    {

        double first;

        int second;


        Pair(double first,int second)
        {

            this.first = first;

            this.second = second;
        }

    }


    public static double minimizeMaxDistance(int[] arr,int K)
    {

        int n = arr.length;

        int[] howMany = new int[n-1];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Double.compare(b.first,a.first));

        for(int i=0;i<n-1;i++)
        {

            pq.add(new Pair(arr[i+1]-arr[i],i));
        }

        for(int j=1;j<=K;j++)
        {

            Pair tp = pq.poll();

            int secInd = tp.second;

            howMany[secInd]++;

            double iniDiff = arr[secInd+1]-arr[secInd];

            double newSecLen = iniDiff/(double) (howMany[secInd]+1);

            pq.add(new Pair(newSecLen,secInd));
        }


        return pq.peek().first;

    }
}
