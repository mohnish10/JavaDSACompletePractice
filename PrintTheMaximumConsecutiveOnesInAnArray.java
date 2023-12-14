package practiceprogramsforjavadsa;

public class PrintTheMaximumConsecutiveOnesInAnArray
{

    public static int printTheMaximumConsecutiveOnesInAnArray(int[] arr)
    {

        int count = 0;

        int maxOneCount = 0;

        int n = arr.length;

        for(int i=0;i<n;i++)
        {

            if(arr[i]==1)
            {

                count++;
            }
            else
            {

                count = 0;
            }

            maxOneCount = Math.max(count,maxOneCount);



        }

        return maxOneCount;

    }


    public static void main(String[] args)
    {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};

        int result = printTheMaximumConsecutiveOnesInAnArray(arr);

        System.out.println("The maximum consecutive ones in the array are:- "+result);

    }
}
