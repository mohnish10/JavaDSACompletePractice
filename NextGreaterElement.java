package practiceprogramsforjavadsa;

import java.util.Arrays;

public class NextGreaterElement
{

    public static int[] nextGreaterElement(int[] arr,int n)
    {

        n = arr.length;

        int[] result = new int[n];

        result[n-1] = -1;

        for(int i=0;i<n;i++)
        {

            for(int j=i+1;j<n;j++)
            {

                if(arr[i]<arr[j])
                {

                    result[i]=arr[j];

                    break;
                }
                else if(arr[i]>=arr[j])
                {

                    result[i]=-1;
                }
            }

        }

        return result;
    }


    public static void main(String[] args)
    {

        int[] arr1 = {1,5,3,4,2};

        int[] result = nextGreaterElement(arr1,arr1.length);

        System.out.println(Arrays.toString(result));
    }
}
