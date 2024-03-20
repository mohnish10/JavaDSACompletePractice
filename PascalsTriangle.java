package practiceprogramsforjavadsa;

import java.util.Scanner;

public class PascalsTriangle
{

    public static void pascalTriangle(int n)
    {

        for(int i=0;i<n;i++)
        {

            int result = (int) Math.pow(11,i);

            String finalResult = String.valueOf(result);

            for(int j=0;j<finalResult.length();j++)
            {

                String ultimateResult = finalResult.charAt(j)+" ";

                System.out.print(ultimateResult);
            }

            System.out.println();
        }

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of rows which you want for the pascals triangle");

        int rows = sc.nextInt();

        pascalTriangle(rows);

    }
}
