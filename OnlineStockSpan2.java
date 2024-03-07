package practiceprogramsforjavadsa;

import java.util.ArrayList;
import java.util.Stack;

public class OnlineStockSpan2
{

    public static ArrayList<Integer> findSpans(ArrayList<Integer> price)
    {

      int n = price.size();

      int[] result = new int[n];

      Stack<Integer> stk = new Stack<>();

      for(int i=0;i<n;i++) {

          while (!stk.isEmpty() && price.get(stk.peek()) <= price.get(i)) {

              stk.pop();

          }

              if (stk.isEmpty()) {

              result[i] = i + 1;
          } else {

              result[i] = i - stk.peek();
          }

          stk.push(i);
      }

      ArrayList<Integer> list = new ArrayList<>();

      for(int i=0;i<result.length;i++)
      {

          list.add(result[i]);
      }

      return list;

    }


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

        ArrayList<Integer> finalResult = findSpans(midList);

        System.out.print("Result array is:- ");

        for(int i:finalResult)
        {

            System.out.print(i+" ");
        }

    }
}
