package practiceprogramsforjavadsa;

import java.util.Scanner;

public class SquareRootOfANumber2
{

    public static int sqrtN(long num)
    {

        int ans = -1;

        ans = (int) Math.sqrt(num);

        return ans;
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number for which you want the square root:- ");

        long num = sc.nextLong();

        int result = sqrtN(num);

        System.out.println("The result of the square root of the number "+num+" is "+result);





    }
}
