package practiceprogramsforjavadsa;

import java.util.Scanner;

public class CountDigits
{

    public static int countDigits(int num)
    {

        int count =0;

        while(num>0)
        {

            count++;

            num = num/10;
        }

        return count;
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number which you want to count the number of digits for");

        int num = sc.nextInt();

        int result = countDigits(num);

        System.out.println("The count of digits of the number "+num+" is "+result);

    }
}
