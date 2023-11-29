package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray1
{

    public static void rotateArray(Integer[] arr,int d)
    {

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        for(int i=0;i<d;i++)
        {

            list.add(list.size()-1,list.get(i));
        }

        for(int i=0;i<d;i++)
        {

            list.remove(list.get(i));
        }

        System.out.println(list);

    }


    public static void main(String[] args)
    {

        Integer[] arr = {1,2,3,4,5};

        rotateArray(arr,2);


    }


}
