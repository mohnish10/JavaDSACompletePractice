package practiceprogramsforjavadsa;

public class SearchInsertedPosition
{

    public static int searchInsertedPosition(int[] arr,int m)
    {

        int n = arr.length;

        int low = 0;

        int high = n;

        int mid;

        while(low<high)
        {

            mid = (low)+(high-low)/2;

            if(m==arr[mid]) return mid;
            else if(m>arr[mid])
            {

                low = mid+1;
            }
            else if(m<arr[mid])
            {

                high = mid;
            }
            else
            {

                for(int i=0;i<n-1;i++)
                {

                    if(arr[i]<m && arr[i+1]>m)
                    {

                        return i+1;
                    }

                }

            }

        }

        return low;

    }
}
