package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class LongestCommonPrefix
{

    public static String longestCommonPrefix(String[] str)
    {

        if(str.length==0)
        {

            return "";
        }

        String longestCommonPrefix = "";

        if(str.length==1)
        {

            return str[0];
        }

        Arrays.sort(str);

        for(int i=0;i<str.length-1;i++)
        {

            if(str[i].charAt(i)==str[i+1].charAt(i))
            {

                longestCommonPrefix = longestCommonPrefix + str[i].charAt(i);
            }
            else
            {

                longestCommonPrefix = null;
            }

        }

        return longestCommonPrefix;

    }


    public static void main(String[] args)
    {

        String[] input = {"apple","ape","zebra"};

        System.out.println(longestCommonPrefix(input));



    }



}
