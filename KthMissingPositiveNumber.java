package practiceprogramsforjavadsa;

public class KthMissingPositiveNumber
{

    public static int kthMissingPositive(int[] arr,int n,int k)
    {

        n = arr.length;

        for(int i=0;i<n;i++)
        {

            if(arr[i]<=k) k++;
            else break;
        }

          return k;
    }
}
