package practiceprogramsforjavadsa;

import java.util.Scanner;

public class SquareRootOfANumber
{

    public static int sqrt(long N)
    {

        int ans = -1;

        for(int i = 1; (long) i *i<=N; i++)
        {

            ans = i;
        }

        return ans;

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number which you have to find square root for:- ");

        long num = sc.nextLong();

        int result = sqrt(num);

        System.out.println("The result of the entered num "+num+" is "+result);




    }
}
