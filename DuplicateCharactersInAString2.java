package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class DuplicateCharactersInAString2
{

    public static void duplicateCharactersInAString(String str)
    {

        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        Set<Character> set = new HashSet<>();

        for(int i=1;i<charArray.length;i++)
        {

            if(charArray[i-1]==charArray[i])
            {

                set.add(charArray[i]);
            }

        }

        System.out.println("Duplicate characters present in the string are:- "+set.toString());
    }


    public static void main(String[] args)
    {

        String str = "geeksforgeeks";

        duplicateCharactersInAString(str);
    }
}
