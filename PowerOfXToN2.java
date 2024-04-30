package practiceprogramsforjavadsa;

public class PowerOfXToN2
{

    public static int doublePow(int x,int n)
    {

        if(x==0) return 0;

        if(n==0) return 1;

        return x*doublePow(x,n-1);

    }
}
