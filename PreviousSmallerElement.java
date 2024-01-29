package practiceprogramsforjavadsa;

import java.util.Arrays;

public class PreviousSmallerElement
{

    public static int[] previousSmallerElement(int[] arr)
    {

        int n = arr.length;

        int[] result = new int[n];

        result[0] = -1;

        for(int i=1;i<n;i++)
        {

            for(int j=i-1;j>=0;j--)
            {

                if(arr[j]<arr[i])
                {

                    result[i] = arr[j];

                    break;

                }
                else
                {

                    result[i]=-1;
                }
            }
        }

        return result;
    }


    public static void main(String[] args)
    {

        int[] arr1 = {1,3,0,2,5};

        int[] result = previousSmallerElement(arr1);

        System.out.println(Arrays.toString(result));


    }
}
