package practiceprogramsforjavadsa;

public class MaxElementInAnArray
{

    public static int max(int[] arr)
    {

        int max = arr[0];

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]>max)
            {

                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args)
    {

        int[] arr = {10,20,55,30,40,45};

        int maxInAnArray = max(arr);

        System.out.println("The max element in arr is:- "+maxInAnArray);
    }
}
