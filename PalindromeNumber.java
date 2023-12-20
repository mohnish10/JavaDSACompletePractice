package practiceprogramsforjavadsa;

import java.util.Scanner;

public class PalindromeNumber
{

    public static boolean isNumberPalindrome(int num)
    {

        int temp = num;

        int reverseNum = 0;

        while(num>0)
        {

            int lastDigit = num % 10;

            num = num / 10;

            reverseNum = reverseNum * 10 + lastDigit;

        }

        if(temp==reverseNum)
        {

            return true;
        }


        return false;

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number which you want to check is a palindrome");

        int num = sc.nextInt();

        boolean result = isNumberPalindrome(num);

        if(result)
        {

            System.out.println(num+" is a palindrome");
        }
        else
        {

            System.out.println(num+" is not a palindrome");
        }

    }
}
