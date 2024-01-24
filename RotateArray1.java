package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;


public class RotateArray1
{

    public static int[] rotateArray(int[] arr,int n)
    {

        List<Integer> list = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();

        n = arr.length;

        for(int i=0;i<1;i++)
        {

            list.add(arr[i]);
        }


        for(int i=1;i<n;i++)
        {

            list1.add(arr[i]);
        }

        list1.addAll(list);

        for(int i=0;i<list1.size();i++)
        {

            arr[i]=list1.get(i);
        }

        return arr;

    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5};

        rotateArray(arr,2);


    }


}
