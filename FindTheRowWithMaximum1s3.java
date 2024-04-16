package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class FindTheRowWithMaximum1s3
{
    public static int lowerBound(ArrayList<Integer>arr,int n,int x)
    {

      int low = 0; int high = n-1;

      int ans = n;

      while(low<=high)
      {

          int mid = (low+high)/2;

          if(arr.get(mid)>=x)
          {

              ans = mid;

              high = mid-1;

          }
          else
          {

              low = mid+1;
          }
      }


return ans;

    }


    public static int findMaxNumberOf1s(ArrayList<ArrayList<Integer>>arr1,int n,int m)
    {

        int cntMax = 0;

        int index = -1;

        for(int i=0;i<n;i++)
        {

            int cntOnes = m-lowerBound(arr1.get(i),m,1);

            if(cntOnes>cntMax)
            {

                cntMax = cntOnes;

                index = i;
            }

        }


    return index;

    }
}
