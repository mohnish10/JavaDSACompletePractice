package practiceprogramsforjavadsa;

import java.util.Scanner;

public class FactorialOfNNumbersUsingRecursion
{
    public static int fact(int n)
    {

         if(n==1) return 1;

         return n*fact(n-1);

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number for which you want the factorial");

        int n = sc.nextInt();

        int total = fact(n);

        System.out.println(total);




    }
}
