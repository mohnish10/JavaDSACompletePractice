package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class SearchInASorted2dMatrix3
{


    public static boolean searchMatrix(ArrayList<ArrayList<Integer>>arr,int target)
    {

        int n = arr.size();

        int m = arr.get(0).size();

        int low = 0; int high = (m*n)-1;

        while(low<=high)
        {

            int mid = (low+high)/2;

            int rows = mid/m;

            int cols = mid % m;

            if(arr.get(rows).get(cols)==target) return true;
            else if(arr.get(rows).get(cols)<target) low=mid+1;
            else high = mid-1;

        }

        return false;

    }
}
