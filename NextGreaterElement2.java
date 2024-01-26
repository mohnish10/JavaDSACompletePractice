package practiceprogramsforjavadsa;

import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement2
{

    public static int[] nextGreaterElement(int[] arr,int n)
    {

        n = arr.length;

        Stack<Integer> stk = new Stack<>();

        int[] result = new int[n];

        for(int i=n-1;i>=0;i--)
        {

            while(!stk.isEmpty() && arr[i]>=stk.peek())
            {

                stk.pop();
            }

            if(stk.isEmpty())
            {

                result[i]=-1;
            }
            else
            {

                result[i]=stk.peek();
            }

            stk.push(arr[i]);
        }

     return result;

    }


    public static void main(String[] args)
    {

        int[] arr1 = {11, 13, 21, 3};

        int[] result = nextGreaterElement(arr1,arr1.length);

        System.out.println(Arrays.toString(arr1));
    }
}
