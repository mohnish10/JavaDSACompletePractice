package practiceprogramsforjavadsa;

import java.util.Scanner;

public class ComparisionOf3Integers
{

    public static void compare3Numbers(int a,int b,int c)
    {

        if(a>b & a>c)
        {

            System.out.println("a is the greatest");
        }
        else if(c>a & c>b)
        {

            System.out.println("c is the greatest");
        }
        else
        {
            System.out.println("b is the greatest");
        }




    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first integer");

        int a = sc.nextInt();

        System.out.println("Please enter the second integer");

        int b = sc.nextInt();

        System.out.println("Please enter the third integer");

        int c = sc.nextInt();

        compare3Numbers(a,b,c);




    }
}
