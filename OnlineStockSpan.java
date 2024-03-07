package practiceprogramsforjavadsa;

import java.util.ArrayList;
import java.util.Collections;


public class OnlineStockSpan
{

    public static int[] findSpans(ArrayList<Integer> price)
    {

        int n = price.size();

        int[] result = new int[n];

        result[0] = 1;

        for(int i=1;i<n;i++)
        {

            int j = i;

            while(j>=0 && price.get(j)<=price.get(i))
            {

                result[i]++;

                j--;

            }

        }

        return result;
    }


//    public static ArrayList<Integer> findSpans(ArrayList<Integer> price)
//    {
//
//        int n = price.size();
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        Stack<Integer> stk = new Stack<>();
//
//        for(int i=0;i<n;i++)
//        {
//
//            while(!stk.isEmpty() && price.get(i)>=stk.peek())
//            {
//
//                stk.pop();
//            }
//
//            if(stk.isEmpty())
//            {
//
//                list.add(i,-1);
//            }
//            else
//            {
//
//                list.add(i,stk.peek());
//            }
//
//            stk.push(i);
//
//        }
//
//        int first = list.get(0);
//
//        int last = list.get(list.size()-1);
//
//        list.set(first,1);
//
//        list.set(last,n);
//
//
//      return list;
//
//    }


    public static void main(String[] args)
    {

        int[] list = {4,2,3,3,7};

        ArrayList<Integer> midList = new ArrayList<>();

        System.out.print("Original ArrayList:- ");

        for(int j:list)
        {

            System.out.print(j+" ");
        }

        for(int i:list)
        {

            midList.add(i);
        }

        System.out.println();

        int[] finalResult = findSpans(midList);

        System.out.print("Result array is:- ");

        for(int i:finalResult)
        {

            System.out.print(i+" ");
        }


//                ArrayList<Integer> result = findSpans(list);
//
//        System.out.print("Result array is:-");
//
//        for(int i:result)
//        {
//
//            System.out.print(i+" ");
//        }



    }




}
