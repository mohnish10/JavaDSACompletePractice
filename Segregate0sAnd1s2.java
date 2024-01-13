package practiceprogramsforjavadsa;

public class Segregate0sAnd1s2
{

    public static void segregate0sAnd1s(int[] arr)
    {

        int left = 0;

        int right = arr.length-1;

        while(left<right)
        {

            while(arr[left]==0 && left<right)
            {

                left++;
            }


            while(arr[right]==1 && left<right)
            {

                right--;
            }

            if(left<right)
            {

                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }

        }
    }


    public static void main(String[] args)
    {

        int[] arr = {0,1,0,1,1,1};

        System.out.print("Printing the original array:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");

        }

        System.out.println();

        segregate0sAnd1s(arr);

        System.out.print("Printing the segregated array:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

    }
}
