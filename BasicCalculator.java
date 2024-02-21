package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Stack;

public class BasicCalculator
{

    public static int basicCalculator(String s)
    {

        Stack<Character> operators = new Stack<>();

        Stack<Integer> operands = new Stack<>();

        s = s.replaceAll("\\s","");

        int a = 0;

        int b = 0;

        for(int i=0;i<s.length();i++)
        {

            char c = s.charAt(i);

            if(Character.isWhitespace(c))
            { continue; }
            else if(Character.isDigit(c))
            {

                int num = 0;

                while(Character.isDigit(c))
                {

                    num = num * 10 + c-'0';

                    i++;

                    if(i<s.length()) { c = s.charAt(i) ;}
                    else { break; }

                }
                i--;

                operands.push(num);
            }
            else if(c=='(') operators.push(c);
            else if(c==')')
            {

                while(operators.peek()!='(')
                {

                    int output = performOperation(operands,operators);

                    operands.push(output);

                }

                operators.pop();
            }
            else if(isOperator(c))
            {

                while(!operators.isEmpty() && precedence(c)<=precedence(operators.peek()))
                {

                    int output = performOperation(operands,operators);

                    operands.push(output);
                }

                operators.push(c);
            }

        }


        while(!operators.isEmpty())
        {

            int output = performOperation(operands,operators);

            operands.push(output);
        }


        return operands.pop();

    }


    public static int precedence(char c)
    {

        switch(c)
        {

            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

        }

        return -1;

    }


    public static int performOperation(Stack<Integer> operands,Stack<Character> operators)
    {

        int a = operands.pop();

            int b = operands.pop();

            char operation = operators.pop();

            switch (operation) {


                case '+':
                    return a + b;

                case '-':
                    return b - a;

                case '*':
                    return a * b;

                case '/':
                    if (a == 0) {

                        System.out.println("Division by 0");

                        return 0;
                    }

                    return b / a;

            }

        return 0;

        }






    public static boolean isOperator(char c)
    {

        return (c=='+'||c=='-'||c=='*'||c=='/'||c=='^');
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string");
        
        String expr = sc.next();

        System.out.println(basicCalculator(expr));


        
        
    }


}
