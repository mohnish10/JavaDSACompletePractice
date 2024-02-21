package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfixExpression
{

    public static String infixToPostfixExpression(String s)
    {

        Stack<Character> operators = new Stack<>();

        StringBuilder postfix = new StringBuilder();

        for(int i=0;i<s.length();i++)
        {

            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)) postfix.append(ch);
            else if(ch=='(') operators.push(ch);
            else if(ch==')')
            {

                while(!operators.isEmpty() && operators.peek()!='(')
                {

                    postfix.append(operators.pop());
                }

                if(!operators.isEmpty()) operators.pop();
            }
            else
            {

                while(!operators.isEmpty() && precedence(ch)<=precedence(operators.peek()))
                {

                    postfix.append(operators.pop());
                }

                operators.push(ch);

            }

        }


        while(!operators.isEmpty())
        {

            postfix.append(operators.pop());
        }


        return postfix.toString();

    }


    public static int precedence(char c)
    {

        if(c=='^')
        {

            return 3;
        }
        else if(c=='*' || c=='/')
        {

            return 2;
        }
        else if(c=='+' || c=='-')
        {

            return 1;
        }

        return -1;
    }





    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the expression");

        String expr = sc.next();

        String result  = infixToPostfixExpression(expr);

        System.out.println(result);
    }



}
