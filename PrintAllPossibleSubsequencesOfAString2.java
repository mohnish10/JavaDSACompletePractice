package practiceprogramsforjavadsa;

public class PrintAllPossibleSubsequencesOfAString2
{

    public static void solve(int i,String s,String f)
    {

        if(i==s.length())
        {

            System.out.print(f+" ");

            return;

        }

        solve(i+1,s,f+s.charAt(i));

        solve(i+1,s,f);

    }


    public static void main(String[] args)
    {

        String s="abc";

        String f="";

        System.out.print("All Possible subsequences are-");

        solve(0,s,f);




    }
}
