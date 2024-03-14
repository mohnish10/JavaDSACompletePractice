package practiceprogramsforjavadsa;

public class ImplementUpperBoundUsingBinarySearch
{

    public static int implementUpperBound(int[] arr,int key)
    {

        int n = arr.length;

        int low = 0;

        int high = n;

        int mid;

        while(low<high)
        {

            mid = low + (high-low)/2;

            if(key>=arr[mid])
            {

                low = mid+1;
            }
            else
            {

                high = mid;

            }


            if(high<arr.length && key>arr[high])
            {

                return -1;
            }


            return low;

        }







    }

}
