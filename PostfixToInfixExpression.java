package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfixExpression
{

    public static String postfixToInfixExpression(String s)
    {

        Stack<String> operands = new Stack<>();

        for(int i=0;i<s.length();i++)
        {

            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch))
            {

                operands.push(String.valueOf(ch));

            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^') {

                if(!operands.isEmpty()) {
                    String op1 = operands.pop();

                    String op2 = operands.pop();

                    String temp = "(" + op2 + ch + op1 + ")";

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

        System.out.println(postfixToInfixExpression(expr));
    }
}
