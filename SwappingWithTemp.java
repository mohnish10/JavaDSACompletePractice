package practiceprogramsforjavadsa;

public class SwappingWithTemp
{

    public static void main(String[] args)
    {

        int a=10,b=20,temp=0;

        System.out.println("Original value of a is:- "+a+" and the original value of b is:- "+b);

        temp = a;

        a = b;

        b = temp;

        System.out.println("Swapped value of a is:- "+a+" and the swapped value of b is:- "+b);
    }
}
