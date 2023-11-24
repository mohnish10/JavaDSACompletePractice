package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class IntersectionOfTwoArrays
{

    public static boolean intersection(int[] arr,int[] arr1)
    {


        for(int i=0;i<arr.length;i++)
        {

            for(int j=0;j<arr1.length;j++)
            {

                if(arr[i]==arr1[j])
                {

                    System.out.print("Common elements present in both the arrays are:- "+arr[i]+" ");

                    return true;

                }

                }
            }

            return false;

        }






    public static void main(String[] args)
    {

        int[] arr = {2,5,6};

        int[] arr1 = {4,8,10,6};

        if(!intersection(arr,arr1))
        {

            System.out.println("There are no common elements present in both the arrays");
        }

    }
}
