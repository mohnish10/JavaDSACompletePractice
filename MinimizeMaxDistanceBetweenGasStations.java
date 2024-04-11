package practiceprogramsforjavadsa;

public class MinimizeMaxDistanceBetweenGasStations
{

    public static double minimizeMaxDistance(int[] arr,int k)
    {

        int n = arr.length;

        int[] howMany = new int[n-1];

        for(int i=1;i<=k;i++)
        {

            int maxInd = -1; double maxSection = -1;

            for(int j=0;j<n-1;j++)
            {

                double diff = arr[j+1]-arr[j];

                double sectionLength = diff/(double) (howMany[j]+1);

                if(sectionLength>maxSection)
                {

                    maxSection = sectionLength;

                    maxInd = j;
                }

            }

            howMany[maxInd]++;

        }


        double maxAns = -1;

        for(int i=0;i<n-1;i++)
        {

            double diff = arr[i+1]-arr[i];

            double sectionLength = diff / (double) (howMany[i]+1);

            maxAns = Math.max(maxAns,sectionLength);
        }

        return maxAns;

    }
}
