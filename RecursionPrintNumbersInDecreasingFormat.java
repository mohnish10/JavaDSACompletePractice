package practiceprogramsforjavadsa;

public class RecursionPrintNumbersInDecreasingFormat
{
    public static void printNumbersInDecreasingFormat(int n)
    {

        if(n==0)
        {

            return;
        }
        else
        {

            System.out.print(n--+" ");
            printNumbersInDecreasingFormat(n);
        }
    }


    public static void main(String[] args)
    {

        printNumbersInDecreasingFormat(12);
    }
}
