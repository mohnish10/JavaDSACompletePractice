package practiceprogramsforjavadsa;

public class PalindromeUsingRecursion
{

    public static boolean palindromeUsingRecursion(String str,int l,int r)
    {

        int n = str.length();

        if(l>=n/2)
        {

            return true;

        }

        if(str.charAt(l)!=str.charAt(r))
        {

            return false;
        }

        return palindromeUsingRecursion(str,l+1,r-1);

    }


    public static void main(String[] args)
    {
        String str = "madsm";

        System.out.println(palindromeUsingRecursion(str,0,str.length()-1));
    }



}
