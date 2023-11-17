package practiceprogramsforjavadsa;

import java.util.Scanner;

public class MultiplicationTable
{

    public static void main(String[] args)
    {

        System.out.println("Please enter the number for which you want the multiplication table");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("The multiplication table for "+num+"is mentioned below:-");

        for(int i=1;i<=10;i++)
        {

            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
