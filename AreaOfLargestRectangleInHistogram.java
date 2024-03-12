package practiceprogramsforjavadsa;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class AreaOfLargestRectangleInHistogram
{

    public static int areaOfLargestRectangle(int[] histo,int n)
    {

        n = histo.length;

        if(n==1) return histo[0];

        int[] prevSmaller = previousSmallerElement(histo);

        int[] nextSmaller = nextSmallerElement(histo);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {

            list.add(histo[i]*(nextSmaller[i]-prevSmaller[i]-1));

        }

        int max = Collections.max(list);

        return max;

    }


    public static int[] previousSmallerElement(int[] arr)
    {

        int n = arr.length;

        int[] nge = new int[n];

        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<n;i++)
        {

            while(!stk.isEmpty() && arr[i]<=arr[stk.peek()])
            {

                stk.pop();
            }

            if(stk.isEmpty())
            {

                nge[i] = -1;
            }
            else
            {

                nge[i] = stk.peek();
            }


         stk.push(i);

        }


      return nge;

    }


    public static int[] nextSmallerElement(int[] arr)
    {

        int n = arr.length;

        Stack<Integer> stk = new Stack<>();

        int[] nse = new int[n];

        for(int i=arr.length-1;i>=0;i--)
        {

            while(!stk.isEmpty() && arr[i]<=arr[stk.peek()])
            {

                stk.pop();
            }

            if(stk.isEmpty())
            {

                nse[i] = n;
            }
            else
            {

                nse[i] = stk.peek();
            }


            stk.push(i);

        }


    return nse;

    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,2};

        int[] pse1 = previousSmallerElement(arr);

        int[] nse1 = nextSmallerElement(arr);

        System.out.println(Arrays.toString(pse1));

        System.out.println(Arrays.toString((nse1)));

        System.out.println(areaOfLargestRectangle(arr,arr.length));



    }



}
