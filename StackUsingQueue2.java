package practiceprogramsforjavadsa;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue2
{

    Queue<Integer> que = new LinkedList<>();


    public void push(int x)
    {

        que.add(x);

        for(int i=0;i<que.size()-1;i++)
        {

            que.add(que.remove());
        }
    }


    public int peek()
    {

        if(que.isEmpty()) return -1;
        else return que.peek();
    }


    public int pop()
    {

        if(que.isEmpty()) return -1;
        else return que.remove();
    }


    public int size()
    {

        return que.size();
    }


    public String toString()
    {

        return que.toString();
    }


    public boolean isEmpty()
    {

        return que.isEmpty();
    }


    public static void main(String[] args)
    {

        StackUsingQueue2 suq = new StackUsingQueue2();

        System.out.println("Is the stack empty:- "+suq.isEmpty());

        suq.push(1);

        suq.push(2);

        suq.push(3);

        suq.push(4);

        System.out.println("Current size of the queue is:- "+suq.size());

        System.out.println("Topmost element is:- "+suq.peek());

        System.out.println("Popped element is:- "+suq.pop());

        System.out.println("Is the stack empty:- "+suq.isEmpty());

        System.out.println("Current size of the queue is:- "+suq.size());

        System.out.println("Topmost element is:- "+suq.peek());

        suq.push(5);

        System.out.println("Topmost element is:- "+suq.peek());






    }
}
