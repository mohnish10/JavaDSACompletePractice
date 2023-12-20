package practiceprogramsforjavadsa;

import java.util.Scanner;

public class GCDOrHCF
{

    public static int gcdOrHcf(int num1,int num2)
    {

        int ans =1;

        for(int i=1;i<=Math.min(num1,num2);i++)
        {

            if(num1 % i == 0 && num2%i==0)
            {

                ans = i;

                }

            }

            return ans;

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number");

        int num1 = sc.nextInt();

        System.out.println("Please enter the second number");

        int num2 = sc.nextInt();

        int result = gcdOrHcf(num1,num2);

        System.out.println("The GCD or HCF of "+num1+" and "+num2+" is "+result);

    }


    }

