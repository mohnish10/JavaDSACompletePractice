package practiceprogramsforjavadsa;

import java.util.Scanner;

public class Factorial2
{

    public static void main(String[] args)
    {

        System.out.println("Please enter the number for which you want to calculate the factorial");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(),fact = 1,i=1;

        do
        {

            fact = fact * i;

            i++;
        }
        while(i<=num);

        System.out.println("The factorial of "+num+" is "+fact);



    }
}
