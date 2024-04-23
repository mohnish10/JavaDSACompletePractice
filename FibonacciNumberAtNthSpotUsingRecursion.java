package practiceprogramsforjavadsa;

import java.util.Scanner;

public class FibonacciNumberAtNthSpotUsingRecursion
{
    public static int fibonacci(int n)
    {

        if(n==1) return 0;

        if(n==2) return 1;

        return fibonacci(n-1)+fibonacci(n-2);

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number till which you want the fibonacci series");

        int n = sc.nextInt();

        int total = fibonacci(n);

        System.out.println(total);



    }
}
