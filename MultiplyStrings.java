package practiceprogramsforjavadsa;

import java.math.BigInteger;

public class MultiplyStrings
{

    public static String multiplyStrings(String num1,String num2)
    {

        BigInteger num = new BigInteger(num1);

        BigInteger num3 = new BigInteger(num2);

        BigInteger finalProduct = num.multiply(num3);

        String finalProduct1 = finalProduct.toString();

        return finalProduct1;

    }


    public static void main(String[] args)
    {

        String finalResult = multiplyStrings("2","3");

        System.out.println(finalResult);
    }

}
