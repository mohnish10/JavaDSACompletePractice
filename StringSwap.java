package practiceprogramsforjavadsa;

import java.util.Scanner;

public class StringSwap
{

    public static void swapStrings(String a,String b)
    {

        String temp = a;

        a = b;

        b = temp;

        System.out.println("The swapped firstString a is:- "+a);

        System.out.println("The swapped secondString b is:- "+b);

    }

    public static void main(String[] args)
    {

        System.out.println("Please enter the first string:- ");

        Scanner sc = new Scanner(System.in);

        String firstString = sc.next();

        System.out.println("Original first string is:- "+firstString);

        System.out.println("Please enter the second string:- ");

        String secondString = sc.next();

        System.out.println("Original second string is:- "+secondString);

        swapStrings(firstString,secondString);




    }
}
