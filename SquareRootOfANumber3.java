package practiceprogramsforjavadsa;

import java.util.Scanner;

public class SquareRootOfANumber3
{

    public static int sqrt(long N)
    {

        int low = 1;

        int high = (int) N;

        int mid;

        int ans = -1;

        while(low<=high)
        {

            mid = low + (high-low)/2;

            if((long) mid *mid<=N)
            {

               ans = mid;

               low = mid+1;

            }
            else
            {

                high = mid-1;
            }
        }

        return ans;
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number for which you want to find the square root");

        long num = sc.nextLong();

        int result = sqrt(num);

        System.out.println("The result for the entered number "+num+" is "+result);
    }
}
