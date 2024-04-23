package practiceprogramsforjavadsa;

public class PrintNameNtimesUsingRecursion
{

    public static void print(int n)
    {

        if(n==6) return;

        System.out.println("Mohnish");

        print(n+1);
    }


    public static void main(String[] args)
    {

        print(0);
    }

}
