package practiceprogramsforjavadsa;

public class MaximumSubarray
{

    public static int maximumSubarray(int[] arr)
    {

        int sum = 0;

        int maximumSubarray = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {

            sum = sum+arr[i];

            if(sum<0)
            {

                sum = 0;
            }

            if(sum>maximumSubarray)
            {

                maximumSubarray = sum;
            }

        }

        if(maximumSubarray<0)
        {

            maximumSubarray = 0;
        }

        return maximumSubarray;
    }


    public static void main(String[] args)
    {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maximumSubarray(arr);

        System.out.println("The maximum subarray of the array arr is:- "+result);

    }

}
