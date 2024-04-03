package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Stack;

public class DecimalNumberToBinaryNumber2
{

    public static void decimalToBinary(int num)
    {

        Stack<Integer> stk = new Stack<>();

        while(num>0)
        {

            stk.push(num%2);

            num = num /2;

        }

        while(!stk.isEmpty())
        {

            System.out.print(stk.pop());
        }

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number which you want to convert to binary");

        int num = sc.nextInt();

        decimalToBinary(num);
    }
}
