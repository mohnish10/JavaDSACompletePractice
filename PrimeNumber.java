package practiceprogramsforjavadsa;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number which you want to check if it's prime");

        int primeNum = sc.nextInt();

        if(primeNum==1 || primeNum==0)
        {

            System.out.println("Not a primeNumber");
        }

        if (primeNum == 2) {

            System.out.println("Number is prime");

        }

        if(primeNum > 1)
        {

            for(int i=2;i<=primeNum/2;i++)
            {

                if(primeNum%i==0)
                {

                    System.out.println("Not a prime");

                    return;
                }
            }
        }

        System.out.println("A prime Number");

    }

    }

