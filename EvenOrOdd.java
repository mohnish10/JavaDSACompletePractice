package practiceprogramsforjavadsa;

import java.util.Scanner;

public class EvenOrOdd
{

    public static void main(String[] args)
    {

        System.out.println("Please enter the number which you want to check if it's even or odd");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2==0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }




    }
}
