package practiceprogramsforjavadsa;

public class FibonacciSeriesWithRecursion
{
    public static int fibonacciSeriesWithRecursion(int n)
    {

        if(n==0)
        {

            return 0;
        }

        if(n==1 || n==2)
        {

            return 1;
        }


        return fibonacciSeriesWithRecursion(n - 1) + fibonacciSeriesWithRecursion(n - 2);


    }


    public static void main(String[] args)
    {

        int n = 10;

        for(int i=0;i<n;i++)
        {

            System.out.print(fibonacciSeriesWithRecursion(i)+" ");
        }
    }
}
