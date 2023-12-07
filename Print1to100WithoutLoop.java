package practiceprogramsforjavadsa;

public class Print1to100WithoutLoop
{
    public static void print(int n)
    {

        if(n==101)
        {

            return;
        }
        else
        {

            System.out.println(n++);
            print(n);
        }
    }


    public static void main(String[] args)
    {

        print(1);
    }
}
