package practiceprogramsforjavadsa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInAString2
{

    public static char firstNonRepeatingCharacterInAString(String S)
    {

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        char firstNonRepeatingCharacter = 0;

        for(int i=0;i<S.length();i++)
        {

            if(map.containsKey(S.charAt(i)))
            {

                map.put(S.charAt(i),map.get(S.charAt(i))+1);
            }
            else
            {

                map.put(S.charAt(i),1);
            }
        }


        for(Map.Entry<Character,Integer> m:map.entrySet())
        {

            if(m.getValue()==1)
            {

                firstNonRepeatingCharacter = m.getKey();

                break;
            }
            else
            {

                firstNonRepeatingCharacter = '$';
            }
        }

        return firstNonRepeatingCharacter;

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the input string");

        String str = sc.next();

        char result = firstNonRepeatingCharacterInAString(str);

        if(result=='$')
        {

            System.out.println("There are no non repeating characters in the string");
        }
        else
        {

            System.out.println("The first non repeating character in the string is:- "+result);
        }




    }
}
