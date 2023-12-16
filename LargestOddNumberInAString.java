package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LargestOddNumberInAString
{
    public static void largestOddNumberInAString(String str)
    {

        int num = Integer.parseInt(str);

        List<Integer> list = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();

        while(num!=0)
        {

            Integer digit = num%10;

            num = num/10;

            list.add(digit);

        }

        for(int i=0;i<list.size();i++)
        {

            if(list.get(i)%2!=0)
            {

                list1.add(list.get(i));

            }
        }

        if(list1.isEmpty())
        {

            System.out.println("There are no odd numbers present in the integer");

        }

        int largestOddNumber = 0;

            for (int i = 0; i < list1.size(); i++) {

                if (largestOddNumber < list1.get(i)) {

                    largestOddNumber = list1.get(i);

                    System.out.println("The largest odd number in the integer is:- "+largestOddNumber);
                }

            }

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string to check the largest odd number");

        String str = sc.next();

        for(int i=0;i<str.length();i++)
        {

            if(!(str.charAt(i)>=48 && str.charAt(i)<=57))
            {

                System.out.println("Not a valid string!!! Please enter a valid string to check for the largest odd number");

                return;

            }

        }

        largestOddNumberInAString(str);
    }
}
