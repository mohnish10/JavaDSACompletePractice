package practiceprogramsforjavadsa;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class IterateHashMap
{

    public static void main(String[] args)
    {

        Map<Integer,Integer> map = new HashMap<>();

        map.put(1,1);

        map.put(2,2);

        map.put(3,3);

        map.put(4,4);

        map.put(5,5);

        System.out.println("Current contents of the map are:- "+map);

        Set<Integer> set = map.keySet();

        System.out.println("Current contents of the keys in the map are:- ");

        List<Integer> list = new ArrayList<>(set);

        for(int i=0;i<list.size();i++)
        {

            System.out.print(list.get(i)+",");
        }

        System.out.println();

        Collection<Integer> col = map.values();

        System.out.println("Current contents of the values in the col are:- "+col);

    }
}
