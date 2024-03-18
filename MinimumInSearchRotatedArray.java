package practiceprogramsforjavadsa;

public class MinimumInSearchRotatedArray
{

    public static int getMinimumInSortedRotatedArray(int[] arr)
    {

        int minimum = arr[0];

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]<minimum)
            {

                minimum = arr[i];

            }
        }

        if(arr.length==1) return arr[0];

        return minimum;
    }
}
