package practiceprogramsforjavadsa;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class SortingCharactersByFrequency2
{

    public static String frequencySort(String s)
    {

        int n = s.length();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {

            if(map.containsKey(s.charAt(i)))
            {

                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {

                map.put(s.charAt(i),1);
            }

        }


        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();

        for(Character ch:list)
        {

            for(int i=0;i<map.get(ch);i++)
            {

                sb.append(ch);
            }

        }

       return sb.toString();

    }
}
