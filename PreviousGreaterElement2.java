package practiceprogramsforjavadsa;

import java.util.Stack;

public class PreviousGreaterElement2
{

    public static int[] previousGreaterElement(int[] arr)
    {

        int n = arr.length;

        Stack<Integer> stk = new Stack<>();

        int[] result = new int[n];

        for(int i=0;i<n;i++)
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

        int[] arr = {10, 4, 2, 20, 40, 12, 30};

        System.out.print("Original array:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        int[] result = previousGreaterElement(arr);

        for(int i:result)
        {

            System.out.print(i+" ");
        }
    }

}
