package practiceprogramsforjavadsa;

import java.util.Scanner;

public class AddDigitsOfANumber
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number for which you want to add the details");

        int num = sc.nextInt();

        int sum = 0;

        while(num>0)
        {

            int digit = num % 10;

            sum = sum + digit;

            num = num / 10;
        }

        System.out.println("The sum of digits of num "+num+" is "+sum);


    }
}
