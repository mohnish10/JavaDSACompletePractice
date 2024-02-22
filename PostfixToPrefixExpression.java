package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefixExpression
{

    public static String postfixToPrefixExpression(String s)
    {

        Stack<String> operands = new Stack<>();

        for(int i=0;i<s.length();i++)
        {

            char ch = s.charAt(i);

            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^') {

                    String op1 = operands.pop();

                    String op2 = operands.pop();

                    String temp = ch + op2 + op1;

                    operands.push(temp);


            }
            else if(Character.isLetterOrDigit(ch))
            {

                operands.push(String.valueOf(ch));
            }
        }


        return operands.peek();
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the expression");

        String expr = sc.next();

        System.out.println(postfixToPrefixExpression(expr));
    }
}
