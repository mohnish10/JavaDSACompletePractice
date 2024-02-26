package practiceprogramsforjavadsa;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseAQueue
{

    public static void main(String[] args)
    {

        Queue<Integer> que = new LinkedList<>();

        que.add(1);

        que.add(2);

        que.add(3);

        que.add(4);

        Stack<Integer> stk = new Stack<>();

        while(!que.isEmpty())
        {

            stk.push(que.poll());
        }

        while(!stk.isEmpty())
        {

            que.add(stk.pop());
        }

        System.out.println(que.toString());


    }
}
