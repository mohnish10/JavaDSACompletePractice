package practiceprogramsforjavadsa;

import java.util.Scanner;

public class PalindromeWithoutStringMethod
{

//    public static void palindrome(String str)
//    {
//
//        char[] input1 = str.toCharArray();
//
//        String str2="";
//
//        for(int i=input1.length-1;i>=0;i--)
//        {
//
//            str2 = str2 + str.charAt(i);
//
//        }
//
//        if(str.equals(str2))
//        {
//
//            System.out.println("String "+str+" is a palindrome");
//        }
//        else
//        {
//
//            System.out.println("String "+str+" is not a palindrome");
//        }
//
//    }


    public static void palindrome(String str)
    {

        int i = 0;

        int j = str.length()-1;

        while(i<j)
        {

            if(str.charAt(i)!=str.charAt(j))
            {

                System.out.println("Not a palindrome");

                return;
            }

            i++;

            j--;
        }

               System.out.println("A palindrome");

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string which you want to check is a palindrome");

        String str = sc.next();

        palindrome(str);

    }





}
