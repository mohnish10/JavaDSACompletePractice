package practiceprogramsforjavadsa;

public class NumberOfOccurrences2
{

    public static int firstOccurrence(int[] arr,int target)
    {

        int low=0;

        int high=arr.length-1;

        int first=-1;

        while(low<=high)
        {

            int mid=(low+high)/2;

            if(arr[mid]==target)
            {
                first= mid;

                high=mid-1;
            }
            else if(arr[mid]<target)
            {

                low=mid+1;
            }
            else
            {

                high=mid-1;
            }
        }

        return first;
    }


    public static int lastOccurrence(int[] arr,int element)
    {

        int low=0;

        int high=arr.length-1;

        int last=-1;

        while(low<=high)
        {

            int mid=(low+high)/2;

            if(arr[mid]==element)
            {

                last=mid;

                low=mid+1;
            }
            else if(arr[mid]<element)
            {

                low=mid+1;
            }
            else
            {

                high=mid-1;
            }
        }

        return last;
    }


    public static int numberOfOccurrences(int[] arr,int target)
    {

        int first = firstOccurrence(arr,target);

        int last = lastOccurrence(arr,target);

        return last-first+1;

    }


    public static void main(String[] args)
    {

        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};

        int target=8;

        int result = numberOfOccurrences(arr,target);

        System.out.println("The number of occurrences of the target:- "+target+" is "+result);
    }

}
