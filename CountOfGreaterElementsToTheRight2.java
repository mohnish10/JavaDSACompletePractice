package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.Stack;

public class CountOfGreaterElementsToTheRight2
{

    public static int countOfGreaterElementsToTheRight(int[] arr,int index)
    {

        int n= arr.length;

        Stack<Integer> stk = new Stack<>();

        for(int i=index+1;i<n;i++)
        {

            if(arr[i]>arr[index])
            {

                stk.push(arr[i]);
            }
        }


        return stk.size();

    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4};

        System.out.print("Original array arr is:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("Please enter the index");

        int k = sc.nextInt();

        int[] queries = new int[k];

        System.out.println("Please enter the queries elements");

        for(int i=0;i<queries.length && queries.length<arr.length;i++)
        {

            queries[i] = sc.nextInt();
        }

        for(int query:queries)
        {

            System.out.print(countOfGreaterElementsToTheRight(arr,query)+" ");

        }





    }
}
