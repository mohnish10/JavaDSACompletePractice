package practiceprogramsforjavadsa;

import java.util.Scanner;

public class BalancedParanthesis2
{

    public static boolean balancedParantheses(String x)
    {

        int openParanthesesCount = 0;

        int closedParanthesesCount = 0;

        for(int i=0;i<x.length();i++)
        {

            if(x.charAt(i)=='{'||x.charAt(i)=='['||x.charAt(i)=='(')
            {

                openParanthesesCount++;

            }
            else if(x.charAt(i)=='}'||x.charAt(i)==']'||x.charAt(i)==')')
            {

                closedParanthesesCount++;
            }
            else
            {

                System.out.println("Invalid character");

                return false;
            }
        }

        if(openParanthesesCount==closedParanthesesCount)
        {

            return true;
        }
        else
        {

            return false;
        }
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string which you want to check is balanced or not");

        String str = sc.next();

        System.out.println(balancedParantheses(str));


    }
}
