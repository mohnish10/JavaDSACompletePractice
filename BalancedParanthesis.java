package practiceprogramsforjavadsa;

import java.util.Stack;
import java.util.Scanner;

public class BalancedParanthesis
{

    public static boolean balancedParanthesis(String str)
    {

        char[] charArray = str.toCharArray();

        Stack<Character> stk = new Stack<>();

        for(int i=0;i<charArray.length;i++) {

            char currentCharacter = charArray[i];

            if (currentCharacter == '(' || currentCharacter == '{' || currentCharacter == '[') {

                stk.push(currentCharacter);
            } else {

                if (stk.isEmpty()) {

                    return false;
                }

                currentCharacter = stk.pop();

                if (currentCharacter == charArray[i]) {

                    return true;

                }

            }

        }

        return stk.isEmpty();

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string to check the brackets");

        String str = sc.next();

        if(balancedParanthesis(str))
        {

            System.out.println("Brackets are balanced");
        }
        else
        {

            System.out.println("Brackets are not balanced");
        }
    }



}
