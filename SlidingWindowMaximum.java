package practiceprogramsforjavadsa;

import java.util.Scanner;

public class SlidingWindowMaximum
{

    public static void slidingWindowMaximum(int[] arr,int n,int k)
    {

        n = arr.length;

        for(int i=0;i<n-k+1;i++)
        {

            int max = arr[i];


            for(int j=0;j<k;j++)
            {

                if(arr[i+j]>max)
                {

                    max = arr[i+j];
                }

            }

            System.out.print(max+" ");
        }
    }


    public static void main(String[] args)
    {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int n = arr.length;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the window size");

        int k = sc.nextInt();

        slidingWindowMaximum(arr,n,k);

    }
}
