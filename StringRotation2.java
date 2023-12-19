package practiceprogramsforjavadsa;

public class StringRotation2
{

    public static void allRotationsOfAString(String str1) {

        str1 = str1.toLowerCase();

        StringBuffer sb1 = new StringBuffer(str1);

        sb1.append(str1);

        for (int i = 0; i < str1.length(); i++) {

            for (int j = 0; j < str1.length(); j++)

                System.out.print(sb1.charAt(i + j));

                System.out.println();


        }

    }



    public static void main(String[] args)
    {

        allRotationsOfAString("geeks");

    }
}
