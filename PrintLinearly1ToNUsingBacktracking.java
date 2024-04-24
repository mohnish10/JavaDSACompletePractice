package practiceprogramsforjavadsa;

import java.util.Scanner;

public class PrintLinearly1ToNUsingBacktracking
{

    public static void printFrom1ToN(int i,int n)
    {

        if(i==0) return;

        printFrom1ToN(i-1,n);

        System.out.println(i);

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number till which you want the numbers from 1");

        int n = sc.nextInt();

        printFrom1ToN(100,100);


    }
}
