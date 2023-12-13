package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement
{

    public static int kthSmallestElement(int[] arr,int k)
    {

        Arrays.sort(arr);

        if(k>arr.length)
        {

            return -1;
        }

        return arr[k-1];
    }


    public static void main(String[] args)
    {

        int[] arr = {7, 10, 4, 3, 20, 15};

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the value for which you want the smallest value");

        int key = sc.nextInt();

        int result = kthSmallestElement(arr,key);

        if(result==-1)
        {

            System.out.println("Mentioned value is out of bounds");
        }
        else
        {

            System.out.println("Kth smallest element is:- "+result);
        }

    }
}
