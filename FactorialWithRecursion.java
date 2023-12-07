package practiceprogramsforjavadsa;

import java.util.Scanner;

public class FactorialWithRecursion
{
    public static int factorialWithRecursion(int n)
    {

        if(n==0 || n==1)
        {

            return 1;
        }
        else
        {

            return n * factorialWithRecursion(n-1);
        }
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number for which you want to calculate the factorial");

        int input = sc.nextInt();

        int result = factorialWithRecursion(input);

        System.out.println("The factorial of "+input+" is "+result);
    }

}
