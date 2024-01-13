package practiceprogramsforjavadsa;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm
{

    public static void dutchNationalFlagProblem(int[] arr)
    {

        int low = arr[0];

        int mid = arr[0];

        int high = arr.length-1;

        while(mid<=high)
        {

            if(arr[mid]==0)
            {

                int temp = arr[low];

                arr[low] = arr[mid];

                arr[mid] = temp;

                low++;

                mid++;

            }
            else if(arr[mid]==1)
            {

                mid++;
            }
            else
            {

                int temp = arr[mid];

                arr[mid] = arr[high];

                arr[high] = temp;

                high--;

            }
        }
    }


    public static void main(String[] args)
    {

        int[] arr = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};

        dutchNationalFlagProblem(arr);

        System.out.println(Arrays.toString(arr));
    }
}
