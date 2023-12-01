package practiceprogramsforjavadsa;

import java.util.Stack;

public class ReverseStringUsingStack
{

    public static void reverseString(String str)
    {

        Stack<Character> stack = new Stack<>();

        for(int i=str.length()-1;i>=0;i--)
        {

            stack.push(str.charAt(i));
        }

        System.out.print("The reverse of the string "+str+" is ");

        for(int i=0;i<stack.size();i++)
        {

            System.out.print(stack.get(i));
        }
    }


    public static void main(String[] args)
    {

        reverseString("mac");
    }
}
