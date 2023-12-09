package practiceprogramsforjavadsa;

public class ReverseArrayUsingRecursion
{

    public static void reverseArray(int[] arr,int l,int r)
    {

        if(l>=r)
        {

            return;
        }
        else
        {

            swap(arr,l,r);
        }

        reverseArray(arr,l+1,r-1);
    }

    public static void swap(int[] arr,int l,int r)
    {

        int temp = arr[l];

        arr[l] = arr[r];

        arr[r] = temp;
    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5};

        System.out.print("Original array:- ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.print("Array in reverse:- ");

        reverseArray(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

    }
}
