package practiceprogramsforjavadsa;

import java.util.*;

public class ReorderQueue
{

    public static void main(String[] args)
    {

        Queue<Integer> q1 = new LinkedList<>();

        q1.add(1);

        q1.add(8);

        q1.add(2);

        q1.add(7);

        q1.add(3);

        q1.add(6);

        q1.add(4);

        q1.add(5);

        System.out.print("Original queue without sorting:- "+q1.toString());

        ArrayList<Integer> list = new ArrayList<>();

        int n = q1.size();

        for(int i=0;i<n;i++)
        {

            list.add(q1.remove());
        }

        Collections.sort(list);

        System.out.println();

        System.out.println("Queue after sorting");

        for(int i=0;i<list.size();i++)
        {

            q1.add(list.get(i));
        }

        System.out.print(q1.toString());











    }
}
