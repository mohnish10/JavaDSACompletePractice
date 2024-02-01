package practiceprogramsforjavadsa;

import java.util.Stack;

public class MinStack
{

    Stack<Integer> stk;
    Stack<Integer> ms;


    public MinStack()
    {

        stk = new Stack<>();

        ms = new Stack<>();
    }


    public void push(int val)
    {

        stk.push(val);

        if(ms.isEmpty() || val<=ms.peek())
        {

            ms.push(val);
        }
    }


    public void pop()
    {

        int a = stk.pop();

        if(a==ms.peek())
        {

            ms.pop();
        }
    }


    public int top()
    {

        return stk.peek();
    }


    public int getMin()
    {

        if(ms.isEmpty())
        {

            return 0;
        }
        else
        {

            return ms.peek();
        }
    }

}

/*   MinStack

Declare 2 stacks, one to behave like an original stack and the other to act as a minstack

push

- Push the val into minStack and the original stack if they are empty

- Push the val into minStack if the value to be pushed is lesser than the topmost value of the minstack


pop

- Declare a variable to hold the popped value from the original stack

- check if the variable is present at the top of the minstack. If yes, pop the element from the minstack.


top

- Just have the value of stk.peek() returned.


getMin

- return 0 if the minstack is empty

- otherwise, return the value at the top of the minstack     */
