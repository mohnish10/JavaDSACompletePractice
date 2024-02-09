package practiceprogramsforjavadsa;

import java.util.*;


public class RemoveDuplicateLetters
{

    public static String removeDuplicateLetters(String s)
    {

        Set<Character> visited = new HashSet<>();

        HashMap<Character,Integer> map = new HashMap<>();

        Stack<Character> stk = new Stack<>();

        for(int i=0;i<s.length();i++)
        {

            map.put(s.charAt(i),i);
        }

        for(int i=0;i<s.length();i++)
        {

            if(visited.contains(s.charAt(i))) continue;

            while(!stk.isEmpty() && map.get(stk.peek()) > i && stk.peek()>s.charAt(i))
            {

                visited.remove(stk.peek());

                stk.pop();
            }

            stk.push(s.charAt(i));

            visited.add(s.charAt(i));

        }

        StringBuilder sb = new StringBuilder();

        while(!stk.isEmpty())
        {

            sb.append(stk.pop());
        }


        return sb.reverse().toString();

    }



    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string");

        String str = sc.next();

        String ans = removeDuplicateLetters(str);

        System.out.println(ans);
    }
}
