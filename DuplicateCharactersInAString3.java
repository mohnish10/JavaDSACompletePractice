package practiceprogramsforjavadsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharactersInAString3
{

    public static void duplicateCharactersInAString(String str)
    {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {

            if(map.containsKey(str.charAt(i)))
            {

                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else
            {

                map.put(str.charAt(i),1);
            }
        }

        for(Map.Entry<Character,Integer> m:map.entrySet())
        {

            if(m.getValue()>1)
            {

                System.out.print(m.getKey()+" - "+m.getValue()+" ");
            }
        }

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string for which you want to find duplicate characters");

        String str = sc.next();

        duplicateCharactersInAString(str);

    }
}
