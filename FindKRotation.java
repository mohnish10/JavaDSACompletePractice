package practiceprogramsforjavadsa;

public class FindKRotation
{

    public static int findRotation(int[] arr)
    {

        int min = arr[0];

        int minElementIndex = -1;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]<min)
            {

                min = arr[i];

                minElementIndex = i;
            }

        }


       return minElementIndex;

    }
}
