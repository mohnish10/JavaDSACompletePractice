package practiceprogramsforjavadsa;

public class SearchInsertPositionInASortedArray2
{

    public static int searchInsertPositionInASortedArray(int[] Arr,int N,int k)
    {

        int start=0;

        int end=Arr.length-1;

        while(start<=end)
        {

            int mid=(start+end)/2;

            if(Arr[mid]==k)
            {

                return mid;
            }
            else if(Arr[mid]>k)
            {

                end=mid-1;
            }
            else
            {

                start=mid+1;
            }
        }

        return end+1;
    }


    public static void main(String[] args)
    {

        int[] arr = {1,3,5,6};

        int n = arr.length;

        int k = 7;

        int result = searchInsertPositionInASortedArray(arr,n,k);

        System.out.println("The insert position in a sorted array is:- "+result);
    }
}
