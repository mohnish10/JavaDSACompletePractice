package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class LowerBoundIOfAnArray
{

    public static void lowerBound(Integer[] arr,int element)
    {

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        int lowerBound = list.indexOf(element);

        System.out.println("The lower bound of the element "+element+" is "+lowerBound);

    }


    public static void upperBound(Integer[] arr,int element)
    {

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        int upperBound = list.lastIndexOf(element);

        System.out.println("The upper bound of the element "+element+" is "+upperBound);
    }


    public static void main(String[] args)
    {

        Integer[] arr = {1,1,1,2,3,3,3,3,4,4};

        lowerBound(arr,3);

        upperBound(arr,3);
    }



}
