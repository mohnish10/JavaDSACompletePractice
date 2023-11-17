package practiceprogramsforjavadsa;

import java.util.Scanner;

public class Factorial
{

    public static void main(String[] args)
    {

        System.out.println("Please enter the number for which you want to calculate the factorial");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(),fact=1;

        for(int i=1;i<=num;i++)
        {

            fact = fact * i;
        }

        System.out.println("The factorial of "+num+" is "+fact);




    }
}
