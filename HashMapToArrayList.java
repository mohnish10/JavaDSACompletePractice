package practiceprogramsforjavadsa;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Collection;

public class HashMapToArrayList
{

    public static void main(String[] args)
    {

        Map<Integer,Integer> hm = new HashMap<>();

        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,3);

        System.out.println("HashMap's current contents are:- "+hm.toString());

        Set<Map.Entry<Integer,Integer>> set = hm.entrySet();

        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>();

        for(Map.Entry<Integer,Integer> m:set)
        {

            list.add(m);
        }

        System.out.println("Current contents of the list are:- "+list);

    }

}
