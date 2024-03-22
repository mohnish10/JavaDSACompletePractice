package practiceprogramsforjavadsa;

import java.util.Scanner;

public class nthRootOfANumber
{

    public static int nthRoot(int n,int m)
    {
        for(int i=1;i<m;i++)
        {

            long val = (long) Math.pow(i,n);

            if(val==(long) m) return i;
            else if(val>(long) m) break;

        }


       return -1;

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the base");

        int base = sc.nextInt();

        System.out.println("Please enter the exponent");

        int exp = sc.nextInt();

        int result = nthRoot(base,exp);

        System.out.println("The exponent raised to the base is:- "+result);



    }
}
