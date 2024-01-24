package practiceprogramsforjavadsa;

import java.util.Scanner;

public class Subsequence
{

    public static boolean subsequence(String A,String B)
    {

        int n = A.length();

        int m = B.length();

        int i = 0;

        int j = 0;

        while(i<n && j<m)
        {

            if(A.charAt(i)==B.charAt(j))
                i++;
            j++;

        }

        return i==n;
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first string");

        String str1 = sc.next();

        System.out.println("Please enter the second string");

        String str2 = sc.next();

        if(subsequence(str1,str2))
        {

            System.out.println("String str1 is a subsequence of str2");
        }
        else
        {

            System.out.println("String str1 is not a subsequence of str2");
        }
    }
}
