package practiceprogramsforjavadsa;

public class Print100To1UsingRecursion
{
    public static void print(int i)
    {

        if(i==101) return;

        print(i+1);

        System.out.println(i);


    }


    public static void main(String[] args)
    {

        print(1);
    }
}
