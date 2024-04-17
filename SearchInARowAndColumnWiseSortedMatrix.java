package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class SearchInARowAndColumnWiseSortedMatrix
{

    public static boolean binarySearch(int[] arr,int target)
    {

        int low=0; int high = arr.length-1;

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(arr[mid]==target) return true;
            else if(arr[mid]>target) high = mid-1;
            else low=mid+1;

        }

        return false;

    }


    public static boolean searchElement(int[][]matrix,int target)
    {

        int n = matrix.length;

        int m = matrix[0].length;

        for(int i=0;i<n;i++)
        {

            boolean flag = binarySearch(matrix[i],target);

            if(flag) return true;

        }

        return false;

    }
}
