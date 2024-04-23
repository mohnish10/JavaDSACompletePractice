package practiceprogramsforjavadsa;

import java.util.Scanner;

public class SumOfNNumbersUsingRecursion
{

    public static int sumOfNNumbers(int i)
    {

        if(i==0) return 0;

        return i+sumOfNNumbers(i-1);

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number till which you want the sum");

        int n = sc.nextInt();

        int total = sumOfNNumbers(n);

        System.out.println(total);
    }
}
