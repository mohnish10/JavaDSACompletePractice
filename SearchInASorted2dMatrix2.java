package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class SearchInASorted2dMatrix2
{
    public static boolean binarySearch(ArrayList<Integer>arr,int target)
    {

        int low = 0; int high = arr.size()-1;

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(arr.get(mid)==target) return true;
            else if(arr.get(mid)>target) high=mid-1;
            else low = mid+1;

        }

    return false;

    }


    public static boolean searchInASorted2dMatrix(ArrayList<ArrayList<Integer>>arr,int target)
    {

        int n = arr.size();

        int m = arr.get(0).size();

        boolean result = false;

        for(int i=0;i<n;i++)
        {

            if(arr.get(i).get(0)<=target && target<=arr.get(i).get(m-1))
                result = binarySearch(arr.get(i),target);

        }


        return result;

    }
}
