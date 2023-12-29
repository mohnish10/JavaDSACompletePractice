package practiceprogramsforjavadsa;

public class ElementWhichAppearsOnceInASortedArray3
{

    public static int elementWhichAppearsOnceInASortedArray(int[] arr)
    {

        int xor_arr = 0;

        for(int i=0;i<arr.length;i++)
        {

            xor_arr = xor_arr ^ arr[i];
        }

        return xor_arr;
    }


    public static void main(String[] args)
    {

        int[] arr = {1, 1, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8};

        System.out.print("Original array is:- ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int result = elementWhichAppearsOnceInASortedArray(arr);

        if(result==0)
        {

            System.out.println("There are no unique entries present in the array");
        }
        else
        {

            System.out.println("The unique entry present in the array is:- "+result);
        }



    }
}
