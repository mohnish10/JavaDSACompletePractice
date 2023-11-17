package practiceprogramsforjavadsa;

public class SumOfNumbersFrom1To100
{

    public static void main(String[] args)
    {

        int sum = 0,i=1;

        while(i<=100)
        {

            sum = sum + i;

            i++;
        }

        System.out.println("The sum of first 100 natural numbers is:- "+sum);

    }
}
