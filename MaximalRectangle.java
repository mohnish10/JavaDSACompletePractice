package practiceprogramsforjavadsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MaximalRectangle
{

    public static int areaOfMaximalRectangle(int[][] mat)
    {

        int n = mat.length;

        int m = mat[0].length;

        int[] heights = new int[m];

        for(int i=0;i<m;i++)
        {

            heights[i] = mat[0][i];
        }

        int area = areaOfLargestRectangle(heights);

        for(int i=1;i<n;i++)
        {

            for(int j=0;j<m;j++)
            {

                if(mat[i][j]==1) heights[j]++;
                else heights[j] = 0;

            }

            area = Math.max(area,areaOfLargestRectangle(heights));
        }

        return area;

    }


    public static int areaOfLargestRectangle(int[] histo)
    {

        int n = histo.length;

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











}
