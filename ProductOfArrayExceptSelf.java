package practiceprogramsforjavadsa;

public class ProductOfArrayExceptSelf
{

    public static void productOfArrayExceptSelf(int[] arr)
    {

        System.out.print("Original array is:- ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(+arr[i]+",");
        }

        int prod = 1;

        for(int i=0;i<arr.length;i++)
        {

            prod = prod * arr[i];
        }

        int[] productArray = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {

            productArray[i] = prod/arr[i];
        }

        System.out.println();

        System.out.print("Product of the array except self is:- ");

        for(int i=0;i<productArray.length;i++)
        {

            System.out.print(productArray[i]+" ");
        }
    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4};

        productOfArrayExceptSelf(arr);
    }
}
