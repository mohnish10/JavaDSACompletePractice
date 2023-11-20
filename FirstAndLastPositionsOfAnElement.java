package practiceprogramsforjavadsa;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPositionsOfAnElement
{

    public static void firstAndLastPositions(Integer[] arr, Integer elem)
    {

        List<Integer> list = Arrays.asList(arr);

        int firstPosition = list.indexOf(elem);

        System.out.println("The first position of the element "+elem+ " is "+firstPosition);

        int lastPosition = list.lastIndexOf(elem);

        System.out.println("The last element of the element "+elem+" is "+lastPosition);

    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of the array which you want to create");

        int size = sc.nextInt();

        System.out.println("Please enter the elements of the array");

        Integer[] arr = new Integer[size];

        for(int i=0;i<arr.length;i++)
        {

            arr[i] = sc.nextInt();
        }

        System.out.println("Printing the array");

        for(int i : arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("Please enter the element for which you are trying to find the first and last positions of an array");

        Integer target = sc.nextInt();

        firstAndLastPositions(arr,target);

    }
}
