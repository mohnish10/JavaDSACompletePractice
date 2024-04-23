package practiceprogramsforjavadsa;

public class Print1To100UsingRecursion
{
    public static void print(int i)
    {

        if(i==101) return;

        System.out.println(i);

        print(i+1);

    }


    public static void main(String[] args)
    {

        print(1);
    }
}
