package practiceprogramsforjavadsa;

import java.util.Scanner;

public class SearchElementInARotatedAndSortedArray
{

    public static int searchElementInARotatedAndSortedArray(int[] finalArray,int x)
    {

        for(int i=0;i<finalArray.length;i++)
        {

            if(finalArray[i]==x)
            {

                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args)
    {

        int[] arr = {3,4,6,7,8,9,0,1,2};

        System.out.print("Original Array is:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the element which you want to search:- ");

        int key = sc.nextInt();

        int res = searchElementInARotatedAndSortedArray(arr,key);

        if(res==-1)
        {

            System.out.println("Element "+key+" is not present in the array");
        }
        else
        {

            System.out.println("Element "+key+"found at index:- "+res);
        }

    }
}
