package practiceprogramsforjavadsa;

import java.util.Stack;
import java.util.Scanner;

public class BalancedParanthesis
{
    
    public static boolean isBalancedParanthesis(String s)
    {

        Stack<Character> stk = new Stack<>();

        if(s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}')
        {

            return false;
        }

        if(s.indexOf('(')==-1 && s.charAt(s.length()-1)==')')
        {

            return false;
        }


        if(s.indexOf('[')==-1 && s.charAt(s.length()-1)==']')
        {

            return false;
        }


        if(s.indexOf('{')==-1 && s.charAt(s.length()-1)=='}')
        {

            return false;
        }


        for(int i=0;i<s.length();i++)
        {

            char c = s.charAt(i);

            if(c=='(' || c=='[' || c=='{')
            {

                stk.push(c);
            }


            if(stk.isEmpty())
            {

                return false;
            }

            char check;

            switch(c)
            {

                case ')':

                    check = stk.pop();

                    if(check=='[' || check=='{')
                    {

                        return false;
                    }

                    break;


                case ']':

                    check = stk.pop();

                    if(check=='(' || check=='{')
                    {

                        return false;
                    }

                    break;


                case '}':

                    check = stk.pop();

                    if(check=='[' || check=='(')
                    {

                        return false;
                    }

                    break;
            }


        }

        return stk.isEmpty();

    }





    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string which you want to check");

        String str = sc.next();

        if(isBalancedParanthesis(str))
        {

            System.out.println("The brackets are balanced");
        }
        else
        {

            System.out.println("The brackets are not balanced");
        }


    }

    
}


/*

declare a stack

declare a for loop and iterate through the string

if there is a opening brace present, push it into the stack

check if the stack is empty

if yes, return false

declare a character to store the stack.pop result

if you come across any closing brace, pop the stack

check if the popped character is the opening brace for the closing brace

if yes, then continue else return false

finally check if the stack is empty and accordingly return the result

*/