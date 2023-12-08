package practiceprogramsforjavadsa;

import java.util.Scanner;

public class SumOfNNumbersWithRecursion
{

    public static int sumOfNumbers(int n)
    {

        if(n==0)
        {

            return n;
        }
        else
        {

            return n+sumOfNumbers(n-1);

        }

    }


    public static void main(String[] args)
    {

        System.out.println(sumOfNumbers(3));
    }
}
