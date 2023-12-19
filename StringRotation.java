package practiceprogramsforjavadsa;

public class StringRotation
{

    public static void checkStringRotation(String str1,String str2)
    {

        if(str1.length()!=str2.length())
        {

            System.out.println("String 2 is not a rotation of string1");
        }
        else
        {

            str1 = str1.toLowerCase();

            str2 = str2.toLowerCase();
        }

        str1 = str1 + str1;

        if(str1.contains(str2))
        {

            System.out.println("String 2 is a rotation of string 1");
        }
        else
        {

            System.out.println("String 2 is not a rotation of string 1");
        }


    }


    public static void main(String[] args)
    {

        checkStringRotation("ABCD","ACBD");
    }
}
