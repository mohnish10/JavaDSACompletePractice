package practiceprogramsforjavadsa;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram
{

    public static boolean checkAnagram(String str1,String str2)
    {

        HashMap<Character,Integer> map1 = new HashMap<>();

        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<str1.length();i++)
        {

            if(map1.containsKey(str1.charAt(i)))
            {

                map1.put(str1.charAt(i),map1.get(str1.charAt(i))+1);
            }
            else
            {

                map1.put(str1.charAt(i),1);
            }
        }

        for(int j=0;j<str2.length();j++)
        {

            if(map2.containsKey(str2.charAt(j)))
            {

                map2.put(str2.charAt(j),map2.get(str2.charAt(j))+1);
            }
            else
            {

                map2.put(str2.charAt(j),1);
            }

        }

        return map1.equals(map2);

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first string");

        String str1 = sc.next();

        System.out.println("Please enter the second string");

        String str2 = sc.next();

        boolean result = checkAnagram(str1,str2);

        if(result)
        {

            System.out.println("String "+str1+" is an anagram of "+str2);
        }
        else
        {

            System.out.println("Not an anagram");
        }
    }
}
