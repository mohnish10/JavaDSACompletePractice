package practiceprogramsforjavadsa;

import java.util.Scanner;

public class CharactersInAString
{

    public static void main(String[] args)
    {

        System.out.println("Please enter the string for which you want the number of characters");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char[] charInput = input.toCharArray();

        System.out.println("The total number of characters in the input string:- "+input+" are "+charInput.length);


    }
}
