package practiceprogramsforjavadsa;

import java.util.Scanner;

public class MyStack
{

    int stackLength = 6;

    int[] arr = new int[stackLength];

    int top = -1;


    public boolean stackIsEmpty()
    {

        if(top==-1)
        {

            return true;
        }

        return false;
    }

    public int stackSize()
    {

        return top+1;
    }


    public void push(int data)
    {

        top++;

        arr[top] = data;

    }

    public int pop()
    {

        if(stackIsEmpty())
        {

            System.out.println("Stack is empty..nothing to pop");

            return 0;
        }
        else
        {

            top--;

            return arr[top];

        }
    }

    public void display()
    {

        if(top==-1)
        {

            System.out.println("Stack is empty...nothing to display");
        }
        else
        {

            for(int i=0;i<stackSize();i++)
            {

                System.out.print(arr[i]+" ");
            }
        }

    }


    public int top()
    {

        return arr[top];
    }


    public static void main(String[] args)
    {

        MyStack mys = new MyStack();

        System.out.println("Is the stack currently empty? "+mys.stackIsEmpty());

        mys.push(10);

        mys.push(20);

        mys.push(30);

        mys.push(40);

        mys.push(50);

        mys.push(60);

        System.out.print("Current stack elements are:- ");

        mys.display();

        System.out.println();

        System.out.println("Is the stack currently empty? "+mys.stackIsEmpty());

        System.out.println("The element at the top of the stack is:- "+mys.top());

        mys.pop();

        System.out.println("The element at the top of the stack after first pop operation is:- "+mys.top());

        System.out.print("Current stack elements are:- ");

        mys.display();


    }

}
