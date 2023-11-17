package practiceprogramsforjavadsa;

import java.util.Scanner;

public class FibonacciSeries
{

    public static void main(String[] args)
    {

        int firstTerm = 0,secondTerm = 1,nextTerm=0;

        System.out.println("Please enter the number till which you want the fibonacci series");

        Scanner sc = new Scanner(System.in);

        int term = sc.nextInt();

        for(int i=2;i<=term;i++)
        {

            nextTerm = firstTerm+secondTerm;

            firstTerm = secondTerm;

            secondTerm = nextTerm;

        }

        System.out.println("The fibonacci series till "+term+" is "+nextTerm);


    }
}
