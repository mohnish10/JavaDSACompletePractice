package practiceprogramsforjavadsa;

public class RecursionPrintNumbersInIncreasingFormat
{
    public static void print123(int n)
    {

        if(n==10)
        {

            return;
        }
        else
        {

            System.out.println(n++);
            print123(n);

        }

    }


    public static void main(String[] args)
    {

        print123(1);
    }
}
