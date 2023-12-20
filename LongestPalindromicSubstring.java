package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LongestPalindromicSubstring
{

    public static String longestPalindromicSubstring(String str)
    {

        List<String> list = new ArrayList<>();

        for(int i=0;i<str.length();i++)
        {

            for(int j=i+1;j<=str.length();j++)
            {

                if(checkPalindrome(str.substring(i,j)))
                {

                    list.add(str.substring(i,j));
                }

            }
        }

        String longestPalindrome = list.get(0);

        for(int i=0;i<list.size();i++)
        {

            if(longestPalindrome.length()<list.get(i).length())
            {

                longestPalindrome = list.get(i);
            }

        }

        return longestPalindrome;

    }


    public static boolean checkPalindrome(String str)
    {

        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString().equals(str);
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string to find the longest palindromic substring length");

        String str = sc.next();

        String result = longestPalindromicSubstring(str);

        System.out.println("longest palindromic substring is- "+result);


    }





}
