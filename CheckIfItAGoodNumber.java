package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Stack;

public class CheckIfItAGoodNumber
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number which you want to check if it's a good number or not");

        int number = sc.nextInt();

        Stack<Integer> stk = new Stack<>();

        while(number>0)
        {

            int digit = number % 10;

            number = number / 10;

            stk.add(digit);

        }

        int top_Element = stk.peek();

        stk.pop();

        int sum = 0;

        while(!stk.isEmpty()) sum += stk.pop();

        if(top_Element>sum) System.out.println("It's a good number");
        else System.out.println("It's not a good number");

    }
}
