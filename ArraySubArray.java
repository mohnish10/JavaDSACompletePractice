package practiceprogramsforjavadsa;

public class ArraySubArray
{

    public static void subArray(int[] arr)
    {

        int n = arr.length;

        for(int i=0;i<n;i++)
        {

            for (int k=i;k<n;k++)
            {

                for(int j=k;j<=k;j++)
                {

                    System.out.print(arr[j]+" ");

                }

            }
        }

    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5,6};

        subArray(arr);
    }
}
