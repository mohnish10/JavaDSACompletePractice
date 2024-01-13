package practiceprogramsforjavadsa;

public class StringReverse2
{

    public static String reverse(String str)
    {

        char[] charArray = str.toCharArray();

        int start = 0;

        int end = str.length()-1;

        while(start<end)
        {

            char temp = charArray[start];

            charArray[start] = charArray[end];

            charArray[end] = temp;

            start++;

            end--;

        }

        return new String(charArray);

    }


    public static void main(String[] args)
    {

        String str = "church";

        System.out.println(reverse(str));
    }
}
