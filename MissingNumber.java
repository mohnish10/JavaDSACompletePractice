package practiceprogramsforjavadsa;

public class MissingNumber
{
    public static int missingNumber(int[] arr)
    {

        int n = arr.length;

        int sum = (n)*(n+1)/2;

        int res = 0;

        for(int i=0;i<arr.length;i++)
        {

            res = res + arr[i];
        }

        return sum-res;
    }

    public static void main(String[] args)
    {

        int[] arr = {0,1,2,3,4,5,6,7,9};

        int missingNum = missingNumber(arr);

        System.out.println("The missing number in array arr is:- "+missingNum);

    }
}
