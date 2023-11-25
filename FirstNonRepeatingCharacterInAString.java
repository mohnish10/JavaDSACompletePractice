package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;
public class FirstNonRepeatingCharacterInAString
{

    public static void firstNonRepeatingCharacter(String str)
    {

        char[] input = str.toCharArray();

        Character[] refinedInput = new Character[input.length];

        Set<Character> set = new LinkedHashSet<>();

        for(int i=0;i<input.length;i++)
        {

            refinedInput[i] = input[i];
        }

        List<Character> list = new ArrayList<>(Arrays.asList(refinedInput));

        for(int i=0;i<list.size();i++)
        {

            if(Collections.frequency(list,list.get(i))==1)
            {

                set.add(list.get(i));
            }
        }

        List<Character> finalList = new ArrayList<>(set);

        System.out.println("The first non-repeating character in the string is:- "+finalList.get(0));

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string for which you want to find the first non repeating char");

        String str = sc.next();

        firstNonRepeatingCharacter(str);
    }
}
