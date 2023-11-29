package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray
{

    public static void rotateArray(int[] arr,int d)
    {

        System.out.println("Original array is:- ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

        int[] temp = new int[d];

        for(int i=0;i<d;i++)
        {

            temp[i]=arr[i];
        }

        for(int i=d;i<arr.length;i++)
        {

            arr[i-d] = arr[i];
        }

        for(int i=0;i<d;i++)
        {

            arr[i+arr.length-d] = temp[i];
        }

        System.out.println("Final rotated array is:- ");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5};

        rotateArray(arr,1);
    }











}
