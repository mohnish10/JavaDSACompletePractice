package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class DuplicateCharactersInAString
{
    public static void duplicateCharacters(String str)
    {

        char[] input = str.toCharArray();

        Set<Character> set = new HashSet<>();

        for(int i=0;i<input.length;i++)
        {

            for(int j=i+1;j<input.length;j++)
            {

                if(input[i]==input[j])
                {

                    set.add(input[i]);
                }
            }

        }

        if(set.isEmpty())
        {

            System.out.println("There are no duplicate characters present in the string "+str);
        }
        else
        {

            System.out.println("The duplicate characters present in a string are:- "+set);

        }
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string for which you want to find the duplicate characters");

        String input = sc.next();

        duplicateCharacters(input);

    }
}
