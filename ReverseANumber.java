package practiceprogramsforjavadsa;

import java.util.Scanner;

public class ReverseANumber
{

    public static int reverseNumber(int num)
    {

        int reverseNum = 0;

        while(num>0)
        {

            int lastDigit = num % 10;

            num = num / 10;

            reverseNum = reverseNum * 10 + lastDigit;
        }

        return reverseNum;

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number which you want to reverse");

        int num = sc.nextInt();

        int result = reverseNumber(num);

        System.out.println("The reverse of "+num+" is "+result);

    }
}
