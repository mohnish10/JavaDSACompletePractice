package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.ArrayList;

public class LongestSubstringWithUniqueCharacters
{

    public static int longestSubstringWithUniqueCharacters(String s)
    {

        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<s.length();i++)
        {

            for(int j=i+1;j<=s.length();j++)
            {

                if(uniqueString(s.substring(i,j)))
                {

                    list.add(s.substring(i,j));
                }
            }
        }

        String longestSubstringUnique = list.get(0);

        for(int i=0;i<list.size();i++)
        {

           if(longestSubstringUnique.length()<list.get(i).length())
           {

               longestSubstringUnique = list.get(i);
           }

        }

        return longestSubstringUnique.length();

    }


    public static boolean uniqueString(String str)
    {

        for(int i=0;i<str.length();i++)
        {

            for(int j=i+1;j<str.length();j++)
            {

                if((str.charAt(i)==str.charAt(j)))
                {

                    return false;

                }
            }
        }

      return true;

    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string for which you want to find the longest substring with unique characters");

        String str = sc.next();

        int result = longestSubstringWithUniqueCharacters(str);

        System.out.println("the longest substring with unique characters is:- "+result);

    }



}
