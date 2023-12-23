package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2
{

    public static boolean checkIfAnagram(String str1,String str2)
    {

        if(str1.length()!=str2.length())
        {

            return false;
        }

        char[] charArray = str1.toCharArray();

        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray);

        Arrays.sort(charArray2);

//        return Arrays.equals(charArray,charArray2);

        for(int i=0;i<charArray.length;i++)
        {

            if(charArray[i]!=charArray2[i])
            {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first string for doing anagram check");

        String str1 = sc.next();

        System.out.println("Please enter the second string for doing anagram check");

        String str2 = sc.next();

        boolean result = checkIfAnagram(str1,str2);

        if(result)
        {

            System.out.println("String "+str1+" and "+str2+" are anagrams of each other");
        }
        else
        {

            System.out.println("String "+str1+" and "+str2+" are not anagrams of each other");

        }

    }
}
