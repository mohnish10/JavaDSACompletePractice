package practiceprogramsforjavadsa;

import java.util.Scanner;

public class PalindromeCheckUsingRecursion
{

    public static boolean checkIfStringIsPalindrome(String s,int l,int r)
    {

        int n = s.length();

        if(l>=n/2) return true;

        if(s.charAt(l)!=s.charAt(r)) return false;

        return checkIfStringIsPalindrome(s,l+1,r-1);

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string which you want to check is a palindrome or not");

        String s = sc.next();

        boolean result = checkIfStringIsPalindrome(s,0,s.length()-1);

        System.out.println(result);

    }
}
