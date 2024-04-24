package practiceprogramsforjavadsa;

import java.util.Scanner;

public class SumOfNNumbersUsingRecursion2
{
    public static void sum(int i,int sum)
    {

        if(i<1)
        {

            System.out.println(sum);

            return;
        }

        sum(i-1,sum+i);

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the numbers till which you want the sum");

        int n = sc.nextInt();

        sum(n,0);

    }
}
