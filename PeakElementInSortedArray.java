package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class PeakElementInSortedArray
{

    public static int peakElement(ArrayList<Integer> arr)
    {

        int n = arr.size();

        if(n==1) return 0;

        if(n==2 && arr.get(0)>arr.get(1)) return 0;

        if(arr.get(n-1)>arr.get(n-2)) return n-1;

        int low = 1;

        int high = n-2;

        int mid;

        while(low<=high)
        {

            mid = low+(high-low)/2;

            if(arr.get(mid)>arr.get(mid-1) && arr.get(mid)>arr.get(mid+1))
            {

                return mid;
            }
            else if(arr.get(mid)>arr.get(mid-1))
            {

                low = mid+1;
            }
            else
            {

                high = mid-1;
            }

        }

        return -1;

    }
}
