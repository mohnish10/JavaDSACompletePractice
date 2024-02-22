package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfixExpression
{

    public static String prefixToPostfixExpression(String exp)
    {

        Stack<String> operands = new Stack<>();

        for(int i=exp.length()-1;i>=0;i--)
        {

            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch))
            {

                operands.push(String.valueOf(ch));
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^')
            {

                if(!operands.isEmpty())
                {

                    String s1 = operands.pop();

                    String s2 = operands.pop();

                    String temp = s1+s2+ch;

                    operands.push(temp);
                }
            }

        }


        return operands.peek();

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string");

        String expr = sc.next();

        System.out.println(prefixToPostfixExpression(expr));
    }

}
