package practiceprogramsforjavadsa;

import java.util.Scanner;
public class CapitalizedLettersInAString
{

//    public static void capitalizedStringLetters(String str)
//    {
//
//        char[] input = str.toCharArray();
//
//        for(int i=0;i<input.length;i++)
//        {
//
//            if((int) input[i]>=65 && (int) input[i]<=90)
//            {
//
//                System.out.println("Capitalized letter is:- "+input[i]);
//            }
//        }
//
//    }
//
//    public static void capitalizedWord(String str)
//    {
//
//
//        if((int) str.charAt(0)>=65 && (int) str.charAt(0)<=90)
//            {
//
//                System.out.println("Word is capitalized");
//            }
//        else
//        {
//
//            System.out.println("Word is not capitalized");
//        }
//
//    }


    public static void capitalizedWordCount(String str)
    {

        String[] result = str.split("\\s");

        int count = 0;

        for(int i=0;i<result.length;i++)
        {

            if((int) result[i].charAt(0)>=65 && (int) result[i].charAt(0)<=90)
            {

                count++;

            }
        }

        System.out.println("Count of capitalized words in the string are:- "+count);
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string");

        String str = sc.nextLine();

//        capitalizedStringLetters(str);
//
//        capitalizedWord(str);

        capitalizedWordCount(str);



    }
}
