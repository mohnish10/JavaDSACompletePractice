package practiceprogramsforjavadsa;

import java.util.Scanner;

public class PrintNameMultipleTimesUsingRecursion
{

    public static void printName(int input)
    {

        if(input==0)
        {

            return;
        }
        else {

            input--;

            printName(input);

            System.out.println("Mohnish");
        }



    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the input ");

        int input = sc.nextInt();

        printName(input);
    }




}
