package practiceprogramsforjavadsa;

import java.util.Stack;
import java.util.Scanner;

public class CountOfGreaterElementsToTheRight4 
{
    
    public static int[] countGreater(int[] arr,int[] query)
    {
        
        int n = arr.length;
        
        int k = query.length;
        
        int[] result = new int[k];

        Stack<Integer> resultStack = new Stack<>();
        
        for(int i=0;i<k;i++)
        {

            int queryIndex = query[i];

            for(int j=queryIndex+1;j<n;j++)
            {

                if(arr[j]>arr[queryIndex])
                {

                    resultStack.push(arr[j]);
                }
            }

            result[i] = resultStack.size();

            while(!resultStack.isEmpty())
            {

                resultStack.pop();
            }
        }

        return result;
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,3,6,5,8,9,13,4};

        System.out.print("Original array:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("Please enter the size of the query array");

        int index = sc.nextInt();

        int[] query = new int[index];

        System.out.println("Please enter the query elements");

        for(int i=0;i<index;i++)
        {

            query[i] = sc.nextInt();

        }

        int[] result = countGreater(arr,query);

        System.out.println();

        for(int i:result)
        {

            System.out.print(i+" ");
        }

    }
}
