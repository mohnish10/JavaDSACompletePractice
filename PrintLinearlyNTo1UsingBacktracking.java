package practiceprogramsforjavadsa;

import java.util.Scanner;

public class PrintLinearlyNTo1UsingBacktracking
{

    public static void printLinearlyFromNTo1(int i,int n)
    {

        if(i>n) return;

        printLinearlyFromNTo1(i+1,n);

        System.out.println(i+" ");

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number till which you want to display the numbers from 1");

        int n = sc.nextInt();

        printLinearlyFromNTo1(1,n);
    }
}
