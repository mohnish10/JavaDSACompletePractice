package practiceprogramsforjavadsa;

public class PreviousGreaterElement
{

    public static int[] previousGreaterElement(int[] arr)
    {

        int n = arr.length;

        int[] result = new int[n];

        result[0] = -1;

        for(int i=1;i<n;i++)
        {

            for(int j=i-1;j>=0;j--)
            {

                if(arr[j]>arr[i])
                {

                    result[i] = arr[j];

                    break;
                }
                else
                {

                    result[i] = -1;
                }
            }
        }

        return result;
    }


    public static void main(String[] args)
    {

        int[] arr = {10, 4, 2, 20, 40, 12, 30};

        System.out.print("Original array:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        int[] result1 = previousGreaterElement(arr);

        for(int i:result1)
        {

            System.out.print(i+" ");
        }
    }
}
