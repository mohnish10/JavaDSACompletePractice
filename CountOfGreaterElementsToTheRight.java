package practiceprogramsforjavadsa;

import java.util.Scanner;

public class CountOfGreaterElementsToTheRight
{

    public static int countOfGreaterElementsToTheRight(int[] arr,int index)
    {

        int n = arr.length;

        if(index>n) return -1;

        int count = 0;

        for(int i=index+1;i<n;i++)
        {

            count++;
        }

        return count;


    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4};

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the index to find out it's greater elements to the right");

        int index = sc.nextInt();

        int[] queries = new int[index];

        System.out.println("Please enter the queries elements");

        for(int i=0;i<queries.length;i++)
        {

            queries[i] = sc.nextInt();
        }

        for (int query : queries) {

            System.out.print(countOfGreaterElementsToTheRight(arr, query) + " ");
        }


    }

}
