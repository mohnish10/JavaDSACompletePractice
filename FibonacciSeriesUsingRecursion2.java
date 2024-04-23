package practiceprogramsforjavadsa;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion2
{
    static int n1=0,n2=1,n3=0;
    public static void fibonacci(int n)
    {

        if(n>0)
        {

            n3 = n1+n2;

            n1 = n2;

            n2 = n3;

            System.out.print(" "+n3);

            fibonacci(n-1);

        }

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number till which you want the fibonacci series");

        int n = sc.nextInt();

        System.out.print(n1+" "+n2);

        fibonacci(n-2);





    }
}
