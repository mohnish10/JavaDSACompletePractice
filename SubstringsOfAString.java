package practiceprogramsforjavadsa;

import java.util.Scanner;

public class SubstringsOfAString
{

    public static void main(String[] args)
    {

        System.out.println("Please enter the string for which you want all of the substrings");

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        for(int i=0;i<=input.length();i++)
        {

            for(int j=i+1;j<=input.length();j++)
            {

                System.out.print(input.substring(i,j)+" ");

            }
        }


    }
}
