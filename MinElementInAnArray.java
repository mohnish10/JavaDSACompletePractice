package practiceprogramsforjavadsa;

public class MinElementInAnArray
{
    public static int min(int[] arr)
    {

        int min = arr[0];

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]<min)
            {

                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args)
    {

        int[] arr = {10,0,-1,20,5,4,30,6};

        int minInAnArray = min(arr);

        System.out.println("The minimum element in arr is:- "+minInAnArray);
    }


}
