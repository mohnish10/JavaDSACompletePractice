package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PalindromeWithStringMethod {

    public static void palindrome(String str)
    {

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        String str2 = sb.toString();

        if(str.equals(str2))
        {

            System.out.println("String "+str+" is a palindrome");
        }
        else
        {

            System.out.println("String "+str+" is not a palindrome");
        }






    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string which you want to check if it's a palindrome:- ");

        String str = sc.next();

        palindrome(str);
    }

}

