package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfixExpression
{

    public static String prefixToInfixExpression(String s)
    {

        Stack<String> operands = new Stack<>();

        for(int i=s.length()-1;i>=0;i--)
        {

            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch))
            {

                operands.push(ch+"");
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^')
            {

                if(!operands.isEmpty())
                {

                    String op1 = operands.pop();

                    String op2 = operands.pop();

                    String temp = "(" + op1 + ch + op2 + ")";

                    operands.push(temp);
                }

            }
        }

        return operands.peek();

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the expression");

        String expr = sc.next();

        System.out.println(prefixToInfixExpression(expr));
    }



}
