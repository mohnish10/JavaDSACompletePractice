package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArmstrongNumber
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number for which you want to check if it's armstrong or not");

        int num = sc.nextInt();

        int temp = num;

        int sum = 0;

        List<Integer> list = new ArrayList<>();

        while(num>0)
        {

            int digit = num % 10;

            num = num / 10;

            list.add(digit);

        }

        for(int i=0;i<list.size();i++)
        {

            sum += (int) Math.pow(list.get(i),list.size());

        }

        System.out.println("Sum of the addition of the cubes of the respective digits for "+ temp + " is:- "+sum);


        if(sum==temp)
        {

            System.out.println("The number "+temp+ " is an armstrong number");
        }
        else
        {

            System.out.println("The number "+temp+" is not an armstrong number");
        }









    }
}
