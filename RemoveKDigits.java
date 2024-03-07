package practiceprogramsforjavadsa;

import java.util.Stack;

public class RemoveKDigits
{

    public static String removeDigits(String num,int k)
    {

        if(k==0) return num;

        if(k==num.length()) return "0";

        Stack<Character> stk = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<num.length();i++) {

            char c = num.charAt(i);

            while(!stk.isEmpty() && k>0 && Character.getNumericValue(stk.peek())>Character.getNumericValue(c))
            {

                stk.pop();

                k--;

            }

            if(!stk.isEmpty() || c!='0')
            {

                stk.push(c);
            }

        }

        if(stk.isEmpty()) return "0";

        while(!stk.isEmpty() && k>0)
        {

            stk.pop();

            k--;

        }

        while(!stk.isEmpty())
        {

            sb.append(stk.pop());
        }

        if(sb.toString().isEmpty()) return "0";

        return sb.reverse().toString();

    }
}
