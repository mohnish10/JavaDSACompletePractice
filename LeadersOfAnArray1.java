package practiceprogramsforjavadsa;

public class LeadersOfAnArray1
{

    public static void leadersOfAnArray(int[] arr)
    {

        int max_from_right=-1;

        for(int i=arr.length-1;i>=0;i--)
        {

            if(arr[i]>max_from_right)
            {

                max_from_right = arr[i];

                System.out.print(max_from_right+" ");
            }

        }
    }


    public static void main(String[] args)
    {

        int[] arr = {16,17,4,3,5,2};

        System.out.print("Original array arr is:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        System.out.print("Leaders of the array arr are:- ");

        leadersOfAnArray(arr);
    }
}
