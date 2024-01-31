package practiceprogramsforjavadsa;

import java.util.Stack;

public class DailyTemperatures2
{

    public static int[] dailyTemperature(int[] temperatures)
    {

        int n = temperatures.length;

        Stack<Integer> stk = new Stack<>();

        int[] result = new int[n];

        for(int i=0;i<n;i++)
        {

            while(!stk.isEmpty() && temperatures[stk.peek()]<temperatures[i])
            {

                result[stk.peek()] = i-stk.peek();

                stk.pop();
            }

            stk.push(i);
        }

        return result;
    }


    public static void main(String[] args)
    {

        int[] temperatures = {73,74,75,71,69,72,76,73};

        System.out.print("Original array:- ");

        for(int i:temperatures)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        int[] result = dailyTemperature(temperatures);

        for(int i:result)
        {

            System.out.print(i+" ");
        }
    }
}
