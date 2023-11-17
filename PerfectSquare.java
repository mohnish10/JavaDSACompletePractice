package practiceprogramsforjavadsa;

import java.util.Scanner;

public class PerfectSquare
{

    public static boolean checkIfPerfectSquare(Integer num)
    {

        for(int i=1;i*i<=num;i++)
        {

            if(i*i==num) {
                return true;
            }
        }

        return false;

    }


    public static void main(String[] args)
    {

        System.out.println("Please enter the number which you want to check if it's a perfect square or not");

        Scanner sc = new Scanner(System.in);

        Integer num = sc.nextInt();

        if(checkIfPerfectSquare(num))
        {

            System.out.println("The number is a perfect square");
        }
        else
        {
            System.out.println("The number is not a perfect square");
        }

    }

}


