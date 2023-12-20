package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllDivisors
{

    public static void printAllDivisors(int num)
    {

        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=num;i++)
        {

            if(num%i==0)
            {

                list.add(i);
            }
        }

        System.out.println("The divisors of the number are "+list);

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number whose divisors need to be found");

        int num = sc.nextInt();

        printAllDivisors(num);

    }


}
