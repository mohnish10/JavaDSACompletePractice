package practiceprogramsforjavadsa;

import java.util.Scanner;

public class AddDigitsForTwoDigitNumber
{

    public static void main(String[] args)
    {

        System.out.println("Please enter the 2 digit number for which you want to add all the digits");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int unitDigit = num / 10;

        int tenDigit = (num) - (unitDigit*10);

        int sum = unitDigit + tenDigit;

        System.out.println("Unit Digit is:- "+unitDigit);

        System.out.println("Ten's digit is:- "+tenDigit);

        System.out.println("The addition of the digits of the number "+num+" is equal to the sum of unitDigit and tenDigit"+" = "+sum);

    }
}
