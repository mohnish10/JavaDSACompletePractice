package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class CountOfGreaterElementsToTheRight3
{

    public static int[] countGreater(int[] arr,int[] query)
    {

        int n = arr.length;

        int k = query.length;

        int[] result  = new int[k];

        for(int i=0;i<k;i++)
        {

            int count = 0;

            int queryIndex = query[i];

            for(int j = queryIndex+1;j<n;j++)
            {

                if(arr[j]>arr[queryIndex])
                {

                    count++;
                }


            }

            result[i] = count;

        }

        return result;

    }
}
