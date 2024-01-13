package practiceprogramsforjavadsa;

public class SecondLargestAndSecondSmallestElementInAnArray2
{

    public static int secondLargestElementInAnArray(int[] arr)
    {

        int largest = arr[0];

        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]>largest)
            {

                largest=Math.max(largest,arr[i]);
            }
        }

        for(int i=1;i<arr.length;i++)
        {

            if(arr[i]>secondLargest && arr[i]<largest)
            {

                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }


    public static int secondSmallestElementInAnArray(int[] arr)
    {

        int smallest = arr[0];

        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]<smallest)
            {

                smallest = Math.min(smallest,arr[i]);
            }
        }


        for(int i=1;i<arr.length;i++)
        {

            if(arr[i]<secondSmallest && arr[i]>smallest)
            {

                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }


    public static void main(String[] args)
    {

        int[] arr = {10,20,30,40,50,60};

        int result = secondLargestElementInAnArray(arr);

        System.out.println("The second largest element in an array is:- "+result);

        int secondResult = secondSmallestElementInAnArray(arr);

        System.out.println("The second smallest element in an array is:- "+secondResult);
    }
}
