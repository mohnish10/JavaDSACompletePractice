package practiceprogramsforjavadsa;

public class LongestCommonPrefix2
{

    public static String longestCommonPrefix(String[] str)
    {

        if(str.length==0) return "";

        if(str.length==1) return str[0];

        String longestCommonPrefix = str[0];

        for(int i=1;i<str.length;i++)
        {

            while(str[i].indexOf(longestCommonPrefix)!=0)
            {

                longestCommonPrefix = longestCommonPrefix.substring(0,longestCommonPrefix.length()-1);
            }


            if(longestCommonPrefix.isEmpty())
            {

                return "-1";
            }

        }

        return longestCommonPrefix;
    }


    public static void main(String[] args)
    {

        String[] input = {"geeksforgeeks","geeks","geek","geezer"};

        System.out.print("The input array is:- ");

        for(String s:input)
        {

            System.out.print(s);
        }

        System.out.println();

        String result = longestCommonPrefix(input);

        System.out.println("The longest common prefix for the input array is:- "+result);
    }

}
