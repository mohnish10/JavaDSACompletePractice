package practiceprogramsforjavadsa;

import java.util.Scanner;

public class PowerOfXToN
{

    public static int powerOfXtoN(int x,int n)
    {

        if(x==0) return 0;

        if(n==0) return 1;

        return x * powerOfXtoN(x,n-1);
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number");

        int x = sc.nextInt();

        System.out.println("Please enter the power by which you want to enter the number");

        int n = sc.nextInt();

        int result = powerOfXtoN(x,n);

        System.out.println(result);
    }







}
