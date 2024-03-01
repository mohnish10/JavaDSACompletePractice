package practiceprogramsforjavadsa;

import java.util.Queue;
import java.util.LinkedList;


public class QueueUsingStack
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


    public boolean isEmpty()
    {

        return que.isEmpty();
    }


    public String toString()
    {

        return que.toString();
    }


    public static void main(String[] args)
    {

        QueueUsingStack qus = new QueueUsingStack();

        System.out.println("Is the queue empty:- "+qus.isEmpty());

        qus.push(1);

        qus.push(2);

        qus.push(3);

        qus.push(4);

        System.out.println("Current Stack status is:- "+qus.toString());

        System.out.println("Size of the stack is:- "+qus.size());

        System.out.println("Topmost element of the stack is:- "+qus.peek());

        System.out.println("Popping a element now:- "+qus.pop());

        System.out.println("Topmost element of the stack is:- "+qus.peek());

        System.out.println("Popping a element now:- "+qus.pop());

        System.out.println("Size of the stack is:- "+qus.size());

        System.out.println("Is the stack empty:- "+qus.isEmpty());

        qus.push(5);

        System.out.println("Topmost element of the stack is:- "+qus.peek());





    }


}
