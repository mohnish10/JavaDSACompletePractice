package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class SearchElementInSortedRotatedArray2
{

    public static boolean search(ArrayList<Integer> arr,int n,int k)
    {

        int low = 0;

        int high = arr.size()-1;

        int mid;

        while(low<=high)
        {

            mid = low + (high-low)/2;

            if(arr.get(mid)==k) return true;
            else if(arr.get(low).equals(arr.get(mid)) && arr.get(mid).equals(arr.get(high)))
            {

                low = low+1;

                high = high-1;

                continue;
            }

            if(arr.get(low)<=arr.get(mid))
            {

                if(arr.get(low)<=k && k<=arr.get(mid))
                {

                    high = mid-1;
                }
                else
                {

                    low = mid+1;
                }

            }
            else
            {

                if(arr.get(mid)<=k && k<=arr.get(high))
                {

                    low = mid+1;
                }
                else
                {

                    high = mid-1;
                }

            }

        }

    return false;

    }
}
