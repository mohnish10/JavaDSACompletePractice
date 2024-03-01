package practiceprogramsforjavadsa;

import java.util.Queue;
import java.util.LinkedList;



public class StackUsingQueue
{

    Queue<Integer> que = new LinkedList<>();

    Queue<Integer> que1 = new LinkedList<>();

    public void push(int x)
    {

        que1.add(x);

        while(!que.isEmpty())
        {

            que1.add(que.peek());

            que.remove();

        }

        Queue<Integer> q = que;

        que = que1;

        que1 = q;

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

        if(que.isEmpty()) { return -1; }

        int x = que.remove();

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

        System.out.println(suq.pop());

        System.out.println(suq.top());



    }





}
