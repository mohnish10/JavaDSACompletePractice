package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWordsInAString
{

    public static String reverseWordsInAString(String s)
    {

        s = s.trim();

        s = s.replaceAll("\\s{2,}"," ");

        String finalResult = "";

        String[] str1 = s.split(" ");

        for(int i=str1.length-1;i>=0;i--)
        {

             finalResult = finalResult+str1[i]+" ";

        }

        return finalResult.trim();

    }


    public static void main(String[] args)
    {

        String str = "the sky is blue";

        System.out.println(reverseWordsInAString(str));
    }
}
