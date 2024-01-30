package practiceprogramsforjavadsa;

import java.util.Stack;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PreviousSmallerElement2
{

    public static List<Integer> previousSmallerElement(int n,int[] a)
    {

        n = a.length;

        Stack<Integer> stk = new Stack<>();

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {

            while(!stk.isEmpty() && a[i]<=stk.peek())
            {

                stk.pop();
            }

            if(stk.isEmpty())
            {

                list.add(-1);

            }
            else
            {

                list.add(stk.peek());
            }

            stk.push(a[i]);
        }

        return list;
    }


    public static void main(String[] args)
    {

        int[] arr = {1, 5, 0, 3, 4, 5};

        System.out.print("Original array:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        List<Integer> list = previousSmallerElement(arr.length,arr);

        System.out.println(list);
    }
}
