package practiceprogramsforjavadsa;

public class CheckIfArrayIsSortedRecursively
{

    public static boolean checkIfArrayIsSorted(int[] arr,int i)
    {

        if(i==arr.length-1)
        {

            return true;
        }

        if(arr[i]>arr[i+1])
        {

            return false;
        }

        return checkIfArrayIsSorted(arr,i+1);
    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5,6};

        System.out.println(checkIfArrayIsSorted(arr,0));

    }
}
