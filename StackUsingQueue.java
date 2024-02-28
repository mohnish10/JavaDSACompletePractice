package practiceprogramsforjavadsa;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue
{

    Queue<Integer> que = new LinkedList<>();

    public void push(int x)
    {

        que.add(x);

        for(int i=0;i<que.size();i++)
        {

            int val = que.remove();

            que.add(val);
        }
    }


    public int top()
    {

        if(que.isEmpty()) return -1;
        else return que.peek();
    }


    public boolean isEmpty()
    {

        return que.isEmpty();
    }


    public int pop()
    {
        int x = 0;

        if(que.isEmpty()) return -1;
        else
        {

            x = que.remove();

        }

         return x;
    }


    public String toString()
    {

        return que.toString();
    }


    public static void main(String[] args)
    {

        StackUsingQueue suq = new StackUsingQueue();

        suq.push(1);
        suq.push(2);
        suq.push(3);
        suq.push(4);

        System.out.println(suq.toString());

        System.out.println(suq.isEmpty());

        System.out.println(suq.top());

        System.out.println(suq.pop());

        System.out.println(suq.top());

        System.out.println(suq.pop());

        System.out.println(suq.top());

        System.out.println(suq.toString());




    }





}
