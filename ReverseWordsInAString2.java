package practiceprogramsforjavadsa;

import java.util.Stack;

public class ReverseWordsInAString2
{
    public static String reverseWordsInAString(String s)
        {

            s = s.trim();

            s = s.replaceAll("\\s{2,}"," ");

            String finalResult = "";

            String[] str1 = s.split(" ");

            Stack<String> stk = new Stack<>();

            for(int i=0;i<str1.length;i++)
            {

                stk.push(" ");

                stk.push(str1[i]);

            }

            while(!stk.isEmpty()) {

                finalResult = finalResult+stk.pop();

            }

            return finalResult.trim();

        }


        public static void main(String[] args)
        {

            String str = "the sky is blue";

            System.out.println(reverseWordsInAString(str));
        }
    }


