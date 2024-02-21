package practiceprogramsforjavadsa;

import java.util.Stack;
import java.util.Scanner;

public class InfixToPrefixExpression
{

    public static String infixToPrefixExpression(String s)
    {

        Stack<String> operands = new Stack<>();

        Stack<Character> operators = new Stack<>();
        
        s = s.replaceAll("\\s+","");

        String result = "";

        for(int i=0;i<s.length();i++)
        {

            char ch = s.charAt(i);

            if(ch=='(') operators.push(ch);
            else if(ch==')')
            {

                while(operators.peek()!='(' && !operands.isEmpty() && !operators.isEmpty())
                {

                    String s2 = operands.pop();

                    String s1 = operands.pop();

                    char c = operators.pop();

                    operands.push(c+s1+s2);
                }

                operators.pop();
            }
            else if(!isOperator(ch))
            {

                operands.push(String.valueOf(ch));
            }
            else
            {

                while(!operators.isEmpty() && precedence(ch)<=precedence(operators.peek()) && !operands.isEmpty())
                {

                    String s2 = operands.pop();

                    String s1 = operands.pop();

                    char c = operators.pop();

                    operands.push(c+s1+s2);
                }

                operators.push(ch);

            }
        }

        while(!operators.isEmpty() && !operands.isEmpty())
        {

            String s2 = operands.pop();

            String s1 = operands.pop();

            char c = operators.pop();

            operands.push(c+s1+s2);
        }


        if(!operands.isEmpty()) result = result + operands.peek();

        return result;

    }


    public static int precedence(char c)
    {

        if(c=='+' || c=='-')
        {

            return 1;
        }
        else if(c=='*' || c=='/')
        {

            return 2;
        }
        else if(c=='^')
        {

            return 3;
        }

        return 0;

    }



    public static boolean isOperator(char c)
    {

        return c == '+' || c == '-' || c == '*' || c == '/' || c=='^';

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the expression");

        String expr = sc.nextLine();

        System.out.println(infixToPrefixExpression(expr));


    }





}
