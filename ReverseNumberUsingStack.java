package practiceprogramsforjavadsa;

import java.util.Stack;

public class ReverseNumberUsingStack
{

    public static void reverseNumberUsingStack(int num)
    {

        Stack<Integer> stack  = new Stack<>();

        while(num>0)
        {

            int digit = num % 10;

            num = num / 10;

            stack.push(digit);

        }

        System.out.print("Reverse of the number is:- ");

        for(int i=0;i<stack.size();i++)
        {

            System.out.print(stack.get(i));
        }

    }

    public static void main(String[] args)
    {

        reverseNumberUsingStack(123);
    }
}
