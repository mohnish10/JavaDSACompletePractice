package practiceprogramsforjavadsa;

public class PeakElement2
{

    public static int peakElement(int[] arr)
    {

        int peakElement = 0;

        if(arr.length==1) {
            peakElement = arr[0];
        }

        if(arr[0]>arr[1]) {
            peakElement = arr[0];
        }

        if(arr[arr.length-1]>arr[arr.length-2])
        {

            peakElement = arr.length-1;
        }

        int low=1;

        int high=arr.length-2;

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {

                peakElement = arr[mid];
            }
            else if(arr[mid]>arr[mid-1])
            {

                low=mid+1;
            }
            else
            {

                high=mid-1;
            }
        }

        return peakElement;
    }


    public static void main(String[] args)
    {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};

        int result = peakElement(arr);

        System.out.println("Peak element of the array is:- "+result);
    }
}
