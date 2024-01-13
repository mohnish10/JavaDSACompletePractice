package practiceprogramsforjavadsa;

import java.util.*;

public class IntersectionOf2Arrays2
{

    public static int intersectionOf2Arrays(int[] a,int[] b)
    {

        int m=a.length;

        int n=b.length;

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i=0;i<m;i++)
        {

            list.add(a[i]);
        }

        for(int i=0;i<n;i++)
        {

            list1.add(b[i]);
        }

        Set<Integer> set = new HashSet<>(list);

        Set<Integer> set2 = new HashSet<>(list1);

        set.retainAll(set2);

        Integer[] arrNew = set.toArray(new Integer[set.size()]);

        return arrNew.length;

    }


    public static void main(String[] args)
    {

        int[] a = {89, 24, 75, 11, 23};

        int[] b = {89, 2, 4};

        intersectionOf2Arrays(a,b);
    }
}
