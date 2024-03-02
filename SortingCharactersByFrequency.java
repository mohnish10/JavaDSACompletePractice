package practiceprogramsforjavadsa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Arrays;

public class SortingCharactersByFrequency
{

    public static String sortingCharactersByFrequencyInTheIncreasingOrder(int n, String s)
    {

        n = s.length();

        Map<Character,Integer> map = new HashMap<>();

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

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        for(Map.Entry<Character,Integer> m: map.entrySet())
        {

            list.add(m.getValue());
        }

        list.sort(Collections.reverseOrder());

        LinkedHashMap<Character,Integer> sortedMap = new LinkedHashMap<>();

        for(int num:list)
        {

            for(Map.Entry<Character,Integer> m:map.entrySet())
            {

                if(m.getValue().equals(num))
                {

                    sortedMap.put(m.getKey(),num);
                }

            }

        }

        String newString = "";

        for(Map.Entry<Character,Integer> m:map.entrySet())
        {


            newString = newString + String.valueOf(m.getKey()).repeat(m.getValue());

        }

       char[] c1 = newString.toCharArray();

       Arrays.sort(c1);

       char[] c2 = new char[c1.length];

      for(int i=c1.length-1;i>=0;i--)
      {

          c2[i] = c1[i];
      }

      for(int i=0;i<c2.length;i++)
      {

          sb.append(c2[i]);
      }


        return sb.toString();

    }


    public static void main(String[] args)
    {

        String s = "abAb";

        String result = sortingCharactersByFrequencyInTheIncreasingOrder(s.length(),s);

        System.out.println(result);


    }
}
