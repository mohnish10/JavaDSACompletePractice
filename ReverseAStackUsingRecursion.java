package practiceprogramsforjavadsa;

import java.util.Stack;

public class ReverseAStackUsingRecursion
{

    public static void reverse(Stack<Integer> stk) {

        if (!stk.isEmpty()) {
            int top_Element = stk.peek();

            stk.pop();

            reverse(stk);

            stk.push(top_Element);

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

        reverse(stk);

        System.out.print("Reversed Stack:- ");

        while(!stk.isEmpty())
        {

            System.out.print(stk.peek()+" ");

            stk.pop();

        }




    }
}
