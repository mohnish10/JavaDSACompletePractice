package practiceprogramsforjavadsa;

public class ArrayDuplicateCheck
{

    public static void checkIfArrayContainsDuplicates(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {

                if(arr[i]==arr[j])
                {

                    System.out.println("Array arr contains duplicate");

                    return;
                }
            }
        }

        System.out.println("Array does not contain duplicate");
    }


    public static void main(String[] args)
    {

        int[] arr = {0,1,2,3,4,5,2};

        System.out.print("Entered array:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        checkIfArrayContainsDuplicates(arr);
    }

}
