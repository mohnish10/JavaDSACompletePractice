package practiceprogramsforjavadsa;

import java.util.Scanner;

public class FirstNegativeIntegerInKSizeWindow
{

    public static void firstNegativeIntegerOfKSizeWindow(int[] arr,int n,int k)
    {

        n = arr.length;

        boolean flag;

        for(int i=0;i<n-k+1;i++)
        {

            flag = false;

            for(int j=0;j<k;j++)
            {

                if(arr[i+j]<0)
                {

                    System.out.print(arr[i+j]+" ");

                    flag = true;

                    break;
                }

            }

            if(!flag)
            {

                System.out.println("0"+" ");
            }

        }
    }


    public static void main(String[] args)
    {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};

        int n = arr.length;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of the window");

        int k = sc.nextInt();

        firstNegativeIntegerOfKSizeWindow(arr,n,k);





    }
}
