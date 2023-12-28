package practiceprogramsforjavadsa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class CeilTheFloor2
{

    // Floor of x is the largest element which is smaller than or equal to x
    // Ceil of x is the smallest element which is greater than or equal to x

    //arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
    //x = 7
    //Floor = 6
    //Ceiling = 8


    public static int ceil2(int[] arr, int target)
    {

        ArrayList<Integer> list = new ArrayList<>();

       for(int i=0;i<arr.length;i++)
       {

           if(arr[i]>=target)
           {

               list.add(arr[i]);
           }
       }

        System.out.println(list);

       int ceil = Collections.min(list);

       if(list.isEmpty())
       {

           ceil = -1;
       }

return ceil;

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the target for which you want to get the ceil");

        int target = sc.nextInt();

        int[] arr = {3, 4, 4, 7, 8, 10};

        int result = ceil2(arr,target);

        System.out.println("The ceil of the target "+target+" is "+result);

    }
}
