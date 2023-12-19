package practiceprogramsforjavadsa;

import java.util.Scanner;

public class RemoveOuterParenthesis
{

    public static String removeOuterParentheses(String str)
    {

        int n = str.length();

        int leftCount = 0;

        int rightCount = 0;

        String result="";

        int start = 0;

        for(int i=0;i<n;i++)
        {

            if(str.charAt(i)=='(')
            {

                leftCount++;
            }
            else
            {

                rightCount++;
            }

            if(leftCount==rightCount)
            {

                result += str.substring(start+1,i);

                start = i+1;
            }

        }

        return result;
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string which you want to check");

        String str = sc.next();

        String result = removeOuterParentheses(str);

        System.out.println("The string after the removal of the outer paranthesis is:- "+result);

    }





}
