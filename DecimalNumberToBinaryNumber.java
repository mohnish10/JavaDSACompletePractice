package practiceprogramsforjavadsa;

import java.util.Scanner;

public class DecimalNumberToBinaryNumber 
{
    
    public static void decimalToBinary(int num)
    {

        System.out.println(Integer.toBinaryString(num));
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number whch you want to convert binary");

        int num = sc.nextInt();

        decimalToBinary(num);
    }
}
