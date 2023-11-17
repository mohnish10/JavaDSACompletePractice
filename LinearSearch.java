package practiceprogramsforjavadsa;

public class LinearSearch
{

    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        search(arr,45);

    }

    public static void search(int[] arr,int target)
    {

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==target)
            {

                System.out.println("The element is present at index:- "+i);

                return;
            }
        }

        System.out.println("The element " + target+" is not present");
    }


}
