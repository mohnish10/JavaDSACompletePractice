package practiceprogramsforjavadsa;

public class UniqueOutput
{

    public static void main(String[] args)
    {

        String str1 = "a";

        int count = 2;

        str1 = str1.repeat(2);

        String str2 = "b";

        int count1 = 3;

        str2 = str2.repeat(count1);

        String str3 = "c";

        int count2 = 4;

        str3 = str3.repeat(count2);

        String finalOutput = str1.concat(str2).concat(str3);

        System.out.println("Final Output:- "+finalOutput);


    }
}
