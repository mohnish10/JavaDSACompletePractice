package practiceprogramsforjavadsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Collections;

public class NextSmallerElement2
{

    public static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr,int n)
    {

        n = arr.size();

        Stack<Integer> stk = new Stack<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=n-1;i>=0;i--)
        {

            while(!stk.isEmpty() && arr.get(i)<=stk.peek())
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

            stk.push(arr.get(i));
        }


        Collections.reverse(list);

        return list;

    }


    public static void main(String[] args)
    {

        List<Integer> arr1 = Arrays.asList(4, 8, 5, 2, 25);

        ArrayList<Integer> arr2 = new ArrayList<>(arr1);

        System.out.print("Original array:- ");

        for(int i=0;i<arr1.size();i++)
        {

            System.out.print(arr1.get(i)+" ");
        }

        System.out.println();

        ArrayList<Integer> result = nextSmallerElement(arr2,arr2.size());

        for(int i:result)
        {

            System.out.print(i+" ");
        }
    }

}
