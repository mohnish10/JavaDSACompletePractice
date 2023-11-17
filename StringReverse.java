package practiceprogramsforjavadsa;

import java.util.Scanner;

public class StringReverse
{

    public static void reverseString(String str)
    {

        char[] input = str.toCharArray();

        System.out.print("The string in reverse is:- ");

        for(int i=input.length-1;i>=0;i--)
        {

            System.out.print(input[i]);

        }

    }


    public static void main(String[] args)
    {

        System.out.println("Please enter the string for which you want the reverse of:- ");

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        reverseString(input);


    }
}
