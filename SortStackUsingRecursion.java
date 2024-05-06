package practiceprogramsforjavadsa;

import java.util.Stack;

public class SortStackUsingRecursion
{
    public static void sortedInsert(Stack <Integer> stk,int element)
    {

      if(stk.isEmpty() || stk.peek()<element) stk.push(element);
      else
      {

          int top = stk.peek();

          stk.pop();

          sortedInsert(stk,element);

          stk.push(top);

      }

    }


    public static void sort(Stack<Integer> stk)
    {

        if(!stk.isEmpty())
        {

            int element = stk.peek();

            stk.pop();

            sort(stk);

            sortedInsert(stk,element);

        }

    }


    public static void main(String[] args)
    {

        Stack<Integer> stk = new Stack<>();

        stk.push(1);

        stk.push(5);

        stk.push(-2);

        stk.push(17);

        stk.push(11);

        System.out.println("Original Stack:- "+stk.toString());

        sort(stk);

        System.out.print("Sorted Stack:- ");

        while(!stk.isEmpty())
        {

            System.out.print(stk.peek()+" ");

            stk.pop();

        }

    }


}
