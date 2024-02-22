package practiceprogramsforjavadsa;

import java.util.Stack;

public class NextGreaterElementInACircularArray
{

    public static int[] nextGreaterElement(int[] arr)
    {

        Stack<Integer> output = new Stack<>();

        int[] result = new int[arr.length];

        for(int i=2*arr.length-1;i>=0;i--)
        {

            while(!output.isEmpty() && arr[i%arr.length]>=output.peek())
            {

                output.pop();
            }
            if(i<arr.length)
            {

                if(!output.isEmpty())
                {

                    result[i] = output.peek();
                }
                else
                {

                    result[i] = -1;
                }
            }

            output.push(arr[i%arr.length]);
        }


       return result;
    }



    public static void main(String[] args)
    {

        int[] arr = {8,6,7};

        System.out.print("Original array :- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        int[] result = nextGreaterElement(arr);

        System.out.print("Next Greater Elements of the original array :- ");

        for(int i:result)
        {

            System.out.print(i+" ");
        }


    }
}
